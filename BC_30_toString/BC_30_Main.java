package BC_30_toString;
import java.util.*;

public class BC_30_Main {
    public static void main(String[]args){
        /*
        toString()= todos los objetos lo tiene
                    muestra un texto que se refiere a un objeto
        */
        BC_30_Car myCar= new BC_30_Car();
        
        /*
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.year);
        */
        
        System.out.println(myCar);//lo que sale despues del @ es su dirección de memoria
        
        System.out.println(myCar.toString());//también muestra su dirección de memoria en el caso de no haber
        //creado el public String toString()en BC_30_Car, pero como lo cambiamos ahora aparecen todos los items de 
        //esa clase

    }
}
