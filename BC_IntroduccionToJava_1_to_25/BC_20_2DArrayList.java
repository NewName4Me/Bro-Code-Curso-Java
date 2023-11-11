package brocodecourse;
import java.util.*;

public class BC_20_2DArrayList {
    public static void main(String[]args){
        /*
        2D Array List= lista dinamica de listas
        puedes cambiar su tamaño en runtime
        
        import java.util.*; Inserta todos los java.util. por tanto incluye el SCanner, random,arrays,arraylist....
        */
        ArrayList<ArrayList<String>> groceryList=new ArrayList();
        
        ArrayList<String> bakeryList= new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        
        ArrayList<String> produceList= new ArrayList();
        produceList.add("tamatoes");
        produceList.add("zuchini");
        produceList.add("peppers");
        
        ArrayList<String> drinksList= new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");
        
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        
        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(0));//primer elemento de la primera lista
        


    }
}
