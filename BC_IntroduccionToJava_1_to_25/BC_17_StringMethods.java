package brocodecourse;

public class BC_17_StringMethods {
    public static void main(String[]args){
    /*
    Cositas chachis que se pueden hacer con los Strings
    */
    
    //variables
    String name="Erik";
    String name2="     Erik    ";
    
    boolean result=name.equals("Erik");//compara String para ver si son true o false
    boolean result2=name.equalsIgnoreCase("erik");//si pones esto ignora masyuculas y dira que es true
    int result3=name.length();//longitud de mi nombre
    char result4=name.charAt(0);//imprime la letra en posicion 0 o lo que pongamos de nuestro String
    int result5=name.indexOf("i");//te indica la posicion de un caracter especifico
    boolean result6=name.isEmpty();//indica si esta vacio o no
    String result7=name.toUpperCase();//todo mayusculas
    String result8=name.toLowerCase();//todo minusculas
    String result9=name2.trim();//elimina los espacios delante y detras
    String result10=name.replace("r","p");//intercambia letras
    
    System.out.println(result);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);
    System.out.println(result7);
    System.out.println(result8);
    System.out.println(result9);
    System.out.println(result10);


    }
}
