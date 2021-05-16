
public class Doctor {
    //Atributes
     static int id = 0; //Should be autoincrement
     String name;
     String speciality;

    //Constructor
    Doctor(){
        id ++;
        this.name = "Nombre por defecto";
        this.speciality = "Especialidad por defecto";

    }

    Doctor(String name, String speciality){
        id ++;
        this.name = name;
        this.speciality = speciality;

    }

    //Behaviors
    public void showName() {
        System.out.println(name);
    }

    public void showId(){
        System.out.println(String.format("Doctor id: %s",id));
    }


}
