/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author tian lai zhu
 */
public class DoubleCharPepeZhu {
public String doubleChar(String str) {
//Constructor por defecto. El nuevo String toma el valor ""
String copio = new String(); 
for(int i = 0; i < str.length();i++){
// str.charAt (i) devuelve el carácter que está en la posición i.
//Resuelve el problema de copia la letra anterior.
copio = copio + str.charAt(i) + str.charAt(i);
}
return copio;

}
}