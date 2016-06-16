package arian.person;

public class SocialSecurityNumber {
    private final int uniqueSSN;

    private static int socialSecurityNumberBase = 1000;

    public SocialSecurityNumber(){
        this.uniqueSSN = SocialSecurityNumber.generateUniqueSSN();
    }

    public int getSSN(){
        return this.uniqueSSN;
    }

    private static int generateUniqueSSN(){
        return SocialSecurityNumber.socialSecurityNumberBase = ++SocialSecurityNumber.socialSecurityNumberBase;
    }
}