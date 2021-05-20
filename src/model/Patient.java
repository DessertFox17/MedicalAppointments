package model;

public class Patient extends User {

    //Atributes

    private String birthday;
    private double weight;
    private double heigh;
    private String blood;

    //Constructor
    public Patient(String name, String email) {
        super(name, email);
    }

    //Getters y Setters

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight + " kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeigh() {
        return heigh + " mts";
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + ", Age: "+birthday + "\nWeight: "+weight+getWeight()+
                ", Height: "+getHeigh()+", RH: "+blood;
    }
}
