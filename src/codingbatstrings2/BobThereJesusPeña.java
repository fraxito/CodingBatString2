/*
Ejercicio BobThere Jesus Peña Gonzalez
 */
package codingbatstrings2;


public class BobThereJesusPeña {
    //El ejercicio debe de darnos verdadero cuando el string contenga la palabra
    //bob dentro de el,y tambien cuando podamos cambiar la o de bob por cualquier
    //otro caracter.
    
public boolean bobThere(String str) {
    //A continuacion introducimos un int que es igual a la
    //longitud del string...
  int lenght = str.length();
   //segun el cual,cuando i es igual a 0 debemos de ver i menos -2 puesto
  //que deseamos que i sea la misma en la posición 0 y la menos 2.
  for (int i = 0; i < lenght - 2; i++) {
// si coincide esta i a la que llamamos b(buscamos la palabra bob)
      //con la siguiente b que debe de situarse en las posiciones 0 y menos 2,
      //nos debe devolver true.  
    if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
    return true;
  }
  //sino devuelve falso.
  return false;
}
}
