package HomeWork;

public class Human {

    public String name;
    private String town;
    private int yearOfBirth;
    public String position;

    Human(String name, String town, int yearOfBirth, String position) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.name = "Информация не указана";
        } else {
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (position == null) {
            this.position = "Информация не указана";
        } else {
            this.position = town;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null || !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer age) {
        if (age >= 0) {
            this.yearOfBirth = age;
        } else {
            this.yearOfBirth = 0;
        }
    }
}
