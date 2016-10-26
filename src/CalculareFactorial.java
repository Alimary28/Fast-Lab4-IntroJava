/**
 * Created by Vaio on 26.10.2016.
 */
public class CalculareFactorial {

    public static void main(String[] args) {

        int factorial = fact(7);
        System.out.println("Fcatorialul numarului 7 este :" +factorial);
    }
    static int fact (int a){
        int rezultat ;
        if (a == 1){
            return 1;
        }
        rezultat = fact(a-1)*a;
        return rezultat;
    }
}
