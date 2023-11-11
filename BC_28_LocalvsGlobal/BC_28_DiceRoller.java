package BC_28_LocalvsGlobal;
import java.util.*;

public class BC_28_DiceRoller {
    Random random;
    int number;

    BC_28_DiceRoller() {//todo lo que hagamos aqui solo es visible para nuestro constructor
        //Random random=new Random();
        //int num=0
        random=new Random();
        roll();
    }
    
    void roll(){
        //las dos líneas siguientes fallan debido a que num y random son 
        //locales (estaban solo en Dicerroller), por tanto no existen en void roll()
        //num=Random.nextInt(6)+1; 
        //System.out.println(num);
        
        /*una solución sería:
            void roll(Random random,int num){
        
            }
        */
        number=random.nextInt(6)+1;
        System.out.println(number);
        
    }
    
}
