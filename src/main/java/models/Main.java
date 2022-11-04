package models;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animals dog1 = new Dog("Tuzik");
        Animals dog2 = new Dog("Sharik");
        Animals cat1 = new Cat("Leo");
        Animals cat2 = new Cat("Seva");
        Animals cat3 = new Cat("Tisha");
        Animals cat4 = new Cat("Murkan");
        Animals dog = new Dog("Leya");

        dog1.swim(10);
        dog1.swim(11);
        dog2.run(600);
        dog2.run(300);
        cat1.swim(20);
        cat2.run(250);
        cat3.run(251);



        System.out.println();

        System.out.println(Animals.count);
        System.out.println(Cat.CatCount);
        System.out.println(Dog.DogCount);

        // У ціх методах ми встановлюємо чи можуть вони здолати вказану дистанцію.
        // у ціх методах ми встановлюємо чи можуть вони здолати вказану дистанцію.

    }
}
