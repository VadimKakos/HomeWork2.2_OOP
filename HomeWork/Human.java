package HomeWork;

public class Human {
    int yearOfBirth;
    String name;
    String town;
    int currentYear = 2022;

    Human(String name, int yearOfBirth, String town) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
    }

    void messageForMen() {
        System.out.println("Привет! Меня зовут " + name + "."
                + " Я из города " + town + "."
                + " Я родился в " + (currentYear - yearOfBirth)
                + " году. Будем знакомы!");
    }

    void messageForWomen() {
        System.out.println("Привет! Меня зовут " + name + "."
                + " Я из города " + town + "."
                + " Я родилась в " + (currentYear - yearOfBirth)
                + " году. Будем знакомы!");
    }
}
