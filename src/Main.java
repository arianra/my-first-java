import arian.person.*;
import arian.lib.*;

import java.util.function.*;
import java.util.stream.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Male testMale = new Male();

        System.out.printf( "a sum: %d.%n", Maths.sum(1, 2, 3, 4, 5, 100));
        System.out.printf( 
            "%s %s, I presume.%n", 
            testMale.gender.honorific,
            testMale.name.toString() 
            );
        System.out.printf("%s", testMale.pronounceNameLikeBond());
    }
}