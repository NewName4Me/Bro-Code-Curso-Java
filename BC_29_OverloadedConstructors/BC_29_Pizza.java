package BC_29_OverloadedConstructors;
import java.util.*;

public class BC_29_Pizza {
    
    //variables/ingredientes
    String bread;
    String sauce;
    String cheese;
    String toppings;

    BC_29_Pizza(String bread,String sauce,String cheese,String toppings) {
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
        this.toppings=toppings;
    }
    
    //encaso de que no quieran toppings
    BC_29_Pizza(String bread,String sauce,String cheese) {
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
    }
    
    //solo pan y salsa
    BC_29_Pizza(String bread,String sauce) {
        this.bread=bread;
        this.sauce=sauce;
    }
    
    //solo pan
    BC_29_Pizza(String bread) {
        this.bread=bread;
    }

    //pizza vacia
    BC_29_Pizza() {
        
    }
    
    
    
}
