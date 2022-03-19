package task_three_pres;

public abstract class Sweets {

    private double weight;
    private double price;

    public Sweets(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "weight = " + weight + ", price = " + price;
    }
}
