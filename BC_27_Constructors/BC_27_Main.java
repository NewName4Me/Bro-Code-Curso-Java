package BC_27_Constructors;
import java.util.*;

public class BC_27_Main {
    public static void main(String[]args){
        /*
        Construcores
        Nos permiten añadir atributos a multiples objetos que nosotroscreemmos
        
        */
        BC_27_Human human= new BC_27_Human("Rick",65,80);

        System.out.println(human.name);
        
        BC_27_Human human2=new BC_27_Human("Morti", 16, 50);
        
        System.out.println(human2.name);
        
        
        human2.eat();
        
        human.drink();
    }
}
