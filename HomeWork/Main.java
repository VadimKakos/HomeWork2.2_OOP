package HomeWork;

public class Main {
    public static void main(String[] args) {

        Human maxim = new Human(null, "Минск", -35, "бренд-менеджер");

        Human anna = new Human("Аня", null, 29, "методист образовательных программ");

        Human kat = new Human("Катя", "Калининград", 28, null);

        Human artem = new Human("Артём", "Москва", 27, "директор по развитию бизнеса");

        Human vladimir = new Human("Владимир", "Казань", 21, null);

        int currentYear = 2022;

        System.out.println(" Привет! Меня зовут " + maxim.name + "." + " Я из города " + maxim.getTown() + "." + " Я родился в " + (currentYear - maxim.getYearOfBirth()) + " году" + "." + " Я работаю на должности " + maxim.position + "." + " Будем знакомы!");
        System.out.println(" Привет! Меня зовут " + anna.name + "." + " Я из города " + anna.getTown() + "." + " Я родился в " + (currentYear - anna.getYearOfBirth()) + " году" + "." + " Я работаю на должности " + anna.position + "." + " Будем знакомы!");
        System.out.println(" Привет! Меня зовут " + kat.name + "." + " Я из города " + kat.getTown() + "." + " Я родился в " + (currentYear - kat.getYearOfBirth()) + " году" + "." + " Я работаю на должности " + kat.position + "." + " Будем знакомы!");
        System.out.println(" Привет! Меня зовут " + artem.name + "." + " Я из города " + artem.getTown() + "." + " Я родился в " + (currentYear - artem.getYearOfBirth()) + " году" + "." + " Я работаю на должности " + artem.position + "." + " Будем знакомы!");
        System.out.println(" Привет! Меня зовут " + vladimir.name + "." + " Я из города " + vladimir.getTown() + "." + " Я родился в " + (currentYear - vladimir.getYearOfBirth()) + " году" + "." + " Я работаю на должности " + vladimir.position + "." + " Будем знакомы!");

        flower rose = new flower("Роза обыкновенная", "Голландия", 35.59);
        flower chrysanthemum = new flower("Хризонтема", 15, 5);
        flower peony = new flower("Пион", "Англия", 69.9, 1);
        flower gypsophila = new flower("Гипсофила", "Турция", 19.5, 10);

        System.out.println(rose.getFlowerColor() + " " + rose.getCountry() + " " + rose.getCost() + " " + rose.getLifeSpan());
        System.out.println(chrysanthemum.getFlowerColor() + " " + chrysanthemum.getCountry() + " " + chrysanthemum.getCost() + " " + chrysanthemum.getLifeSpan());
        System.out.println(peony.getFlowerColor() + " " + peony.getCountry() + " " + peony.getCost() + " " + peony.getLifeSpan());
        System.out.println(gypsophila.getFlowerColor() + " " + gypsophila.getCountry() + " " + gypsophila.getCost() + " " + gypsophila.getLifeSpan());
    }
}
