package models;

public class Dog extends Animals {
   private static int count;

    public Dog(String Animal, String name, int run, int swim){
        this.Animal = Animal;
        this.name = name;
        this.run = run;
        this.swim = swim;
        count++; // підрахунок загальної кількості собак;
    }

    public static int getCount(){ // метод для підрахунку загальної кількості собак;
        return count;
    }
}
