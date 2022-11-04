package models;

public abstract class Animals {

    public String name; // вид тварини;
    static int count;

    static int DogCount;

    static int CatCount;

    abstract void run(int distance);
    abstract void swim(int distance);

    public Animals(){
        count++;
    }
    public static int count() {
        return count;
    }

    public String getName() {
        return name;
    }
}
