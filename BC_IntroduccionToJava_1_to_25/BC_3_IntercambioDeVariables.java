package brocodecourse;

public class BC_3_IntercambioDeVariables {
    public static void main(String[]args){
        
        String x3="water";
        String y3="beer";
        String temp=null;//puedo poner null o nada

        temp=y3;
        y3=x3;
        x3=temp;

        System.out.println(x3);
        System.out.println(y3);
    }
}
