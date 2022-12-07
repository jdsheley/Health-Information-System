package LoginPackage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import PatientInformationPackage.*;
import PatientManagment.*;

public class PatientDetailsController {
    private PatientDetailsUI thePatientDetailsUI;
    private UserList theUserList;
    private PatientTableController thePatientTableController;
    private PatientTableUI patientTableUI;
    private ArrayList<Patient> patientList;
    private Patient currentPatient;
    private String userType;
    private File file;

    public PatientDetailsController(PatientTableController thePatientTableController, ArrayList<Patient> patientList) {
        this.thePatientTableController = thePatientTableController;
        this.patientList = patientList;
    }

    public void setTableUI(PatientTableUI patientTableUI) {
        this.patientTableUI = patientTableUI;
    }

    public PatientTableController getThePatientTableController() {
        return thePatientTableController;
    }

    public void setThePatientTableController(PatientTableController thePatientTableController) {
        this.thePatientTableController = thePatientTableController;
    }

    public PatientDetailsUI getThePatientDetailsUI() {
        return thePatientDetailsUI;
    }

    public void setThePatientDetailsUI(PatientDetailsUI thePatientDetailsUI) {
        this.thePatientDetailsUI = thePatientDetailsUI;
    }

    public UserList getTheUserList() {
        return theUserList;
    }

    public void setTheUserList(UserList theUserList) {
        this.theUserList = theUserList;
    }

    public void showPatientDetailsUI(Patient currentPatient) {
        thePatientDetailsUI.setCurrentPatient(currentPatient); //Allows ui to get and populate patient info
        thePatientDetailsUI.makeVisible();
        this.currentPatient = currentPatient;
    }

    public Patient getCurrentPatient() {
        return currentPatient;
    }

    public void setCurrentUserType(String userType) {
        this.userType = userType;
    }

    // public void testUserType() {
    //     if(userType.equals("doctor")) {
    //         System.out.println("Doctor");
    //     }
    // }

    public void setFile(File file) {
        this.file = file;
    }

    public void savePatientInfo() {
        
        Patient update = currentPatient;

        for(int i = 0; i < patientList.size(); i++) {
            if(currentPatient.getName().equals(patientList.get(i).getName())) {
                patientList.remove(i);
            }
        }

        update.setName(thePatientDetailsUI.getNameTextField().getText());
        update.setRoom(Integer.parseInt(thePatientDetailsUI.getRoomTextField().getText()));
        update.setAddress(thePatientDetailsUI.getAddressTextField().getText());
        update.setId(Integer.parseInt(thePatientDetailsUI.getIDTextField().getText()));
        update.setSymptoms(thePatientDetailsUI.getSymptomsTextField().getText());
        update.setBill(Double.parseDouble(thePatientDetailsUI.getBillTextField().getText()));
        update.setHeartRate(thePatientDetailsUI.getHeartRateTextField().getText());
        update.setBloodPressure(thePatientDetailsUI.getBloodPressureTextField().getText());
        update.setDiagnosis(thePatientDetailsUI.getDioagnosisTextField().getText());
        update.setPerscription(thePatientDetailsUI.getPrescriptionTextField().getText());

        patientList.add(update);
        System.out.println(update.getName());


        try(FileWriter fileClear = new FileWriter(file, false)) { //This clears the file for the Filewriter in Write() Method
            fileClear.write("");
            fileClear.close();
        }
        catch (IOException x) {
            System.out.println("An error occurred in clearing file");
            x.printStackTrace();
        }

        for(int i = 0; i < patientList.size(); i++) { //Rewrites over file
            WriteInfo.assembleMap(patientList.get(i));
        }
    }

    public void goBack() {
        thePatientTableController.show(patientTableUI);
        thePatientDetailsUI.setVisible(false);
    }

    }

    /*On save button, use if statements depending on each login case of what to save */