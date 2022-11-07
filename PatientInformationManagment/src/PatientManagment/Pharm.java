package PatientManagment;
import LocationPackage.*;
 /**
    *This class is located at a pharmacy or hospital, and can view perscriptions and edit them */
public class Pharm extends User{

    public Pharm(String username, String password, String email, String phoneNum, UserType type, String name, int empID, Location location) {
        super(username, password, email, phoneNum, name);
        //TODO Auto-generated constructor stub
    }


    public void viewPrescription(Patient patient) {
        String prescription = patient.getPerscription();
        System.out.println(prescription);
    } /** 
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
