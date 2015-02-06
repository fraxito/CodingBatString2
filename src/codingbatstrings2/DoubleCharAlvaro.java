/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 * DoubleChar
 * Tiene que sonseguir dubplicar los char
 * 
 * @author alvaro
 * 
 */
public class DoubleCharAlvaro {
 public String doubleChar(String str) {
     //creo una variable
     String xdos = "";
     for(int  i = 0; i <= str.length()-1;i++){
     // variable mas la variable en i    
     xdos += str.charAt(i);
     xdos += str.charAt(i);
     }
     //muestra el resultado
     return xdos;

  
}

    
}
