package PatientManagment;
import LoginPackage.*;


/** 
 * This will hold the main contents of the app
 */

public class App {
     
    public static void main(String[] args) throws Exception {
        GUI testLogin;
        LoginController loginController;
        loginController = new LoginController();
        testLogin = new GUI(loginController);
        loginController.showLoginUI(testLogin);
    }
}
