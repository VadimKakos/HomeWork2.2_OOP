package HomeWork;

public class Main {
    public static void main(String[] args) {

        Human maxim = new Human("Максим", 35, "Минск");
        Human anna = new Human("Аня", 29, "Москва");
        Human kat = new Human("Катя", 28, "Калининград");
        Human artem = new Human("Артем", 27, "Москва");

        maxim.messageForMen();
        anna.messageForWomen();
        kat.messageForWomen();
        artem.messageForMen();
    }
}
