/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author javier
 */
public class XyzMiddleJavierGonzalez {
    public boolean xyzMiddle(String str) {
  
        int letras = str.length();
    if (letras < 3) return false;
    if (letras % 2 == 1)
        return str.substring(letras/2 - 1, letras/2 + 2).equals("xyz");
    return str.substring(letras/2 - 2, letras/2 + 1).equals("xyz") 
            || str.substring(letras/2 - 1, letras/2 + 2).equals("xyz");
}   
}
