package brocodecourse;
import java.util.Scanner;

public class BC_12_WhileLoops {
    public static void main(String[]args){
        //bucle while, se ejecuta mientras sea verdadero su condicion
        //programa que pregunta el nombre sin fin hasta que dicen algo
        
        Scanner pregunta = new Scanner(System.in);
        String name="";
        String name2="";
        
        while(name.isBlank()){//mientas que no pongan nada seguira corriendo
            System.out.print("Dime tu nombre: ");
            name=pregunta.nextLine();//salta a la siguiente linea con el texto que le metas(INTERESANTE)
        }
        System.out.println("Hello "+name);
        
        pregunta.close();
        
        //para hacer el repetir hasta se hace un while pero con do antes y al reves , asi:
        
        /*
        do{
            System.out.print("Dime tu nombre2: ");
            name2=pregunta.nextLine();
        } while(!name.isBlank());
        
        Te hice un comentario porque entonces falla con lo otro
        */ 
    }
}
