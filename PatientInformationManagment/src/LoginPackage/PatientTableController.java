package LoginPackage;

import java.util.ArrayList;

import PatientManagment.User;

public class PatientTableController {
    private ArrayList<User> patientList;
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

    public PatientTableController() {
        userList = new UserList();
        patientList = userList.getListOfUsers();
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
