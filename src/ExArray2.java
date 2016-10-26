/**
 * Created by Vaio on 22.10.2016.
 */
public class ExArray2 {
    public static void main(String[] args) {

        int[] sir = {45, 16, 47, 28, 9, 324, 211, 37};
        int numarCautat = 9;
        int i;
        boolean foundIt = false;


        for ( i = 0; i < sir.length; i++) {
            if (sir[i] == numarCautat) {
                foundIt = true;
                break;
            }

        }
        if (foundIt) {
            System.out.println("Found" + numarCautat + "at index" + i);
        } else {

            System.out.println(numarCautat + "not in the array");
        }
    }
}