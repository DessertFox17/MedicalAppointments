import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Alejandro Pérez","Cardiologist");
        myDoctor.AvailableAppointment(new Date(),"4:00 pm");
        myDoctor.AvailableAppointment(new Date(),"2:00 pm");
        myDoctor.AvailableAppointment(new Date(),"10:00 am");

        System.out.println(myDoctor.getAvailableAppintments());

        for (Doctor.AvailableAppointment avApp: myDoctor.getAvailableAppintments()) {
            System.out.println(avApp.getDate() + " " + avApp.getTime());
        }

        //Patient patient = new Patient("Juan Arango", "jblackheart@yopmail.com");

    }
}
