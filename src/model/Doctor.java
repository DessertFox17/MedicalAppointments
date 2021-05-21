package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    //Atributes
    private String speciality;
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //Constructor
    public Doctor(String name, String email) {
        super(name, email);
    }

    //Static subclass
    public void addAvailableAppointment(String date, String time) throws ParseException {

        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment {

        //Atributes
        int idAvailableAppointment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        //Constructor
        public AvailableAppointment(String date, String time) throws ParseException {
            this.date = format.parse(date);
            this.time = time;
        }

        //Getters y Setters
        public int getIdAvailableAppointment() {
            return idAvailableAppointment;
        }

        public void setIdAvailableAppointment(int idAvailableAppointment) {
            this.idAvailableAppointment = idAvailableAppointment;
        }

        public Date getDate() {
            return date;
        }

        public String getDate(String DATE) {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "\nDate: "+date+
                    "\nTime: "+time;
        }
    }

    //Getters and Setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString()+", Speciality: "+speciality+","
                +"\nAvailable appointments: "+availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Employee from Red Cross hospital");
        System.out.println("Employee from Oncology departament");
    }
}
