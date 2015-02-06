/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author MARCOS
 */
public class PrefixAgainMarcosGonzalez {
    public boolean prefixAgain(String str, int n) {
        String prefijo = str.substring(0,n);
        for (int i = n; i < str.length(); i++) {
            if(n+i <= str.length()) {
                if (prefijo.equals(str.substring(i,n+i)))
                return true;
            } 
        }
        return false;
    }

    
}
