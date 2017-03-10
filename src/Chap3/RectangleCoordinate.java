package Chap3;

import java.util.Random;

public class RectangleCoordinate {
    public static void main(String[] args){
        Random rand = new Random();

        int length = rand.nextInt(201) - 100;
        int width = rand.nextInt(101) - 50;

        System.out.print("(" + length + "," + width + ")");
    }
}
