/// This program shows method overriding


class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Kutta khaa raha hai");
    }
}


public class method_overriding{
    public static void main(String[] args){

        Dog d = new Dog();
        d.eat();

        Animal a = new Animal();
        a.eat();

    }
}