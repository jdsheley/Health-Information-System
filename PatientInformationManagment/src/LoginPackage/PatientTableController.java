package LoginPackage;

import java.util.ArrayList;

import PatientInformationPackage.WriteInfo;
import PatientManagment.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class PatientTableController {
    private PatientTableModel thePatientTableModel;
    private PatientTableUI patientTableUI;
    private Patient currentPatient;
    private PatientDetailsUI patientDetailsUI;
    private PatientList thePatientList;
    private ArrayList<Patient> patientList;
    private File file;
    private PatientDetailsController detailController;



    //private PatientController patientCntl;

    public PatientTableUI getPatientTableUI() {
        return patientTableUI;
    }

    public PatientTableController(){
        thePatientList = new PatientList();
        //patientTableUI = new PatientTableUI(this);
    }

    public void setFile(File file) {
        this.file = file;
    }


    public void addPatient() {
            System.out.println("New button");
            //Creates a new patient. Also might display the new patient at some point, once I decide where to implement that.

            //This line creates a new patient with hardcoded info. Someone needs to make a UI that allows the user to input the info instead.
            Patient patient = new Patient("testuser3", "password", "abc@123.com", "1231231234", UserType.Patient, "Jeff", 0);
            patientList.add(patient);
       
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

    public void setDetailController(PatientDetailsController detailController) {
        this.detailController = detailController;
    }



    public void setPatientTableUI(PatientTableUI patientTableUI) {
        this.patientTableUI = patientTableUI;
    }

    public PatientTableController(ArrayList<Patient> patientList) {

        this.patientList = patientList;

        thePatientTableModel = new PatientTableModel(patientList);

    }



    public void show(PatientTableUI tableUI) {
        tableUI.showTable();
    }

    public PatientTableModel getThePatientTableModel() {
        return thePatientTableModel;
    }

    public PatientList getPatientList(){
        return thePatientList;
    }


    public void getSelectedPatient(String patientName) {

        System.out.println(patientList.size());
        
            System.out.println("Before if statement");
            for(int i = 0; i < patientList.size(); i++) {
                System.out.println("After for");
                if(patientName.equals(patientList.get(i).getName())) {
                    currentPatient = patientList.get(i);
                    System.out.println(currentPatient.getName());
            }
            detailController.showPatientDetailsUI();
            patientTableUI.setVisible(false);
        }


    }

}

