/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codingbatstrings2;

/**
 *
 * @author dlopezconde
 */
public class MixStringDanielLopez {
   public String mixString(String a, String b) {
        String res="";
    int i;
    for(i=0;i<a.length() && i<b.length();i++)
     {
           res=res+a.charAt(i);
           res=res+b.charAt(i);
    }
    if(a.length()<b.length())
    {
            res=res+b.substring(i);
    }
    else{
        res=res+a.substring(i);
    }
    return res;

     

  
       
  
}

    
}
