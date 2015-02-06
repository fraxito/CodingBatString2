/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author Propietario
 */
public class EndOther_ManuelSB {
    
    public boolean endOther(String a, String b) {
        
        // uso el a.toLowercase() para convertir todo a minusculas y que no dé error al alternar mayus y minus
        
    a = a.toLowerCase();
    b = b.toLowerCase();
    
    // Hago un test para cada string
    
    boolean test1 = a.length() >= b.length() 
            && a.substring(a.length() - b.length()).equals(b);
    
    boolean test2 = b.length() >= a.length() 
            && b.substring(b.length() - a.length()).equals(a);
    
    
    

    return test1 || test2;
      
}
}
