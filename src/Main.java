import model.Cat;
import model.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Myrzik", "black");
        System.out.println(cat1);
        cat1.wagTail();

        System.out.println("====================================");

        Dog dog1 = new Dog("Rex", "red");
        System.out.println(dog1);
        dog1.wagTail();

        Dog.DogTail dt1 = dog1.new DogTail("white");
        dt1.wag();

        Dog.DogTail dt2 = new Dog().new DogTail("rose");
        dt2.wag();
    }
}
