package brocodecourse;
import java.util.Random;

public class BC_8_NumerosRandom {
    public static void main(String[]args){
        
        Random random=new Random();
        
        int x=random.nextInt(); //da valores de entre -2000000000 y 2000000000
        int y=random.nextInt(6)+1; //nos dará un número entre 1 y 6
        double z=random.nextDouble();//valores entre 0 y 1
        boolean w=random.nextBoolean();// o true o false
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
    
}
