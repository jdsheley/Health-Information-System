package PatientManagment;
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

    public void changeStatus() {} /** 
    * changes status of patient at location */

    public void addPatient() {} /** 
    * Adds patient to the location */
    
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
