/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author Marlene
 */
public class XYBalanceAdrianMartin {
  

    
    
     
    public boolean xyBalance(String str) {
    
    int balance = 0;
    int numeroPos = str.length();
    boolean solucion = true;
    
  
        
    for (int i = 0; i < numeroPos; i++){
        
    if(str.charAt(i) == 'x')
        
        balance++; 
      
    if(str.charAt(i) == 'y'){
      
       balance = 0;
        
      }        
        
}
    if (balance != 0 ){
    
    solucion = false;
    }
      
    
    return  solucion;       
    
    }
    
}