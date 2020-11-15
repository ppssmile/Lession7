package Kichen;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if (this.food>=appetite) {
            this.food -= appetite;
            return true;
        }else {
            return false;
        }
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void info(){
        System.out.println(String.format("%s : %d", this.getClass().getSimpleName(), this.food));
    }
}
