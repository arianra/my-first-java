package arian.lib;

public class Maths {

    public static int sum(int x, int y){
        return x + y;
    }
    public static int sum(int ... summables){
        int total = 0;

        for( int sum = 0; sum < summables.length; sum++ ){
            total = sum( total, summables[sum] );
        }

        return total;
    }
}