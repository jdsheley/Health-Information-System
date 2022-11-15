package LoginPackage;

public class PatientTableController {
    private PatientList thePatientList;
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
        thePatientList = new PatientList();
        thePatientTableModel = new PatientTableModel(thePatientList.getThePatientArrayList());

    }

    public void show(PatientTableUI tableUI) {
        System.out.println("show Table");
        tableUI.showTable();
    }

    public PatientTableModel getThePatientTableModel() {
        return thePatientTableModel;
    }
}
