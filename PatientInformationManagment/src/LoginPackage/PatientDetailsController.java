package LoginPackage;
import PatientInformationPackage.*;
import PatientManagment.*;

public class PatientDetailsController {
    private PatientDetailsUI thePatientDetailsUI;
    private UserList theUserList;
    private PatientTableController thePatientTableController;
    private Patient currentPatient;

    public PatientDetailsController(PatientTableController thePatientTableController) {
        this.thePatientTableController = thePatientTableController;
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
    }

    public Patient getCurrentPatient() {
        return currentPatient;
    }
    

    }
