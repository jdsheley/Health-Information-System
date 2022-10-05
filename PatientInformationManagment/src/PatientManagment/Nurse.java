package PatientManagment;
/**
    * This class will be assigned to a locaiton and alter patient information like heartrate, and room number */
public class Nurse  extends Employee{ 

    public Nurse(String username, String password, String email, String phoneNum, UserType type, String name, int empID,
            Location location) {
        super(username, password, email, phoneNum, type, name, empID, location);
        //TODO Auto-generated constructor stub
    }

    public void addPatientRoom() {} /**
    *Sets the room for patient */ 

    public void addPatientCondition() {} /**
    *Sets the heart rate, bp, and sypmtoms of patient  */
    
    
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
