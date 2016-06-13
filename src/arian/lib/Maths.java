package arian.lib;

import java.util.stream.*;


public class Maths {

    public static int sum(int x, int y){
        return x + y;
    }
    public static int sum(int ... summables){
        return IntStream.of(summables).reduce(0, Maths::sum);
    }

}