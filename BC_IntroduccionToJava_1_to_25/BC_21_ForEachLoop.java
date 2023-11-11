package brocodecourse;
import java.util.*;

public class BC_21_ForEachLoop {
    public static void main(String[]args){
        /*
        ForEachLoop=navegar por arrays, con menos pasos pero menos flexible
        más facil de leer
        
        */
        String[]animales={"cat","dog","rat","bird"};
        
        for(String i: animales){//se ejecutara una vez por cada dato en nuesto array
            System.out.println(i);
        }
        
        
        ArrayList<String> animales2=new ArrayList<String>();
        
        animales2.add("cat");
        animales2.add("dog");
        animales2.add("rat");
        animales2.add("bird");

        for(String j:animales2){
            System.out.println(j);
        }

    }
}
