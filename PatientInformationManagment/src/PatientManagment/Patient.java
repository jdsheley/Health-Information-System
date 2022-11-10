package PatientManagment;
import java.sql.Date;
import LocationPackage.*;
import java.util.ArrayList;
/**
    *This class is used as a model that holds all the patient information. The patient can also edit it's own insurance information and add a future appointment */

public class Patient extends User{ 

    private String address;
    private String symptoms; // Set by nurse
    private String heartRate; // Set by nurse
    private String bloodPressure; // Set by nurse
    private String diagnosis; // Set by doctor
    private String perscription; // Doctor sets this, Pharm views it
    private Status status; // Set by secretary, clears when patient leaves
    private Date futureAppointment; // Secretary set
    private int room; // Set by nurse clears when patient leaves
    private int id;
    private double bill;
    private Insurance insurance;// Insurance provider, can be altered by get and set methods
    private Location pharm; // The pharmacy that they prefer already in system
    private Location gp; // The gp they use already in system
    private Location currentLoc; // Their current location and systme they are in. IE if they enter a hospital or different GP
<<<<<<< Updated upstream
    //private ArrayList <String> pastPerscriptions;
    //private ArrayList <String> pastDiagnosis;
=======
    private ArrayList<String> pastPerscriptions;
    private ArrayList<String> pastDiagnosis;
>>>>>>> Stashed changes

    
    
    
    
    public Patient(String username, String password, String email, String phoneNum, UserType type, String name, int id) {
        super(username, password, email, phoneNum, type, name);
        
    }

    public ArrayList<String> getPastPerscriptions()
    {
        return this.pastPerscriptions;
    }

    public void setPastPerscriptions(ArrayList<String> pastPerscriptions)
    {
        this.pastPerscriptions = pastPerscriptions;
    }
    public ArrayList<String> getPastDiagnosis()
    {
        return this.pastDiagnosis;
    }

    public void setPastDiagnosis(ArrayList<String> pastDiagnosis)
    {
        this.pastDiagnosis = pastDiagnosis;
    }
    
    public double getBill() {
        return this.bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
    
    public void viewDiagnosis(Patient patient) {
        String diagnosis = patient.getDiagnosis();
        System.out.println(diagnosis);
    } /** 
    * View diagnosis from doctor */
    
    public void viewPrescription(Patient patient) {
        perscription = patient.getPerscription();
        System.out.println(perscription);
    } /** 
    * View Prescription */
    
    public Insurance getInsurance() {
        return this.insurance;
    }
    
    
    /** 
     * @param insurance
     */
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
    
    /** 
     * @return Status
     */
    public Status getStatus() {
        return this.status;
    }
    
    
    /** 
     * @return int
     */
    public int getId() {
        return this.id;
    }

    
    /** 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /** 
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }
    
    
    /** 
     * @return int
     */
    public int getRoom() {
        return this.room;
    }

    
    /** 
     * @param room
     */
    public void setRoom(int room) {
        this.room = room;
    }

    
    /** 
     * @return String
     */
    public String getSymptoms() {
        return this.symptoms;
    }

    
    /** 
     * @param symptoms
     */
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    
    /** 
     * @return String
     */
    public String getHeartRate() {
        return this.heartRate;
    }

    
    /** 
     * @param heartRate
     */
    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    
    /** 
     * @return String
     */
    public String getBloodPressure() {
        return this.bloodPressure;
    }

    
    /** 
     * @param bloodPressure
     */
    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    
    /** 
     * @return String
     */
    public String getDiagnosis() {
        return this.diagnosis;
    }

    
    /** 
     * @param diagnosis
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    
    /** 
     * @return String
     */
    public String getPerscription() {
        return this.perscription;
    }

    
    /** 
     * @param prescription
     */
    public void setPerscription(String prescription) {
        this.perscription = prescription;
    }

    
    /** 
     * @return Date
     */
    public Date getFutureAppointment() {
        return this.futureAppointment;
    }

    
    /** 
     * @param futureAppointment
     */
    public void setFutureAppointment(Date futureAppointment) {
        this.futureAppointment = futureAppointment;
    }

    
    /** 
     * @return String
     */
    public String getAddress() {
        return this.address;
    }

    
    /** 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    
    /** 
     * @return Location
     */
    public Location getPharm() {
        return this.pharm;
    }

    
    /** 
     * @param pharm
     */
    public void setPharm(Location pharm) {
        this.pharm = pharm;
    }

    
    /** 
     * @return Location
     */
    public Location getGp() {
        return this.gp;
    }

    
    /** 
     * @param gp
     */
    public void setGp(Location gp) {
        this.gp = gp;
    }

    
    /** 
     * @return Location
     */
    public Location getCurrentLoc() {
        return this.currentLoc;
    }

    
    /** 
     * @param currentLoc
     */
    public void setCurrentLoc(Location currentLoc) {
        this.currentLoc = currentLoc;
    }
}
