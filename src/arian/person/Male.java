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

    public String pronounceNameLikeBond(){
        String lastName = this.name.getName("last"),
            fullName = this.name.getName("full");

        return lastName + ", " + fullName + ".";
    }
}