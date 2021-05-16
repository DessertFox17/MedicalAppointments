import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Alejandro Pérez","Cardiologist");
        System.out.println(myDoctor.name+" "+myDoctor.speciality);
    }
}
