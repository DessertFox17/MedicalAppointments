import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Juan Arango","jblackheart@yopmail.com");
        myDoctor.AvailableAppointment(new Date(),"4:00 pm");
        myDoctor.AvailableAppointment(new Date(),"2:00 pm");
        myDoctor.AvailableAppointment(new Date(),"10:00 am");

        System.out.println(myDoctor);

        System.out.println(myDoctor.getAvailableAppintments());

        for (Doctor.AvailableAppointment avApp: myDoctor.getAvailableAppintments()) {
            System.out.println(avApp.getDate() + " " + avApp.getTime());
        }

        System.out.println();
        System.out.println();

        Patient patient = new Patient("Alejandra","alejandra@yopmail.com");
        System.out.println(patient);


    }
}
