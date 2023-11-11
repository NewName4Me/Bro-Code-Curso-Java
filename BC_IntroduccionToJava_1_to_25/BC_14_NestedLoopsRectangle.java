package brocodecourse;
import java.util.Scanner;

public class BC_14_NestedLoopsRectangle {
    public static void main(String[]args){
        /*
        bucle dentro de bucles
        
        Programa donde establecemos filas y columnas y nos muestra un rectángulo 
        con le símbolo que queramos
        */
        
        Scanner scanner=new Scanner(System.in);
        
        //variables
        int rows;
        int columns;
        String symbol="";
        
        //contadores...tambien funcionaria si pusiera esto y quitara int de los for
        //int i;
        //int j;
        
        System.out.print("Enter rows:");
        rows=scanner.nextInt();
        System.out.print("Enter columns:");
        columns=scanner.nextInt();
        System.out.print("Enter symbol to use:");
        symbol=scanner.next();
        
        for (int i=1;i<=rows;i++){
            System.out.println();//espacio en blanco despues de cada fila , asi salta a la siguiente
            for (int j=1;j<=columns;j++){
                System.out.print(symbol);//sin el println porque si no se ven las columnas separadas
            }
        }    
    }
}
