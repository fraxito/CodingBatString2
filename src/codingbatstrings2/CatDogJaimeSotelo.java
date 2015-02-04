package codingbatstrings2;
/*
 * Autor: Sote
 */
public class CatDogJaimeSotelo {
   public boolean catDog (String str) {
    int cat = 0;
    int dogs= 0;
  for (int i=0; i<str.length()-2; i++) {
   if (str.substring(i, i+3).equals("cat"));
            cat += 1;
   if (str.substring(i, i+3).equals("dog"))
            dogs += 1;
                }
   return cat==dogs;
   }
   
 
