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

    public void show() {
        System.out.println("show Table");
        patientTableUI.setVisible(true);
    }

    public PatientTableModel getThePatientTableModel() {
        return thePatientTableModel;
    }
}
