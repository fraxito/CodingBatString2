/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author Jorge
 */
public class BobThere_JorgeAndres {

    public boolean bobThere(String str) {
        int primeraB = str.indexOf("b");
        int segundaB = str.indexOf("b", primeraB+1);
        String bEnString = "a";
        String b2EnString = "a";
        if (primeraB + 3 <= str.length()) {
            bEnString = str.substring((primeraB + 2), (primeraB + 3));
            if (segundaB + 3 <= str.length()){
                b2EnString = str.substring((segundaB + 2), (segundaB + 3));
            }
        } else {
            return false;
        }
        if (bEnString.equals("b") ||b2EnString.equals("b") ) {
            return true;
        } else {
            return false;
        }
    }

}
