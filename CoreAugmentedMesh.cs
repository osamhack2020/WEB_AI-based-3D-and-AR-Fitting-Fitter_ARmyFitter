    [RequireComponent(typeof(MeshFilter))]
    public class CoreFilter : MonoBehaviour
    {
        public bool AutoBind = false;
        private Augmented m_Augmented = null;
        private List<Augmented> m_AugmentedList = null;    
        private List<Vector3> m_MeshVertices = new List<Vector3>();
        private List<Vector3> m_MeshNormals = new List<Vector3>();
        private List<Vector2> m_MeshUVs = new List<Vector2>();
        private List<int> m_MeshIndices = new List<int>();
        private Mesh m_Mesh = null;
        private bool m_MeshInitialized = false;
        public Augmented Aumgneted
        {
            get
            {
                return m_Augmented;
            }

            set
            {
                m_AugmentedFace = value;
                Update();
            }
        }    
        public void Awake()
        {
            m_Mesh = new Mesh();
            GetComponent<MeshFilter>().mesh = m_Mesh;
            m_AugmentedList = new List<Augmented>();
        }
        public void Update()
        {
            if (AutoBind)
            {
                m_AugmentedList.Clear();
                Session.GetTrackables<Augmented>(m_AugmentedList, TrackableQueryFilter.All);
                if (m_AugmentedList.Count != 0)
                {
                    m_Augmented = m_AugmentedList[0];
                }
            }
            if (m_Augmented == null)
            {
                return;
            }
            transform.position = m_Augmented.CenterPose.position;
            transform.rotation = m_Augmented.CenterPose.rotation;
            _UpdateMesh();
        }
        private void _UpdateMesh()
        {
            m_Augmented.GetVertices(m_MeshVertices);
            m_Augmented.GetNormals(m_MeshNormals);
            if (!m_MeshInitialized)
            {
                m_Augmented.GetTextureCoordinates(m_MeshUVs);
                m_Augmented.GetTriangleIndices(m_MeshIndices);
                m_MeshInitialized = true;
            }
            m_Mesh.Clear();
            m_Mesh.SetVertices(m_MeshVertices);
            m_Mesh.SetNormals(m_MeshNormals);
            m_Mesh.SetTriangles(m_MeshIndices, 0);
            m_Mesh.SetUVs(0, m_MeshUVs);
            m_Mesh.RecalculateBounds();
        }
    }
}
