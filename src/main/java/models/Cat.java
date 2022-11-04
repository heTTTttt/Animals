package models;

public class Cat extends Animals{
    public Cat(String name){
        super();
        this.name = name;
        CatCount++;
    }

    public static int count() {
        return CatCount;
    }

    @Override
    void run(int distance) {
        int run = 250;
        if (run >= distance){
            System.out.println("Cat " + name + " ran " + distance + "m");
        }else {
            System.out.println("Cat " + name + " can`t run to much");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("Cat " + name + " can`t swim");
    }
}
