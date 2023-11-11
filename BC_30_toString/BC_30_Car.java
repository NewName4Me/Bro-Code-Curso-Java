package BC_30_toString;
import java.util.*;

public class BC_30_Car {

    String make="Ford";
    String model="Mustang";
    String color="red";
    int year=2021;
    
    //methods overriding lo daremos más tarde
    
    public String toString(){
        
        String myString=make+"\n"+model+"\n"+color+"\n"+ year;
        return myString;
    }
}
