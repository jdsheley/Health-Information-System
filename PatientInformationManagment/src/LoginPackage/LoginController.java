package LoginPackage;


public class LoginController {
    private GUI loginUI;
    PatientListView patientListView = new PatientListView();
    private UserList theUserList;

    public LoginController(){
        theUserList = new UserList();
    }

    public UserList getUserList(){
        return theUserList;
    }
    
    public void showLoginUI(GUI loginUI){
        this.loginUI = loginUI;
        loginUI.showLogin();
    }
    
    public void requestAuthenticate(String userName, String password){
        if(theUserList.authenticate(userName, password)==true){
            System.out.println("Valid user");
            patientListView.showPatientList();
        }
        else
            System.out.println("Invalid username/password");

    }
    
}
