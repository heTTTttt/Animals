package models;

public class Dog extends Animals {
    public Dog(String name){
        super();
    }

    @Override
    public void run(int distance) {
        System.out.println("Dog ran " + distance + "m");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Dog swam " + distance + "m");
    }
}
