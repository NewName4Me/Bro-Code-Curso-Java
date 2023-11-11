package brocodecourse;
import java.util.*;

public class BC_22_Methods {
    public static void main(String[]args){
        /*
        method=bloque de codigo que se ejecuta cuando lo llamamos
        
        el name dentro de hello(name); y los 2 name de nuestro void, no tienen que ser iguales
        nuestros 2 name podrian llamarse pepe y funciona igual
        */
        
        //variables
        String name="bro";
        int age=20;
        
        //hello(); //dejo de funcionar cuando pusimos el String name en nuestro void
        hello(name,age);
        
        //variables con return
        int x=3;
        int y=4;
        
        int z=add(x, y);
        System.out.println(z);
        
        System.out.println(add(x, y));
        
        //add(x, y);
    }
    
    //metodo que da un mensage
    static void hello(String name,int age){
        System.out.println("Hello "+name+ " you have "+age+" years");
    }
    
    static int add(int x,int y){
        int z=x+y;
        
        return z;
        //return x+y;
    }
}
