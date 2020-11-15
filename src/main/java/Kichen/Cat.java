package Kichen;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public String getName() {
        return this.name;
    }

    public int getAppetite() {
        return this.appetite;
    }

    public boolean isFull() {
        return this.full;
    }

    public boolean eat(Plate plate){
        if (plate.decreaseFood(this.appetite)) {
            this.full = true;
        }
        return this.full;
    }
}
