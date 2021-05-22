package model;

public abstract class User {

    //Atributes
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    //Constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Getters and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("The phone number must contain mor that 8 digits max");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "User: "+name+", email: "+email+
                "\nAddress: "+address+", Phone: "+phoneNumber;
    }

    public abstract void showDataUser();

}
