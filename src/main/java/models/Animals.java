package models;

public class Animals {

    protected String Animal;        // вид тварини;
    protected String name;          // ім'я тварини;
    public int run;                 // можливість бігати;
    public int swim;                // можливість плавати;
    private static int count;       // загальна кількість тварин;

    public Animals() {
        count++;
    }   // метод для підрахунку загальної кількості тварин;

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() { // методу опису тварин;
        return  "Вид: " + Animal +
                ", Прізвисько: " + name +
                ", Може пропливти " + swim + "m. " +
                " Може пробігти " + run + "m. \n";
    }

    public void run(int distance) { // метод для контролю максимальної дистанції бігу тварин;
        if (run >= distance) {
            System.out.println(this.Animal + " на прізвисько " + this.name + " пробіг(ла) " + distance + "m");
        } else {
            System.out.println(this.Animal + " на прізвисько " + this.name + " не зміг(змогла) пробігти " + distance + "m");
        }
    }

    public void swim(int distance) { // метод для контролю максимальної дистанції плавання тварин;
        if (swim >= distance) {
            System.out.println(this.Animal + " на прізвисько " + this.name + " проплив(ла) " + distance + "m");
        } else {
            System.out.println(this.Animal + " на прізвисько " + this.name + " не зміг(змогла) проплисти " + distance + "m");
        }
    }
}
