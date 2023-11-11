package brocodecourse;
import java.util.Scanner; //np pongas estas cosas encima de package nunca, le da amsiedad

public class BC_4_InsertarInformacion {
    public static void main(String[]args){
        Scanner pregunta=new Scanner(System.in);
        
        System.out.println("Como te llamas?");
        String nombre=pregunta.nextLine();
        
        System.out.println("Cuántos años tienes");
        int edad=pregunta.nextInt();
        
        pregunta.nextLine(); /*se verá algo ridiculo esto, pero es necesario ya que tenemos un string, 
        luego int y luego string, si no pones esto se salta el ultimo string*/
        
        System.out.println("Cuál es tu comida favorita");
        String comida=pregunta.nextLine();
        
        
        System.out.println("Hola "+ nombre);
        System.out.println("Tienes "+ edad+ " años");
        System.out.println("Tu comida favorita es "+comida);
        
        pregunta.close();
        /*esto no lo ponia el de BroCode,y funciona sin ponerlo, pero en vscode lo necesitaba 
        asi por si acaso lo dejo, me podría ser util en otra ocasión saber esto*/
        
    }
}
