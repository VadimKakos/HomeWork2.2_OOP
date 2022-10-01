package HomeWork;

public class flower {
    private String flowersName;
    private String country;
    private double cost;
    int lifeSpan;


    public flower(String flowerColor, String country, double cost, int lifeSpan) {
        this.flowersName = flowerColor;
        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        }
    }

    public flower(String country, int cost, int lifeSpan) {
        this("белый", country, cost, lifeSpan);
    }

    public flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost, 3);
    }

    public String getFlowerColor() {
        return flowersName;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowersName = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
