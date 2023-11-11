package brocodecourse;

public class BC_2_TiposDeVariable {
    public static void main(String[]args){
        
        int x1=123; //el numero máximo que acepta int es 2000000000(dos mil millones)
        long x2=123123123123123L;//la L es obligatoria para trabajar con números tan grandes
        float y1=12.3f;//f necesaria para los float
        boolean z=false;
        char symbol='@';//fijate que este va con '' y no con ""
        String nombre="Erik";

        System.out.println("My number is: "+ x1);
        System.out.println("My big number is: " +x2);
        System.out.println("My decimal number is "+ y1);
        System.out.println(z);
        System.out.println(symbol);
        System.out.println("Hello "+nombre);

    }
}
