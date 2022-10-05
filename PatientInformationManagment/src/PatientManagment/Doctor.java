package PatientManagment;
import java.sql.Date;
import java.util.ArrayList;
/**
    * This class will be assigned to a location and be able to alter diagnosis and add a perscription*/
public class Doctor extends Employee{ 

    private ArrayList<Date> futureAppointments;
    
    public Doctor(String username, String password, String email, String phoneNum, UserType type, String name, int empID, Location location) {
        super(username, password, email, phoneNum, type, name, empID, location); 
    }

    
    public void addDiagnosis() {} /** 
    * Adds the diagnosis to the patient */

    public void addPerscription() {} /** 
    * Adds perscription */
    

    
    /** 
     * Accessed by secretary to view appointment
     * @return ArrayList<Date>
     */
    public ArrayList<Date> getFutureAppointments()
    {
        return this.futureAppointments;
    }

    
    /** 
     * Accessed by secretary to set future appointment
     * @param futureAppointments
     */
    public void setFutureAppointments(ArrayList<Date> futureAppointments)
    {
        this.futureAppointments = futureAppointments;
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
     * Used to view where doctor is so patient can schedule where
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
