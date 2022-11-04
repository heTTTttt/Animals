package models;

public class Dog extends Animals {
    public Dog(String name){
        super();
        this.name = name;
        DogCount++;
    }

    public static int count() {
        return DogCount;
    }

    @Override
    public void run(int distance) {
        int run = 500;
        if (run >= distance){
            System.out.println("Dog " + name + " ran " + distance + "m");
        }else {
            System.out.println("Dog " + name + " can`t run to much");
        }

    }

    @Override
    public void swim(int distance) {
        int swim = 10;
        if (swim >= distance){
            System.out.println("Dog " + name + " swam " + distance + "m");
        }else {
            System.out.println("Dog " + name + " can`t swim to mush");
        }
    }
}
