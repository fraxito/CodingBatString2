/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author luisfeliz
 */
public class StartOutLuisAlbertoFeliz {
   
    public String starOut(String str) {

String resultado = ""; 
for(int i = 0; i < str.length(); i++){

    if(str.charAt(i)=='*'){
   

    }
     else if(i != 0 && str.charAt(i-1)=='*'){ 
      
     } 
     
    else  if(i != str.length() - 1 && 
    str.charAt(i+1)=='*')  {
     } 
    
    else { 
    resultado += str.charAt(i); 
        
    } 
 } 
    return resultado; 
    
    }
}