/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author xp
 */
public class GetSandwich {
     
    public String getSandwich(String str) {
        
        if(str.indexOf("bread")==str.lastIndexOf("bread")){
            return "";
        }
        return(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));
          
        
    }

}
