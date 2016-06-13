package arian.person;

public class Male extends Person {
    public Male(){
        this(new Name("John", "Doe"));
    }
    public Male(Name name){
        super(
            name, 
            Gender.MALE
            );
    }
}