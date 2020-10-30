using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class buttonFunc : MonoBehaviour
{
    public GameObject beretModel;
    public GameObject stripModel;
    public GameObject markModel;

    public GameObject FunnyMask_pig;
    public GameObject FunnyMask_cat;

    public GameObject valueText;

    public GameObject exp;
    public GameObject value1;
    public GameObject value2;


    public GameObject pos1;
    public GameObject pos2;

    public GameObject light1;
    public GameObject light2;
    public GameObject light3;

    void Start()
    {
        exp.SetActive(false);
        value1.SetActive(false);
        value2.SetActive(false);
        FunnyMask_pig.SetActive(false);
        FunnyMask_cat.SetActive(false);
    }
    public void OnClickResult()
    {
        float distanceTo = pos1.transform.position.x - pos2.transform.position.x;
       
        Debug.Log(distanceTo);

        if (0.066f >= distanceTo)
        {
            value1.gameObject.GetComponent<Text>().text = "특대두";
        }
        if (0.066f < distanceTo && 0.074f >= distanceTo)
        {
            value1.gameObject.GetComponent<Text>().text = "대두";
        }

        else if(0.074f < distanceTo && 0.082f >= distanceTo)
        {
            value1.gameObject.GetComponent<Text>().text = "중두";
        }

        else if (0.082f < distanceTo && 0.090f >= distanceTo)
        {
            value1.gameObject.GetComponent<Text>().text = "소두";
        }

        else if (0.090f < distanceTo)
        {
            value1.gameObject.GetComponent<Text>().text = "특소두";
        }

        exp.SetActive(true);
        value1.SetActive(true);
        value2.SetActive(true);
    }
    public void OnClickFunny()
    {
        FunnyMask_cat.SetActive(false);
        stripModel.SetActive(false);
        markModel.SetActive(false);
        beretModel.SetActive(false);

        FunnyMask_pig.SetActive(true);

        light1.SetActive(false);
    }

    public void OnClickFunny_beret()
    {
        FunnyMask_cat.SetActive(false);
        FunnyMask_pig.SetActive(false);

        light1.SetActive(true);
        light2.SetActive(true);
        light3.SetActive(true);

        stripModel.SetActive(true);
        markModel.SetActive(true);
        beretModel.SetActive(true);
    }

    public void OnClickFunny_cat()
    {
        FunnyMask_pig.SetActive(false);
        stripModel.SetActive(false);
        markModel.SetActive(false);
        beretModel.SetActive(false);

        light1.SetActive(false);

        Debug.Log("성공");

        FunnyMask_cat.SetActive(true);
    }

    public void OnClickQuit()
    {
        Application.Quit();
    }
}
