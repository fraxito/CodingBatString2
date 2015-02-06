package codingbatstrings2;

/**
 *
 * @author krotxe
 */
public class CatDog_FranciscoJavierCroche {

    /**
     * Éste glorioso método lee la cadena "str" y busca en ella si contiene los
     * caracteres de las cadenas "str2" y "str3" Tengo gripe y no me apetece
     * comentar nada mas.
     */
    public boolean catDog(String str) {
        int gatu = 0;
        int perru = 0;
        String str2 = "cat";
        String str3 = "dog";

        for (int i = 0; i < str.length(); i++) {
            if (str.regionMatches(i, str2, 0, 3)) {

                gatu++;

            }
            if (str.regionMatches(i, str3, 0, 3)) {

                perru++;
            }
        }

        if (gatu == perru) {
            return true;
        } else {
            return false;
        }

    }

}
