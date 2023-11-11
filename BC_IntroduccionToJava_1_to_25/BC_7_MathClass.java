package brocodecourse;
import java.util.Scanner;

public class BC_7_MathClass {
    
    public static void main(String[]args){
        //Mini programa para calcular la hipotenusa
        
        //Poco de teoría antes
        
        double x=3.14;
        double y=-15;
        
        double z1=Math.max(x, y);
        double z2=Math.min(x, y);
        double z3=Math.abs(y);
        double z4=Math.sqrt(z3);
        double z5=Math.round(x); 
        double z6=Math.ceil(x);//redondeo para arriba
        double z7=Math.floor(x);//redondeo para abajo
        
        System.out.println("El más  grande es: "+z1);
        System.out.println("El más pequño es: "+z2);
        System.out.println("El valor absouluto de y es: "+z3);
        System.out.println("La raiz del valor absoluto de y es: "+z4);
        System.out.println(x+" redondeado es: "+z5);
        System.out.println(x+" redondeado para arriba es es: "+z6);
        System.out.println(x+" redondeado para abajo es es: "+z7);
        
        //Programa hipotenusa: pedimos catetos y nos da la hipotenusa
        
        double cateto1;
        double cateto2;
        double hipotenusa;
        
        Scanner pregunta=new Scanner(System.in);
        System.out.println("Dime un cateto ");
        cateto1=pregunta.nextDouble();
        System.out.println("Dime otro cateto ");
        cateto2=pregunta.nextDouble();
        
        hipotenusa=Math.sqrt(cateto1*cateto1+cateto2*cateto2);
        System.out.println("La hipotenusa de tu triagulo es "+hipotenusa);
        
        pregunta.close();//ahora si que dijo lo de cerrarla aunque no haga falta
        
        
    }   
    
}
