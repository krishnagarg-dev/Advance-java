package area;

Abstract class Area {
    int r,l,b;
    //area constructor
    // Area() {
        // System.out.println("Area class Constructor");
    // }

    //parameterized constructor passed below

    Area(String msg){
        System.out.println(msg);
    }
    void getArea() {
        System.out.println("This is Area class");
    }
}
// Circle class inherits Area class
class Circle extends Area {
    final double Pi = 3.14;
    Circle(int r) {
        // Implicit call to super()
        //it should be the first statement in the constructor
        super("THis is the area consructor");
        this.r = r;
    }
    void getCircleArea(){
        double result = Pi*super.r*this.r;
        // this will only access the r of Circle class untill r is not defined in Circle class it will access the r of Area class.
        // super is directly accessing the r of Area class.
        System.out.println("Area of Circle = " + result); 
    }

}

public class AreaMain {
    public static void main(String[] args) {
// Create an object of Circle class
// and call getArea method
// it means it can access the method of parent class
        Circle c = new Circle(12);
        // upcasting
        c.getArea();

        // Circle r =(Circle) new Area("abc");
      
        // downcasting

        c.getCircleArea();


    }
}  


//Sub Class Constructor implicitly calls Super Class Default Constructor(Always).  

//Abstract class is an incomplete class that cannot be instantiated and is used as a base for other classes.
//it cannot have a reference variable of its own type but can have reference variables of its subclass types.
//interfaces are incomplete classes that cannot be instantiated and are used to define a contract for classes that implement them. 
//they are developed to get in the sub class and take reference of the sub class and call the method of the sub class.
//abstract class object only can be declared but cannot be instantiated. It can have reference variable of its own type but cannot create object of its own type. 
//if you have any abstract method in the class then the class must be declared as abstract class.
//but if a class if a abstract class then it is not necessary that it should have abstract method.
