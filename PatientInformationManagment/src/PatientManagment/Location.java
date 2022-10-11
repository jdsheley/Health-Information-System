package PatientManagment;
import java.util.ArrayList;
/**
    * Used as a model class, will hold the information of doctors, nurses etc and patients at the location */
public class Location { 
    private String name;
    private LocationType type;
    private String address;
    private ArrayList<Integer> rooms; //List of rooms in the location 
    private ArrayList<Patient> patientList; //List of patients CURRENTLY at location
    private ArrayList<Nurse> nurseList; //List of nurses that work at location
    private ArrayList<Doctor> doctorList; //List of doctors that work at location
    private ArrayList<Secretary> secretaryList; //List of doctors that work at location
    private ArrayList<Pharm> pharmList; //List of pharm at location. Location may be pharmacy and have none of the above positions



    public Location(String name, LocationType type, String address, ArrayList<Integer> rooms, ArrayList<Patient> patientList, ArrayList<Nurse> nurseList, ArrayList<Doctor> doctorList, ArrayList<Secretary> secretatyList, ArrayList<Pharm> pharmList) {
        this.rooms = rooms;
        this.patientList = patientList;
        this.nurseList = nurseList;
        this.doctorList = doctorList;
        this.secretaryList = secretatyList;
        this.pharmList = pharmList;
        this.name = name;
        this.type = type;
        this.address = address;
    }

    
    /** 
     * Gets rooms at location
     * @return ArrayList<Integer>
     */
    public ArrayList<Integer> getRooms() {
        return this.rooms;
    }

    
    /** 
     * Nurse updates rooms
     * @param rooms
     */
    public void setRooms(ArrayList<Integer> rooms) {
        this.rooms = rooms;
    }
    
    
    /** 
     * To view where to send perscription
     * @return ArrayList<Pharm>
     */
    public ArrayList<Pharm> getPharmList() {
        return this.pharmList;
    }

    
    /** 
     * Set by user
     * @param pharmList
     */
    public void setPharmList(ArrayList<Pharm> pharmList) {
        this.pharmList = pharmList;
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
     * Comes from enum where it is Hospital, GP, MedExpress, Pharmacy
     * @return LocationType
     */
    public LocationType getType() {
        return this.type;
    }

    
    /** 
     * @param type
     */
    public void setType(LocationType type) {
        this.type = type;
    }

    
    /** 
     * @return String
     */
    public String getAddress() {
        return this.address;
    }

    
    /** 
     * Set on creation
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    
    /** 
     * Accessed by doctor, nurse, secretary
     * @return ArrayList<Patient>
     */
    public ArrayList<Patient> getPatientList() {
        return this.patientList;
    }

    
    /** 
     * Set by secretary
     * @param patientList
     */
    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    /**
     * Adds patient to list in location when patient checks in
     * @param patient
     */  
    public void addPatientList(Patient patient) {
        patientList.add(patient);
    }

    
    /** 
     * @return ArrayList<Nurse>
     */
    public ArrayList<Nurse> getNurseList() {
        return this.nurseList;
    }

    
    /** 
     * @param nurseList
     */
    public void setNurseList(ArrayList<Nurse> nurseList) {
        this.nurseList = nurseList;
    }

    
    /** 
     * Viewed by patient to find doctor
     * @return ArrayList<Doctor>
     */
    public ArrayList<Doctor> getDoctorList() {
        return this.doctorList;
    }

    
    /** 
     * @param doctorList
     */
    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    
    /** 
     * @return ArrayList<Secretary>
     */
    public ArrayList<Secretary> getSecretaryList() {
        return this.secretaryList;
    }

    
    /** 
     * @param secList
     */
    public void setSecList(ArrayList<Secretary> secList) {
        this.secretaryList = secList;
    }

}
