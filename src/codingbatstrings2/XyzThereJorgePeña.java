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
public class XyzThereJorgePeña {
    public boolean xyzThere(String str){
        for(int cuenta = 0; cuenta < str.length()-2; cuenta++){
            if(str.substring(cuenta,cuenta+3).equals("xyz")){
                if(cuenta > 0 && str.substring(cuenta-1, cuenta).equals(".")) 
                    continue;
                    return true;
            }
        }
        return false;
    }
}    