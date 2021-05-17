import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    //Atributes
    static int id = 0; //Should be autoincrement
    private String email;
    private String name;
    private String speciality;
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //Constructors
    Doctor() {
        id++;
        this.name = "Nombre por defecto";
        this.speciality = "Especialidad por defecto";

    }

    Doctor(String name, String speciality) {
        id++;
        this.name = name;
        this.speciality = speciality;

    }

    //Behaviors
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println(String.format("Doctor id: %s", id));
    }

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
    }
}
