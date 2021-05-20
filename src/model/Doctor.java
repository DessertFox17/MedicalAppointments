package model;

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
    public void AvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppintments(){
        return availableAppointments;
    }

    public static class AvailableAppointment {

        //Atributes
        int idAvailableAppointment;
        private Date date;
        private String time;

        //Constructor
        public AvailableAppointment(Date date, String time) {
            this.date = date;
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
}
