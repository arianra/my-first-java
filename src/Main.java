import arian.person.*;
import arian.lib.*;

import java.util.function.*;
import java.util.stream.*;
import java.util.*;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args){
        Male testMale = new Male();

        System.out.printf( "------- %s -------%n", Main.quickDateNow());
        
        Function< ArrayList<? extends Object>, ?> hoi = x -> x.get(0);
        ArrayList<Integer> nogIets = new ArrayList();
        nogIets.add( 0 );

        try {
            Constructor foo = Class.forName("arian.person.Male").getDeclaredConstructor();
            Male bar = (Male)foo.newInstance();
            System.out.println("hoi " + bar.pronounceNameLikeBond());
        }
        catch(ClassNotFoundException x){
            System.out.println(x);
        }
        catch(NoSuchMethodException x) {
            System.out.println(x);
        }
        catch (InstantiationException x) {
            System.out.println(x); 	    
        } 
        catch (InvocationTargetException x) {
            System.out.println(x);	    
        }
        catch (IllegalAccessException x) {
            System.out.println(x);	    
        }
        
        //System.out.printf("?? %d%n", hoi.apply( nogIets ));
        System.out.println(Texts.parseAcronyms("Een lange Naam"));

        System.out.printf( 
            "Bartender:\t %s %s, I presume.%n", 
            testMale.gender.honorific,
            testMale.name.toString() 
            );
        System.out.printf("%s:\t\t %s%n", testMale.name.getName("first"), testMale.pronounceNameLikeBond());

        System.out.printf( "------- %s -------%n", Main.quickDateNow());

    }

    public static String quickDateNow(){
        return new java.text.SimpleDateFormat("dd-MM-YY HH:mm:ss.S").format(new java.util.Date());
    }
}