using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement;

public class AR_ConfirmBtn : MonoBehaviour
{
    public GameObject RecomInput_value;
    public GameObject notice;
    public int value;
    public void OnClickConfirm()
    {    
        string numString = RecomInput_value.gameObject.GetComponent<Text>().text;
        int number;
        if(int.TryParse(numString, out number))
        {
            value = int.Parse(RecomInput_value.gameObject.GetComponent<Text>().text);

            if (value > 49 && value < 62)
            {
                SceneManager.LoadScene("AugmentedFaces_m2_9");
            }
            else
            {
                notice.gameObject.GetComponent<Text>().text = "정확한 수치를 입력하세요!";
            }
        }
        else
        {
            notice.gameObject.GetComponent<Text>().text = "숫자만 입력하세요!";
        }        
    }
    public void OnClickQuit()
    {
        Application.Quit();
    }
}
