package BC_26_BasicsPOO;
import java.util.*;

public class BC_26_Main {
    public static void main(String[]args){
        /*
        objeto =instancia de una clase que contiene métodos y atribugtos
        ejemplo :(phone,desk,compute,coffee cup)
        

        */

        BC_26_Car myCar1=new BC_26_Car();
        
        //mostrar atributos
        System.out.println(myCar1.model);
        System.out.println(myCar1.make);
        
        //mostrar métodos
        myCar1.drive();
        myCar1.brake();
        
        System.out.println("");//separar todo
        
        //usemos myCar de nuevo como si tuvieramos dos coches
        BC_26_Car myCar2= new BC_26_Car();
        
        System.out.println(myCar2.model);
        System.out.println(myCar2.make);
    }
}
