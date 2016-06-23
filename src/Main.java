import arian.person.*;
import arian.lib.*;

import java.util.function.*;
import java.util.stream.*;
import java.util.*;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args){
        Male male = new Male();

        System.out.printf( "------- %s -------%n", Main.quickDateNow());
        
        Function< ArrayList<? extends Object>, ?> hoi = x -> x.get(0);
        ArrayList<Integer> nogIets = new ArrayList();
        nogIets.add( 0 );

        try {
            Constructor maleCtor = Class.forName("arian.person.Male").getDeclaredConstructor(Name.class);
            male = (Male)maleCtor.newInstance(new Name("Jan Willem","Naaktgeboren"));
        }
        catch (ClassNotFoundException x) {}
        catch (NoSuchMethodException x) {}
        catch (InstantiationException x) {}
        catch (InvocationTargetException x) {}
        catch (IllegalAccessException x) {}

        System.out.printf( 
            "%s\t %s %s, I presume.%n", 
            Texts.parseAcronyms("Sean Pierre"),
            male.gender.honorific,
            male.name.toString() 
            );
        System.out.printf("%s:\t %s%n", male.name.getName("initials"), male.pronounceNameLikeBond());

        System.out.printf( "------- %s -------%n", Main.quickDateNow());

    }

    public static String quickDateNow(){
        return new java.text.SimpleDateFormat("dd-MM-YY HH:mm:ss.S").format(new java.util.Date());
    }
}