package BC_27_Constructors;


public class BC_27_Human {
    /*

    */
    String name;
    int age;
    double weight;

    BC_27_Human(String name,int age,double weigth){//esto es un constructor
        this.name=name;//si no ponemos this en nuestro main cuando decimos que nos lo muestre nos da valor nulo
        this.age=age;
        this.weight=weigth;
    }
    
    void eat(){
        System.out.println(this.name+"Is eating");
    }
    void drink(){
        System.out.println(this.name+"is drinkin");
    }

    
}
