package brocodecourse;
import java.util.Scanner;

public class BC_9_If_Condicional {
    public static void main(String[]args){
        
        Scanner pregunta=new Scanner(System.in);
        
        //programa simple para ver si eres mayor de edad y ademas que chequee si estas jubilado
        System.out.println("Cuántos años tienes?"); 
        int edad=pregunta.nextInt();
        
        if (edad>=75){
            System.out.println("Tas jubilado");
        }
        else if (edad>=18){
            System.out.println("Eres mayor de edad");
        }
        
        if (edad<18){
            System.out.print("Eres menor, y ademas eres "); //aqui quito el ln en print para que el texto salga todo seguido
            
            if (edad>=13){
                System.out.println("un adolescente");
            }
            else{
                System.out.println("un chiquitajo");
            }
        }
       
        
    }
}
