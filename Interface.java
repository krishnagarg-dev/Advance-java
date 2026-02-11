package poly;

class Animal {
    String name;
    String sound;
    void makeSound() {
        System.out.println("This is the Animal Class");
    }
    String makeSound(String name, String sound) {
        System.out.println("This is the Animal Class");
    }
    void makesound() {
        String result = String.format("Name: %s, Sound: %s", name, sound);
        System.out.println(result);
    }
    void display() {
        String result = String.format("Name: %s, Sound: %s", name, sound);
        System.out.println(result);
    }
}
class Cat extends Animal {
    int legs;

    //whenever instance variable comes then we need to make a constructor on intializing those variables.
    Cat(String name, String sound, int legs){
        super.name = name;
        super.sound = sound;
        this.legs = legs;
    }
    @override

    void makeSound() {
        String result = String.format("Name: %s, Sound: %s, Legs: %d", name, sound, legs);
        System.out.println(result);
    }

}

public class MainPoly {
    public static void main(String[] args) {
        Animal n1 = new Animal();
        n1.makeSound();
        n1.makesound("Dog", "Bark");
        n1.display();
        Cat c1 = new Cat("Cat", "Meow", 4);
        c1.makeSound();
        
    }
}

//method over loading do not judge on the basis of return type but on the basis of parameters. It is a compile time polymorphism.
//it is judged on the basis of its parameters and its data types.


//subclass overrides the super class method then it is called method overriding. 
//object 

// when an anonymous class is called its method of child class will be called. it can only called its own method and not the parent class method. 
// overloading can be done in the same class and can be also done in the child class. overriding can only be done in the child class.
// overloading is compile time polymorphism and overriding is runtime polymorphism.