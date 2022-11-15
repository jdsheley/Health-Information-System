package PatientManagment;
import LoginPackage.*;
//import PatientInformationPackage.*;


/** 
 * This will hold the main contents of the app
 */

public class App {
     
    public static void main(String[] args) throws Exception {
        // panel for viewing the list of patients, will appear after logging in

        // login panel, will come firs†
        LoginUI testLogin;
        LoginController loginController;
        PatientTableUI tableUI;
        PatientTableController tableControl = new PatientTableController();
        loginController = new LoginController();
        testLogin = new LoginUI(loginController);
        loginController.showLoginUI(testLogin);
        tableUI = new PatientTableUI(tableControl);
        tableControl.setPatientTableUI(tableUI);
        tableControl.show();
    }
}
