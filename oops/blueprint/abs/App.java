package oops.blueprint.abs;

public class App {
    public static void main(String[] args) {
        Animal a = new CatChild();
        a.eating();
        a.display();

        Animal a1 ;

        a1 = new Dog();

        CatChild cc = new CatChild();

        cc.display();


    }
}
