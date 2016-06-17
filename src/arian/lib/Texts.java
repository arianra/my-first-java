package arian.lib;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class Texts {

    public static Character getFirstChar(String text){
        return (Character)(text.charAt(0));
    }

    //could add implementation for uppercase instead of spaces
    public static List<Character> getAcronymList(String text){
        String trimmedText = text.trim();
        
        if( ~trimmedText.indexOf(" ") == 0 ) {
            return Arrays.asList( Texts.getFirstChar( trimmedText ));
        }

        return Stream.of( trimmedText.split("\\s") )
            .map( Texts::getFirstChar )
            .collect( Collectors.toCollection(ArrayList::new) );
    }

    public static String parseAcronyms(List<Character> acronyms, String seperator){
        return acronyms.stream()
            .map( Character::toUpperCase )
            .map(Object::toString)
            .collect( Collectors.joining(seperator) );
    }
    public static String parseAcronyms( List<Character> acronyms ){
        return Texts.parseAcronyms( acronyms, "." );
    }
    public static String parseAcronyms(String text){
        return Texts.parseAcronyms( Texts.getAcronymList(text) );
    }
}