package Kichen;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        this.food -= appetite;
    }

    public void info(){
        System.out.println(String.format("%s: %d", this.getClass().getSimpleName(), this.food));
    }
}
