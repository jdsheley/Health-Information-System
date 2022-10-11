package PatientManagment;

import java.util.ArrayList;

/**
    * This class will be assigned to a locaiton and alter patient information like heartrate, and room number */
public class Nurse  extends Employee{ 
    
    UserInput input = new UserInput();

    public Nurse(String username, String password, String email, String phoneNum, UserType type, String name, int empID,
            Location location) {
        super(username, password, email, phoneNum, type, name, empID, location);
    }

    /**
    *Sets the room for patient */ 
    public void editPatientRoom(Patient patient, int room) {
        patient.setRoom(room);
    } 

    /**
     * Calls userInput to get nurse information entered
     * @return patient Info
     */
    public ArrayList<String> setPatientInfo() {
        ArrayList<String> patientInfo = new ArrayList<>();
        patientInfo.add(input.getHeartRate());
        patientInfo.add(input.getBloodPressure());
        patientInfo.add(input.getSymptoms());
        return patientInfo;
    }

    /**
    *Sets the heart rate, bp, and sypmtoms of patient  */
    public void addPatientCondition(Patient patient, String heartRate, String bloodPressure, String symptoms) {
        patient.setBloodPressure(bloodPressure);
        patient.setHeartRate(heartRate);
        patient.setSymptoms(symptoms);
        System.out.println("Patient info: " + patient.getSymptoms());
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
