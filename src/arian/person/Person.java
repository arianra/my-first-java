package arian.person;

public abstract class Person {
    public final Name name;
    public final Gender gender;

    public Person( Name name, Gender gender ){
        this.name = name;
        this.gender = gender;
    }

    public String pronounceNameLikeBond(){
        String firstName = this.name.getName("first"),
            fullName = this.name.getName("full");

        return lastName + ", " + fullName + ".";
    }
}