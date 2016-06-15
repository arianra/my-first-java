package arian.person;

public abstract class Person {
    public final Name name;
    public final Gender gender;
    public final int ssn;

    private static int socialSecurityNumberBase = 1000;

    public Person( Name name, Gender gender ){
        this.name = name;
        this.gender = gender;
        
        this.ssn = Person.generateUniqueSSN();
    }

    private static int generateUniqueSSN(){
        return Person.socialSecurityNumberBase = ++Person.socialSecurityNumberBase;
    }
}