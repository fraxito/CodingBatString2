/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author Roberto Herranz
 */
public class RepeatSeparatorRobertoHerranz {

    public String repeatSeparator(String word, String sep, int count) {
        String hola = "";
        for (int i = 0; i < count; i++) {
            if (i < count - 1) {
                hola += word + sep;
            } else {
                hola += word;
            }
        }
        return hola;
    }

}
