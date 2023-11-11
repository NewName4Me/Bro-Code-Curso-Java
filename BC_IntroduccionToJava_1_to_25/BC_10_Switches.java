package brocodecourse;

public class BC_10_Switches {
    public static void main(String[]args){
        /*
        switch=permite testar una variable en base a su igualdad respecto a otra lista de valores
        cuando utilizas muchos if probablemente sea weno usar switch
        */
        
        //vamos a hacer un programa donde metamos un dia de la semana y si se corresponde a alguno de la lista que nos lo diga
        
        String day="Monday";
        
        switch(day){ 
            
            case "Sunday":System.out.println("It's Sunday");
            break; //si no lo rompemos cuando vea que se cumpla uno imprimira todos los restantes
            case "Monday":System.out.println("It's Monday");
            break;
            case "Tuesday":System.out.println("It's Tuesday");
            break;
            case "Wednesday":System.out.println("It's Wednesday");
            break;
            case "Thursday":System.out.println("It's Thurday");
            break;
            case "Friday":System.out.println("It's Friday");
            break;
            case "Saturday":System.out.println("It's Saturday");
            break;
            
            default:System.out.println("That is not a day");//En caso de que el String metido no encaje con ninguno
        }
    }
}
