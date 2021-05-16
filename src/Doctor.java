
public class Doctor {
    //Atributes
     static int id = 0; //Should be autoincrement
     String name;
     String speciality;

    //Constructor
    Doctor(){
        System.out.println("Building Doctor object");
        id ++;
    }

    //Behaviors
    public void showName() {
        System.out.println(name);
    }

    public void showId(){
        System.out.println(String.format("Doctor id: %s",id));
    }


}
