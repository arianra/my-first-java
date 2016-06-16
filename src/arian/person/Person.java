package arian.person;

public abstract class Person {
    public final Name name;
    public final Gender gender;
    public final SocialSecurityNumber ssn;

    public Person( Name name, Gender gender ){
        this.name = name;
        this.gender = gender;
        this.ssn = new SocialSecurityNumber();
    }
}