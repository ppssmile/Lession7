import Kichen.Cat;
import Kichen.Plate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        Plate plates = new Plate(20);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rd;
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat" + (i + 1), (int) (Math.random() * 5 + 1));
        }

        while (true) {
            try {
                for (int i = 0; i < cats.length; i++) {
                    if (!cats[i].isFull()) {
                        if (cats[i].eat(plates)) {
                            System.out.println(String.format("Full of %s: %b", cats[i].getName(), cats[i].isFull()));
                        }else {
                            System.out.println(String.format("%1$s.full = %2$b, %1$s.appetit = %3$s", cats[i].getName(), cats[i].isFull(), cats[i].getAppetite()));
                        }
                    } else {
                        System.out.println(String.format("Full of %s: %b", cats[i].getName(), cats[i].isFull()));
                    }
                }
                plates.info();
                System.out.println("\nDo you want to continue eating?\n If yes then add food, else read \"q\" \n");
                rd = reader.readLine();
                if (rd.equals("q")) return;
                else {
                    plates.setFood(plates.getFood() + Integer.parseInt(rd));
                }
            } catch (Exception e) {
                System.out.println("Please, try again");
            }
        }

    }
}