package PatientManagment;
import LoginPackage.*;
//import PatientInformationPackage.*;


/** 
 * This will hold the main contents of the app
 */

public class App {
     
    public static void main(String[] args) throws Exception {
        // panel for viewing the list of patients, will appear after logging in
        PatientTableController p = new PatientTableController();

        // login panel, will come firs†
        LoginUI testLogin;
        LoginController loginController;
        loginController = new LoginController();
        testLogin = new LoginUI(loginController);
        loginController.showLoginUI(testLogin);


    }
}
