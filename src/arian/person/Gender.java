package arian.person;

public enum Gender {
    MALE("male", "Mr", "Sir"), 
    FEMALE("female", "Ms", "Madame");


    public final String phonetical;
    public final String title;
    public final String honorific;


    Gender(String phonetical, String title, String honorific){
        this.phonetical = phonetical;
        this.title = title;
        this.honorific = honorific;
    }
}
