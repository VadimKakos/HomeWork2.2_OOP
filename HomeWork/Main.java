package HomeWork;

public class Main {
    public static void main(String[] args) {

        Human maxim = new Human(null, "Минск", -35, "бренд-менеджер");

        Human anna = new Human("Аня", null, 29, "методист образовательных программ");

        Human kat = new Human("Катя", "Калининград", 28, null);

        Human artem = new Human("Артём", "Москва", 27, "директор по развитию бизнеса");

        int currentYear = 2022;

        System.out.println(" Привет! Меня зовут " + maxim.name + "." + " Я из города " + maxim.town + "." + " Я родился в " + (currentYear - maxim.yearOfBirth) + " году" + "." + " Я работаю на должности " + maxim.position + "." + " Будем знакомы!");
        System.out.println(" Привет! Меня зовут " + anna.name + "." + " Я из города " + anna.town + "." + " Я родился в " + (currentYear - anna.yearOfBirth) + " году" + "." + " Я работаю на должности " + anna.position + "." + " Будем знакомы!");
        System.out.println(" Привет! Меня зовут " + kat.name + "." + " Я из города " + kat.town + "." + " Я родился в " + (currentYear - kat.yearOfBirth) + " году" + "." + " Я работаю на должности " + kat.position + "." + " Будем знакомы!");
        System.out.println(" Привет! Меня зовут " + artem.name + "." + " Я из города " + artem.town + "." + " Я родился в " + (currentYear - artem.yearOfBirth) + " году" + "." + " Я работаю на должности " + artem.position + "." + " Будем знакомы!");
    }
}
