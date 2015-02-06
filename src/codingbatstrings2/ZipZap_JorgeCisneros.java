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
public class ZipZap_JorgeCisneros {

    //zipZap("zipXzap") → "zpXzp"
    //zipZap("zopzop") → "zpzp"
    //zipZap("zzzopzop") → "zzzpzp"
    
    public String zipZap(String str) {      
        String aux = ""; 
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'z'){
                if ((i+2) < str.length()){
                    if (str.charAt(i+2) == 'p'){
                        aux = aux + str.charAt(i);
                        aux = aux + str.charAt(i+2);
                        i++;
                        i++;
                    }else{aux = aux + str.charAt(i);}
                }else{aux = aux + str.charAt(i);}
            }
            else{aux = aux + str.charAt(i);}
        } 
        return aux;
    }
}
