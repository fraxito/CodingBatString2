/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

import java.util.Iterator;

/**
 *
 * @author Sergio Herrero
 */
public class RepeatFrontSergioHerrero {
 public String repeatFront(String str, int n) {
    String res = "";
    for (int i = n; i > 0; i--)
        res += str.substring(0, i);
    return res;
}

}
