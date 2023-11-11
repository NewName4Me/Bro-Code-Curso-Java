package brocodecourse;
import java.util.Scanner;

public class BC_11_OperadoresLogicos {
    public static void main(String[]args){
        /*
        Se utilizan para enlazar dos expresiones, tenemos:
            ! (no)
            && (y)
            || (or)
        */
        
        Scanner pregunta=new Scanner(System.in);
        
        //en funcion de la temperatura te dire si esta caliente, templado o frio el dia
        System.out.println("Temperature??");
        int temp=pregunta.nextInt();
        
        
        if(temp>=30){
            System.out.println("Hot");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("Warm");
        }
        else {
            System.out.println("Cold");
        }
        
        //Queremos un programa que nos cierre el juego en caso de pulse la q o Q
        
        System.out.println("Pulsa q o Q para salir del juego");
        
        String boton=pregunta.next();//cuando es String next se queda solo
        
        if (boton.equals("q")|| boton.equals("Q")){
            System.out.println("Inside game");
        }
        else{
            System.out.println("Outside");
        }
        
        System.out.println("Pulsa q o Q para salir del juego segundo caso");//el caso de antes pero con operadores inversos
        
        String boton2=pregunta.next();
        
        if (!boton2.equals("q")&& !boton2.equals("Q")){
            System.out.println("Inside game");
        }
        else{
            System.out.println("Outside");
        }
    }
}
