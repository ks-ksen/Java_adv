package task_three_pres;

public class Candy extends Sweets{
    private String name;

    public Candy(double weight, double price, String name) {
        super(weight, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Candy + [" + super.toString() +", name = " + name + "]";
    }
}
