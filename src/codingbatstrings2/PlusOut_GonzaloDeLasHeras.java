/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author Gonzalo
 */
public class PlusOut_GonzaloDeLasHeras {

    public String plusOut(String str, String word) {
        String resul = "";
        int tam = word.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word.charAt(0) && str.substring(i, i + tam).equals(word)) {
                resul = resul + word;
                i = i + tam - 1;
            } else {
                resul = resul + "+";
            }
        }
        return resul;
    }

}
