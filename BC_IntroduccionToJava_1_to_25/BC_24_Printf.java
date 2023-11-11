package brocodecourse;
import java.util.*;

public class BC_24_Printf {
    public static void main(String[]args){
        /*
        Printf=controla el display de la consola
            %[flags][precision][width][conversion character]
        */
        boolean myBoolean=true;
        char myChar='@';
        String myString="erik";
        int myInt=16;
        double myDouble=1000;
        
        //Ejemplo
        System.out.printf("this is a format string %d \n",123);//123 está donde %d (decimal)
        
        //conversión-character
        System.out.printf("%b \n",myBoolean);
        System.out.printf("%c \n",myChar);
        System.out.printf("%s \n",myString);
        System.out.printf("%d \n",myInt);
        System.out.printf("%f \n",myDouble);
        
        //width(numerp minimo de caracteres)
        System.out.printf("Hello %10s \n",myString);//10 espacios antes de mostrar myString
        
        //precision cuando usas un float o doble
        System.out.printf("Tienes esta canridad de dinero %.2f \n",myDouble);//solo muestra dos decimales
        
        //flags (añade una efecto al especificador de formato
        //- :left-justify
        //+ : muestra un + o - si lo pones sin numero
        // 0 : los valores numeriscos tiene zero-padded
        // , : separador si los numeros son superiorres a 1000
        
        System.out.printf("Yienes esta cantidad de dinero %-20f \n",myDouble);//si quitas el menos se va lejos
        System.out.printf("Tines esta cantidad de dinero %+f \n",myDouble);
        System.out.printf("tienes esta cantidad de dinero %020f \n",myDouble);
        System.out.printf("tines esto %,f \n",myDouble);

    }
}
