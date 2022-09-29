package PatientManagment;
 /**
    *This class is located at a pharmacy or hospital, and can view perscriptions and edit them */
public class Pharm extends User{

    private String name;
    private int empID;
    private Location location;
    // private ArrayList <Patient> patientList;
    
    public Pharm(String username, String password, String email, String phoneNum, UserType type) {
        super(username, password, email, phoneNum, type);
    }

    public void viewPrescription() {} /** 
    * Views perscription and alters status. May make perscriptions a class to add status to them */

    
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

    
    // /** 
    //  * @return ArrayList<Patient>
    //  */
    // public ArrayList<Patient> getPatientList()
    // {
	// 	return this.patientList;
	// }

    
    // /** 
    //  * @param patientList
    //  */
    // public void setPatientList (ArrayList<Patient> patientList)
    // {
	// 	this.patientList = patientList;
	// }


}
