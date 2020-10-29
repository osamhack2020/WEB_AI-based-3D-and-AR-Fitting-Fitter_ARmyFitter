using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TouchMgr : MonoBehaviour
{
    private Camera ARCam;
    private Ray ray;
    private RaycastHit hit;

    // Start is called before the first frame update
    void Start()
    {
        ARCam = GameObject.Find("First Person Camera").GetComponent<Camera>();
    }

    // Update is called once per frame
    void Update()
    {
        if(Input.touchCount > 0 && Input.GetTouch(0).phase == TouchPhase.Began)
        {
            ray = ARCam.ScreenPointToRay(Input.GetTouch(0).position);

            if(Physics.Raycast(ray, out hit, 100.0f, 1 << 8))
            {
               
            }
        }


    }
}