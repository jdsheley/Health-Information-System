package LoginPackage;
import java.util.ArrayList;
import PatientManagment.*;

public class LoginController {
    private LoginUI theLoginUI;
    private UserList theUserList;
    PatientTableUI patientTable;
    PatientTableController controller;
    PatientTableUI tableUI;
    
    public LoginController(ArrayList<Patient> patientList){
        theUserList = new UserList(patientList);
    }

    public UserList getUserList(){

        return theUserList;
    }
    
    public void showLoginUI(LoginUI loginUI){
        this.theLoginUI = loginUI;
        theLoginUI.showTest();
    }
    
    public void requestAuthenticate(String userName, String password){ //Add another screen option for the patient view
        if(theUserList.authenticate(userName, password)==true){
            System.out.println("Valid user");
            theLoginUI.close();
            controller.show(tableUI);
        }
        else
            System.out.println("Invalid username/password");

    }

    public void setNextScreen() {
        System.out.println("Show table UI");
        
    }

    public void requestVerify(String captchaString){
        if(captchaString.equals("McoWxBAz")){
            System.out.println("Captcha Verified");
        }
        else{
            System.out.println("Invalid Captcha");
        }
    }

    public PatientTableController getController() {
        return this.controller;
    }

    public void setController(PatientTableController controller) {
        this.controller = controller;
    }

    public PatientTableUI getTableUI() {
        return this.tableUI;
    }

    public void setTableUI(PatientTableUI tableUI) {
        this.tableUI = tableUI;
    }
}
