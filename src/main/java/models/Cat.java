package models;

public class Cat extends Animals{
    public Cat(String name){
        super();
    }

    @Override
    void run(int distance) {
        System.out.println("Cat ran " + distance + "m");
    }

    @Override
    void swim(int distance) {
        System.out.println("Cat can`t swim");
    }
}
