/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author Dani
 */
public class WordEndsDanielYubero {
     
    
   public String wordEnds(String str, String word){
       //si la palabra es igual o mayor que el enunciado no se retorna nada
        if(word.length() >= str.length()) return "";
       String resultado = "";
        for(int i = -1; i < str.length()-word.length(); i++){
            if(str.substring(i+1, i+word.length()+1).equals(word)){
                if(i != -1) resultado+=str.substring(i,i+1);
                if(i + word.length() < str.length()-1) resultado += str.substring(i+1+word.length(), i+2+word.length());
            }
        }
        return resultado;
    }
    
}
