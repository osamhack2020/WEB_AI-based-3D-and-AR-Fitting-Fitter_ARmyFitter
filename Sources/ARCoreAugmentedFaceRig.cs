namespace GoogleARCore.Examples.AugmentedFaces
{
    using System.Collections.Generic;
    using GoogleARCore;
    using UnityEngine;
    
    [ExecuteInEditMode]
    public class ARCoreAugmentedFaceRig : MonoBehaviour
    {
        public bool AutoBind = false;
        private static readonly Dictionary<AugmentedFaceRegion, string> k_RegionTransformNames =
            new Dictionary<AugmentedFaceRegion, string>()
            {
                { AugmentedFaceRegion.NoseTip, "NOSE_TIP" },
                { AugmentedFaceRegion.ForeheadLeft, "FOREHEAD_LEFT" },
                { AugmentedFaceRegion.ForeheadRight, "FOREHEAD_RIGHT" }
            };
        private AugmentedFace m_AugmentedFace;
        private List<AugmentedFace> m_AugmentedFaceList = new List<AugmentedFace>();
        private Dictionary<AugmentedFaceRegion, Transform> m_RegionGameObjects =
            new Dictionary<AugmentedFaceRegion, Transform>();        
        public AugmentedFace AumgnetedFace
        {
            get
            {
                return m_AugmentedFace;
            }

            set
            {
                m_AugmentedFace = value;
                Update();
            }
        }
        public void Awake()
        {
            m_AugmentedFaceList = new List<AugmentedFace>();
            _InitializeFaceRegions();
        }        
        public void Update()
        {
            if (!Application.isPlaying)
            {
                return;
            }

            if (AutoBind)
            {
                m_AugmentedFaceList.Clear();
                Session.GetTrackables<AugmentedFace>(m_AugmentedFaceList, TrackableQueryFilter.All);
                if (m_AugmentedFaceList.Count != 0)
                {
                    m_AugmentedFace = m_AugmentedFaceList[0];
                }
            }

            if (m_AugmentedFace == null)
            {
                return;
            }

            _UpdateRegions();
        }
        private void _InitializeFaceRegions()
        {
            foreach (AugmentedFaceRegion region in k_RegionTransformNames.Keys)
            {
                string name = k_RegionTransformNames[region];
                Transform regionTransform = _FindChildTransformRecursive(transform, name);
                if (regionTransform == null)
                {
                    GameObject newRegionObject = new GameObject(name);
                    newRegionObject.transform.SetParent(transform);
                    regionTransform = newRegionObject.transform;
                }
                m_RegionGameObjects[region] = regionTransform;
            }
        }
        private Transform _FindChildTransformRecursive(Transform target, string name)
        {
            if (target.name == name)
            {
                return target;
            }

            foreach (Transform child in target)
            {
                if (child.name.Contains(name))
                {
                    return child;
                }

                Transform result = _FindChildTransformRecursive(child, name);
                if (result != null)
                {
                    return result;
                }
            }
            return null;
        }
        private void _UpdateRegions()
        {
            bool isTracking = m_AugmentedFace.TrackingState == TrackingState.Tracking;

            if (isTracking)
            {
                // Update the root transform;
                transform.position = m_AugmentedFace.CenterPose.position;
                transform.rotation = m_AugmentedFace.CenterPose.rotation;
            }

            foreach (AugmentedFaceRegion region in m_RegionGameObjects.Keys)
            {
                Transform regionTransform = m_RegionGameObjects[region];
                regionTransform.gameObject.SetActive(isTracking);
                if (isTracking)
                {
                    Pose regionPose = m_AugmentedFace.GetRegionPose(region);
                    regionTransform.position = regionPose.position;
                    regionTransform.rotation = regionPose.rotation;
                }
            }
        }
    }
}
