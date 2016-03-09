package acy.iut.theviborationuniversity;

/**
 * Created by houdayec on 09/03/2016.
 */
public class Profil {

    private int id;
    private String lastName;
    private String firstName;
    private int age;
    private String sexe;
    private String pathImage;

    public Profil(){}

    public Profil(String lastName, String firstName, int age, String sexe){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.sexe = sexe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String isbn) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String titre) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(String titre) {
        this.age = age;
    }

    public String toString(){
        return firstName + " ||" + lastName;
    }

}
