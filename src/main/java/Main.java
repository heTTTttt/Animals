import models.Animals;
import models.Cat;
import models.Dog;

public class Main {
    public static void main(String[] args) {
        Animals[] animal = new Animals[7]; // я використав уявлення об'єктів за допомогою масивів тому що так набагато легше працювати з об'єктами та їх параметрами;
        animal[0] = new Cat("Кіт звичайний", "Лео", 250);
        animal[1] = new Dog("Собака такса", "Лея", 500, 10);
        animal[2] = new Cat("Кіт британський висловухий", "Тім", 250);
        animal[3] = new Cat("Кіт сіамський", "Робі", 250);
        animal[4] = new Cat("Кіт сфінкс", "пушок)))", 250);
        animal[5] = new Dog("Собака Джек-Расел", "Шарік", 500, 10);
        animal[6] = new Dog("Собака мопс", "Кіт", 500, 10);

        System.out.println();
        for (int i = 0; i < animal.length; i++){ // завдяки цьому циклу можна вивести усі об'єкти
            System.out.println(animal[i]);       // та їх характеристики;
        }
        System.out.println("Кількість собак = " + Dog.getCount());
        System.out.println("Кількість котів = " + Cat.getCount());
        System.out.println("Кількість тварин = " + Animals.getCount());

        System.out.println();

        animal[1].swim(5);   // у ціх методах ми встановлюємо номер об'єкта там перевіряємо чи можуть вони здолати вказану дистанцію.
        animal[3].run(1000); // у ціх методах ми встановлюємо номер об'єкта там перевіряємо чи можуть вони здолати вказану дистанцію.

    }
}
