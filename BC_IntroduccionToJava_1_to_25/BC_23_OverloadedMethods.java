package brocodecourse;
import java.util.*;

public class BC_23_OverloadedMethods {
    public static void main(String[]args){
        /*
        Overloaded methods= metodos que comparten el mismo nombre
                        pero diferemtes parametros
                        method name+parametro=firma del metodo
        
        */

        int x=add(1,2,5,6);
        double y=add(1.2, 3);
        System.out.println(x);
        System.out.println(y);
    }
    
    
    //solo enteros
    static int add(int a,int b){
        System.out.println("#1: ");
        return a+b;
    }
    static int add(int a,int b,int c){
        System.out.println("#2: ");
        return a+b+c;
    }
    static int add(int a,int b,int c,int d){
        System.out.println("#3: ");
        return a+b+c+d;
    }
    
    //igual que los tres anteriores pero doble
    static double add(double a,double b){
        System.out.println("#4: ");
        return a+b;
    }
    static double add(double a,double b,double c){
        System.out.println("#5: ");
        return a+b+c;
    }
    static double add(double a,double b,double c,double d){
        System.out.println("#6: ");
        return a+b+c+d;
    }
}
