package PatientManagment;
import java.util.ArrayList;
/**
    *This class can view the payment information of the patient and the diagnosis */
public class Insurance extends Employee{ 
   
    private ArrayList<Patient> patientList; // List of users with insurance
    
    public Insurance(String username, String password, String email, String phoneNum, UserType type, String name, int empID, Location location) {
        super(username, password, email, phoneNum, type, name, empID, location);
    }
    

    public void viewBill(Patient patient) {
        Double bill = patient.getBill();
        System.out.println(bill);
    } 

    public void viewDiagnosis(Patient patient) {
        String diagnosis = patient.getDiagnosis();
        System.out.println(diagnosis);
    } 
    
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

    
    /** 
     * @return ArrayList<Patient>
     */
    public ArrayList<Patient> getPatientList()
    {
        return this.patientList;
    }

    
    /** 
     * @param patientList
     */
    public void setPatientList(ArrayList<Patient> patientList)
    {
        this.patientList = patientList;
    }
}
