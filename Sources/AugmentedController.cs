namespace GoogleARCore.Examples.AugmentedFaces
{
    using System.Collections.Generic;
    using GoogleARCore;
    using UnityEngine;
    using UnityEngine.UI;
    public class AugmentedFacesExampleController : MonoBehaviour
    {
        public GameObject FaceAttachment;
        private bool m_IsQuitting = false;

        private List<AugmentedFace> m_TempAugmentedFaces = new List<AugmentedFace>();
        public void Awake()
            Application.targetFrameRate = 60;
        }
        public void Update()
        {
            _UpdateApplicationLifecycle();
            Session.GetTrackables<AugmentedFace>(m_TempAugmentedFaces, TrackableQueryFilter.All);
            if (m_TempAugmentedFaces.Count == 0)
            {
                Screen.sleepTimeout = SleepTimeout.SystemSetting;
                FaceAttachment.SetActive(false);
            }
            else
            {
                Screen.sleepTimeout = SleepTimeout.NeverSleep;
                FaceAttachment.SetActive(true);
            }
        }
        private void _UpdateApplicationLifecycle()
        {
            // Exit the app when the 'back' button is pressed.
            if (Input.GetKey(KeyCode.Escape))
            {
                Application.Quit();
            }
            if (m_IsQuitting)
            {
                return;
            }
            // Quit if ARCore was unable to connect and give Unity some time for the toast to
            // appear.
            if (Session.Status == SessionStatus.ErrorPermissionNotGranted)
            {
                _ShowAndroidToastMessage("Camera permission is needed to run this application.");
                m_IsQuitting = true;
                Invoke("_DoQuit", 0.5f);
            }
            else if (Session.Status.IsError())
            {
                _ShowAndroidToastMessage(
                    "ARCore encountered a problem connecting.  Please start the app again.");
                m_IsQuitting = true;
                Invoke("_DoQuit", 0.5f);
            }
        }
        /// <summary>
        /// Actually quit the application.
        /// </summary>
        private void _DoQuit()
        {
            Application.Quit();
        }
        /// <summary>
        /// Show an Android toast message.
        /// </summary>
        /// <param name="message">Message string to show in the toast.</param>
        private void _ShowAndroidToastMessage(string message)
        {
            AndroidJavaClass unityPlayer =
                new AndroidJavaClass("com.unity3d.player.UnityPlayer");
            AndroidJavaObject unityActivity =
                unityPlayer.GetStatic<AndroidJavaObject>("currentActivity");

            if (unityActivity != null)
            {
                AndroidJavaClass toastClass = new AndroidJavaClass("android.widget.Toast");
                unityActivity.Call("runOnUiThread", new AndroidJavaRunnable(() =>
                {
                    AndroidJavaObject toastObject = toastClass.CallStatic<AndroidJavaObject>(
                        "makeText", unityActivity, message, 0);
                    toastObject.Call("show");
                }));
            }
        }
    }
}
