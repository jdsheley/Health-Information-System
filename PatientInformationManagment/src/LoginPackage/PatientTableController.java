package LoginPackage;

import java.util.ArrayList;

import PatientManagment.*;

public class PatientTableController {
    private UserList userList;
    private PatientTableModel thePatientTableModel;
    private PatientTableUI patientTableUI;
    //private PatientController patientCntl;

    public PatientTableUI getPatientTableUI() {
        return patientTableUI;
    }
    public void setPatientTableUI(PatientTableUI patientTableUI) {
        this.patientTableUI = patientTableUI;
    }

    public PatientTableController(ArrayList<Patient> patientList) {
        thePatientTableModel = new PatientTableModel(patientList);
    }

    public void show(PatientTableUI tableUI) {
        System.out.println("show Table");
        tableUI.showTable();
    }

    public PatientTableModel getThePatientTableModel() {
        return thePatientTableModel;
    }

}
