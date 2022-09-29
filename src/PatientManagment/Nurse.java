package PatientManagment;
/**
    * This class will be assigned to a locaiton and alter patient information like heartrate, and room number */
public class Nurse  extends User{ 
    private String name;
    private int empID;
    private Location location;
    // private ArrayList<Patient> patientList;

    
    public Nurse(String username, String password, String email, String phoneNum, UserType type) {
        super(username, password, email, phoneNum, type);
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

    // public ArrayList<Patient> getPatientList()
    // {
    //     return this.patientList;
    // }

    // public void setPatientList (ArrayList<Patient> patientList)
    // {
    //     this.patientList = patientList;
    // }

}
