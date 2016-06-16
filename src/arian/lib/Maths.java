package arian.lib;

import java.util.stream.*;


public class Maths {

    public static <N> N sum(N x, N y){
        return x + y;
    }
    public static <N> N sum(N ... summables){
        return Stream.of(summables).reduce(new N(0), Maths::sum);
    }

}