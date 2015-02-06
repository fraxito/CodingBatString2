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
public class CountCodeBorjaSolis {
    
    public int countCode(String str) {
    int count = 0;
    for (int i = 0; i < str.length()-3; i++)
        if (str.charAt(i) == 'c' && str.charAt(i+1) == 'o'
        && str.charAt(i+3) == 'e')
            count++;
    return count;
}
    
    
}
