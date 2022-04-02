package task_four;

 public class Data {
   private double number1;
   private double number2;

    public Data(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

     public double add (double number1, double number2){
         return number1+number2;
     }

     public double subtract(double number1, double number2){
         return number1-number2;
     }

     public double times(double number1, double number2){
         return number1*number2;
     }

     public double div(double number1, double number2){
         return number1/number2;
     }

 }
