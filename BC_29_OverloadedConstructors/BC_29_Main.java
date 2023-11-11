package BC_29_OverloadedConstructors;
import java.util.*;

public class BC_29_Main {
    public static void main(String[]args){
        /*
        OverLoaded constructors= multiples consttuctores dentro de una clase
         con el musmo nombre
        con diferentes parametros
        nombre+parametros=signature
        */
        
        BC_29_Pizza pizza1=new BC_29_Pizza("thick","bbq","mozzarella","olives");

        System.out.println("Aqui estan los ingredientes de tu pizza: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.toppings);
        
        BC_29_Pizza pizza2=new BC_29_Pizza("thick","bbq","mozzarella");
        System.out.println("Pizza sin toppgins");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.toppings);
        
        BC_29_Pizza pizza3=new BC_29_Pizza("thicks","bbq");
        System.out.println("Pizza de pan y salsa");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);
        System.out.println(pizza3.cheese);
        System.out.println(pizza3.toppings);
        
        BC_29_Pizza pizza4=new BC_29_Pizza("thick");
        System.out.println("Solo pan");
        System.out.println(pizza4.bread);
        System.out.println(pizza4.sauce);
        System.out.println(pizza4.cheese);
        System.out.println(pizza4.toppings);
        
        BC_29_Pizza pizza5=new BC_29_Pizza();
        System.out.println("Pizza vacia");
        System.out.println(pizza5.bread);
        System.out.println(pizza5.sauce);
        System.out.println(pizza5.cheese);
        System.out.println(pizza5.toppings);
        

    }
}
