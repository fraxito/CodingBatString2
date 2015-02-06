/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author Guillermo F
 */
public class MixStringsGuillermoFernandez {
    public String mixString(String a, String b) 
{
    String resultado="";
    int i;
    for(i=0;i<a.length() && i<b.length();i++)
     {
            resultado=resultado+a.charAt(i);
            resultado=resultado+b.charAt(i);

     }
    if(a.length()<b.length())
    {
            resultado=resultado+b.substring(i);
    }
    else resultado=resultado+a.substring(i);

    return resultado;

}
    
}
