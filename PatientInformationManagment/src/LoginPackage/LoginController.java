package LoginPackage;

import PatientManagment.Patient;

public class LoginController {
    private LoginUI theLoginUI;
    private UserList theUserList;
    PatientTableUI patientTable;
    PatientTableController listController;

    public PatientTableController getListController() {
        return this.listController;
    }

    public void setListController(PatientTableController listController) {
        this.listController = listController;
    }

    public LoginController(){
        theUserList = new UserList();
    }

    public UserList getUserList(){

        return theUserList;
    }
    
    public void showLoginUI(LoginUI loginUI){
        this.theLoginUI = loginUI;
        theLoginUI.showTest();
    }
    
    public void requestAuthenticate(String userName, String password){
        if(theUserList.authenticate(userName, password)==true){
            System.out.println("Valid user");
            theLoginUI.close();
            setNextScreen(listController, patientTable);
        }
        else
            System.out.println("Invalid username/password");

    }

    public void setNextScreen(PatientTableController controller, PatientTableUI tableUI) {
        System.out.println("Show table UI");
        controller.show(tableUI);
    }

    public void requestVerify(String captchaString){
        if(captchaString.equals("McoWxBAz")){
            System.out.println("Captcha Verified");
        }
        else{
            System.out.println("Invalid Captcha");
        }
    }
    
}
