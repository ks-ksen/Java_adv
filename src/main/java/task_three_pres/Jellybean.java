package task_three_pres;

public class Jellybean extends Sweets {
    private double size;

    public Jellybean(double weight, double price, double size) {
        super(weight, price);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return "Jellybean + [" + super.toString() + ", size = " + size + "]";
    }
}
