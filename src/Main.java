import arian.person.*;
import arian.lib.*;

import java.util.function.*;
import java.util.stream.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Male testMale = new Male();

        System.out.printf( 
            "Bartender:\t %s %s, I presume.%n", 
            testMale.gender.honorific,
            testMale.name.toString() 
            );
        System.out.printf("%s:\t\t %s", testMale.name.getName("first"), testMale.pronounceNameLikeBond());
    }
}