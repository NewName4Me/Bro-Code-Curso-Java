package brocodecourse;
import java.util.ArrayList;//recuerda esto weon

public class BC_19_ArrayList {
    public static void main(String[]args){
        /*
        Arraylist = un array resizable 
                    donde los elementos pueden ser añadidos o manipulados despues de la compilacion 
                    almacena reference data types
                    se utilizan wrapper no primitivas
        */
        ArrayList<String>food=new ArrayList<String>();//asi se crean ArrayList
        
        //como añadir info a nuestra lista
        food.add("pizza");
        food.add("hamburguer");
        food.add("hotdog");
        
        food.set(0, "sushi");//reemplaza la pizza por sushi
        food.remove(2);//eliminaria en este caso el hot dog
        food.clear();//deja nuestra lista limpia
        
        for(int i=0;i<food.size();i++){//con estes tipo de listas se usa size no legnth
            System.out.println(food.get(i));//tomar atributos de nuestra lista
        }

    }
}
