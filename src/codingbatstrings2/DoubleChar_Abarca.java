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
