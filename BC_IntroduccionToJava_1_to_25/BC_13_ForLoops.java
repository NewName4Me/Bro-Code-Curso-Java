package brocodecourse;

public class BC_13_ForLoops {
    public static void main(String[]args){
         /*
        como un while pero ejecuta un numero limitado de iteraciones
        */
         //queremos contar del uno al diez
         for(int i=0;i<=10;i++){//comienza en 0, hasta 10, de uno en uno
             System.out.println(i);
         }
         
         //contar para atras:
         for(int i2=10;i2>=0;i2-=2){//de dos en dos para atras
             System.out.println(i2);
         }
    }
}
