package brocodecourse;

public class BC_5_Expresiones {
    public static void main(String[]args){
        
        int friends=10;
        int enemies=5;
        int uwu=4;
        int divisionChachi=8;
        int multi=5;
        int sumaRapida=5;
        
        friends=friends+1;
        enemies=enemies-1;
        uwu=uwu*2;
        divisionChachi=divisionChachi%3;
        multi=multi*2;
        sumaRapida++;//para restar --
        
        System.out.println("Ahora tienes "+friends+" amigos");
        System.out.println("Ahora tienes "+enemies+" enemigos");
        System.out.println("Ahora tienes "+uwu+" uwus");
        System.out.println(multi);
        System.out.println(divisionChachi);//es el sobrante, piensa 8/3=2,66666---Se queda en 2
        System.out.println("Tu suma veloz es  "+sumaRapida);
        
        //Con la division / de forma normal lo trunca es decir 10/3 te dira que es 3 para arreglarlo hacemos esto
        
        double test=10;
        test=(double)test/3;//funciona igual sin el (double), pero weno, a lo mejor lo necesito saber para otra cosa
        System.out.println(test);
    }
}
