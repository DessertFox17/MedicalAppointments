package ui;

import model.Doctor;
import model.Nurse;
import model.Patient;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public static Nurse nurseLogged;

    public static void showMenu() throws ParseException {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("3. Nurse");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    response = 0;
                    System.out.println("Doctor");
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    System.out.println("Patient");
                    authUser(2);
                    break;
                case 3:
                    response = 0;
                    System.out.println("Nurse");
                    authUser(3);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    private static void authUser(int userType) throws ParseException {
        //UserType = 1 -> Doctor / UserType = 2 -> Patient / UserType = 3 -> Nurse

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martínez", "martinez.alejandro@yopmail.com"));
        doctors.add(new Doctor("Karen Sossa", "sossa.karen@yopmail.com"));
        doctors.add(new Doctor("Diego Muñez", "munez.diego@yopmail.com"));
        doctors.add(new Doctor("Carlos Perea", "perea.carlos@yopmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Juan Arango", "arango.juan@yopmail.com"));
        patients.add(new Patient("Daniel Arango", "arango.daniel@yopmail.com"));
        patients.add(new Patient("Manuel Pérez", "perez.manuel@yopmail.com"));

        ArrayList<Nurse> nurses = new ArrayList<>();
        nurses.add(new Nurse("Leidy Toro", "toro.leidy@yopmail.com"));
        nurses.add(new Nurse("Luisa Ochoa", "ochoa.luisa@yopmail.com"));
        nurses.add(new Nurse("Maria Rojo", "rojo.maria@yopmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Obtain doctor logged
                        doctorLogged = d;
                        //Show doctor menu
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if (userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Obtain patient logged
                        patientLogged = p;
                        //Show patient menu
                    }
                }
            }
            if (userType == 3) {
                for (Nurse n : nurses) {
                    if (n.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Obtain nurse logged
                        nurseLogged = n;
                        //Show nurse menu
                    }
                }
            }


        } while (!emailCorrect);
    }

    static void showPatientMenu() throws ParseException {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }

}
