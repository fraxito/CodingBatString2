/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author xp
 */

/*
Autor: Luis Guillermo Abarca
Ejercicio: 
Given a string, return a string where for every char in the original, there are two chars. 

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
*/
public class DoubleChar_Abarca {
    
    public String doubleChar(String str) {
        String copiaCadena = "";
          char auxiliar;
        for(int i=0; i<str.length();i++){
         auxiliar = str.charAt(i);
         copiaCadena =copiaCadena +auxiliar + auxiliar;
        }       
      return copiaCadena;
    }
    
}
