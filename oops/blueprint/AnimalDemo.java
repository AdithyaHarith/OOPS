package oops.blueprint;

public class AnimalDemo {
    public static void main(String[] args) {

        IAnimal a = new Cat();

        Cat c = new Cat();

       // IAnimal iAnimal = new IAnimal();


        a.eating();

        IAnimal b=new Dog();
        b.eating();
    }
}
