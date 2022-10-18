package PatientManagment;
import LocationPackage.*;
//test update

 /**
    *This class can add appointments, add patients to the system, and change the status of the patient */
public class Secretary extends Employee{
 
    public Secretary(String username, String password, String email, String phoneNum, UserType type, String name,
            int empID, Location location) {
        super(username, password, email, phoneNum, type, name, empID, location);

    }

    public void addAppointment() {} /**
    * adds appointment to doctor at location and patient */

    /**
     * Changes the status of the patient in patient list to in room
     * @param patient
     * @param room
     */
    public void changeStatusInRoom(Patient patient, int room) {
        patient.setStatus(Status.Room);
        patient.setRoom(room);
        System.out.println("Patient " + patient.getName() + " is in room " + patient.getRoom());
    }

    /**
     * Changes the status of the patient in patient list to Exiting and removes patient from patient list
     * @param patient
     */
    public void changeStatusExit(Patient patient) {
        patient.setStatus(Status.Exit);
        int id = patient.getId();
        for(int i = 0; i < location.getPatientList().size(); i++) {
            if(location.getPatientList().get(i).getId() == id) {
                System.out.println("Removing patient " + location.getPatientList().get(i).getName());
                location.getPatientList().remove(i);
            }
        }
    }

    /**
      * Adds patient to location and sets status to waiting
      * @param patient
      */
    public void addPatient(Patient patient) {
        location.addPatientList(patient);
        patient.setStatus(Status.WaitingRoom);
        System.out.println("Patient " + patient.getName() + " added");
    }
    
    /** 
     * @return String
     */
    public String getName() {
        return this.name;
    }

    
    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /** 
     * @return int
     */
    public int getEmpID() {
        return this.empID;
    }

    
    /** 
     * @param empID
     */
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    
    /** 
     * @return Location
     */
    public Location getLocation() {
        return this.location;
    }

    
    /** 
     * @param location
     */
    public void setLocation(Location location) {
        this.location = location;
    }


}
