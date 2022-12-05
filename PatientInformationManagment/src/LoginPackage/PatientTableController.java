package LoginPackage;

import java.util.ArrayList;
import PatientManagment.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PatientTableController {
    private PatientTableModel thePatientTableModel;
    private PatientTableUI patientTableUI;
    private Patient currentPatient;
    private PatientDetailsUI patientDetailsUI;
    private PatientList thePatientList;


    private ArrayList<Patient> patientList;


    //private PatientController patientCntl;

    public PatientTableUI getPatientTableUI() {
        return patientTableUI;
    }

    public PatientTableController(){
        thePatientList = new PatientList();
        //patientTableUI = new PatientTableUI(this);


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
                    //return currentPatient;
            }
        }

    }

}

