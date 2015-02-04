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
public class XyzThereYoelCano {
    public boolean xyzThere(String str) {
        if(str.contains("xyz")){
            if(str.contains(".xyz")){
                return false;
            }
            else{
                return true;
            }
        }  
        else{
            return false;
        }  
    }
}

