package PatientManagment;
import LoginPackage.*;
//import PatientInformationPackage.*;


/** 
 * This will hold the main contents of the app
 */

public class App {
     
    public static void main(String[] args) throws Exception {
        PatientTableController p = new PatientTableController();

        LoginUI testLogin;
        LoginController loginController;
        loginController = new LoginController();
        testLogin = new LoginUI(loginController);
        loginController.showLoginUI(testLogin);

        
    }
}
