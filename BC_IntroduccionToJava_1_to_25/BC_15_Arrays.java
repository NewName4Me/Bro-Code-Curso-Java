package brocodecourse;

public class BC_15_Arrays {
    public static void main(String[]args){
        /*
        arrays, guardar muchos valores en una unica variable
        todos tienes que ser el mismo tipo de variable
        */
        
        String[] cars={"camaro","corvet","tesla","BMW"};//para hacer un array, hay que usar [] y {} y "" en cada elemento
        
        cars[0]="Mustang";//cambiara el camaro por el mustang
        
        System.out.println(cars[2]);
        
        
        //otra forma de crear un array
        
        String[] cars2=new String[3];//indicamos el numero de elementos que queremos en nuestro array
        
        cars2[0]="coche1";
        cars2[1]="coche2";
        cars2[2]="coche3";
        // cars2[3]="coche4"; esto no existe, solo tenemos tres elementos, no 4
        
        System.out.println(cars2[2]);
        
        //ejemplo for loop mostrar todos los elementos de un array
        
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
