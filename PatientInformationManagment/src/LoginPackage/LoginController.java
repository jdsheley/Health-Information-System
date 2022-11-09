package LoginPackage;


public class LoginController {
    private LoginUI theLoginUI;
    private UserList theUserList;
    PatientListView patientListView = new PatientListView();

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

            patientListView.showPatientList();
        }
        else
            System.out.println("Invalid username/password");

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
