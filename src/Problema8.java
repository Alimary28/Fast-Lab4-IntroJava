/**
 * Created by Vaio on 27.10.2016.
 */
public class Problema8 {
    public static void main(String[] args) {

        int x = 2 ;
        int n = 5;
        int suma = 0 ;

        for(int i = 0;i<x ;i++){
            suma = 1+x+(x*x)+(x*x*x)+(x*x*x*x)+(x*x*x*x*x);
        }
        System.out.println("Rezultatul este :" + suma);
    }
}
