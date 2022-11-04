package models;

public class Cat extends Animals {
    private static int count;

    public Cat(String Animal, String name, int run, int swim){
        this.Animal = Animal;
        this.name = name;
        this.run = run;
        this.swim = swim;
        count++; // підрахунок загальної кількості котів;
    }

    public static int getCount() { // метод для підрахунку загальної кількості котів
        return count;
    }
}
