package HomeWork;

public class Human {

    public String name;
    public String town;
    public int yearOfBirth;
    public String position;

    Human(String name, String town, int yearOfBirth, String position) {
        if (name == null) {
            this.name = "Информация не указана";
        }else{ this.name = name;}
        if (town == null) {
            this.name = "Информация не указана";
        } else {this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (position == null) {
            this.position = "Информация не указана";
        } else {this.position = town;
        }
    }
}
