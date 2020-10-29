using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI ;
public class pointDistance : MonoBehaviour
{

    public GameObject pos1;
    public GameObject pos2;
    public GameObject text;
    // Update is called once per frame

    void Start()
    {
        // text.gameObject.GetComponent<Text>().text = "armyTest";
    }
    void Update()
    {
        float distanceTo = pos1.transform.position.x - pos2.transform.position.x;

        float valueChange = (1 - distanceTo) * 100; 

        text.gameObject.GetComponent<Text>().text = valueChange.ToString();
        Debug.Log(distanceTo);
    }

}
