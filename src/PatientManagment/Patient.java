package PatientManagment;
import java.sql.Date;
/**
    *This class is used as a model that holds all the patient information. The patient can also edit it's own insurance information and add a future appointment */
public class Patient extends User{ 
    private String address;
    private Location pharm; // The pharmacy that they prefer already in system
    private Location gp; // The gp they use already in system
    private Location currentLoc; // Their current location and systme they are in. IE if they enter a hospital or different GP
    private Location insurance; // Insurance provider, can be altered by get and set methods
    private String room; // Set by nurse
    private String symptoms; // Set by nurse
    private String heartRate; // Set by nurse
    private String bloodPressure; // Set by nurse
    private String diagnosis; // Set by doctor
    private String prescription; // Doctor sets this, Pharm views it
    private Status status; // Set by secretary  
    private Date futureAppointment; // Secretary set
    
    public Patient(String username, String password, String email, String phoneNum, UserType type) {
        super(username, password, email, phoneNum, type);
    }
    
    public void viewDiagnosis() {} /** 
    * View diagnosis from doctor */

    public void viewPrescription() {} /** 
    * View Prescription */
    
    
    /** 
     * @return Status
     */
    public Status getStatus() {
        return this.status;
    }
    
    
    /** 
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    
    /** 
     * @return Location
     */
    public Location getInsurance() {
        return this.insurance;
    }

    
    /** 
     * @param insurance
     */
    public void setInsurance(Location insurance) {
        this.insurance = insurance;
    }
    
    
    /** 
     * @return String
     */
    public String getRoom() {
        return this.room;
    }

    
    /** 
     * @param room
     */
    public void setRoom(String room) {
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
    public String getPrescription() {
        return this.prescription;
    }

    
    /** 
     * @param prescription
     */
    public void setPrescription(String prescription) {
        this.prescription = prescription;
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
