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
        tableUI.showTable();
    }

    public PatientTableModel getThePatientTableModel() {
        return thePatientTableModel;
    }

    public void getSelectedPatient(String patientName, ArrayList<Patient> patientList) {
        System.out.println(patientList.size());
        
            System.out.println("Before if statement");
            for(int i = 0; i < patientList.size(); i++) {
                System.out.println("After for");
                if(patientName.equals(patientList.get(i).getName())) {
                    Patient currentPatient = patientList.get(i);
                    System.out.println(currentPatient.getName());
                    //return currentPatient;
            }
        }

    }

}
