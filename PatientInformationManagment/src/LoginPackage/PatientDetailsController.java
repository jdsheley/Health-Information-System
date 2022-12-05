package LoginPackage;
import PatientInformationPackage.*;
import PatientManagment.*;

public class PatientDetailsController {
    private PatientDetailsUI thePatientDetailsUI;
    private UserList theUserList;
    private PatientTableController thePatientTableController;

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

    public void showPatientDetailsUI() {
        thePatientDetailsUI.makeVisable();
        System.out.println("Showw");
    }
}
