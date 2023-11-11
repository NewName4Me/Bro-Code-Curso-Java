package brocodecourse;

public class BC_16_2DArrays {
    public static void main(String[]args){
        /*
        2D arrays= array dentro de un array
        */
        
        String [][]cars=new String[3][3];//indicamos las dimensiones de nuestra matriz
        
        cars[0][0]="Camaro";
        cars[0][1]="Corvette";
        cars[0][2]="Silverado";
        cars[1][0]="Mustang";
        cars[1][1]="Ranger";
        cars[1][2]="F-150";
        cars[2][0]="Ferrari";
        cars[2][1]="Lambo";
        cars[2][2]="Tesla";
        
        for(int i =0;i<cars.length;i++){//bucle que nos muestra la matriz
            System.out.println();
            for (int j=0;j<cars[i].length;j++){ //para mostrar las filas
                System.out.print(cars[i][j]+" ");
            }
        }
        
        
        //otra forma de hacer lo mismo
        //recuerda añadir una pareja de {} que englobe a todos 
        
        String [][] cars2={
            {"Camaro","Corvette","Silverado"},
            {"Mustang","Ranger","F-150"},
            {"Ferrari","Lambo","Tesla"}
            };
        
        for(int i =0;i<cars2.length;i++){//bucle que nos muestra la matriz
            System.out.println();
            for (int j=0;j<cars2[i].length;j++){ //para mostrar las filas
                System.out.print(cars2[i][j]+" ");
            }
        }
    }
}
