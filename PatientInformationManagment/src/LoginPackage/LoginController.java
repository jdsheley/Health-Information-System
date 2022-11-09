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
<<<<<<< HEAD
<<<<<<< HEAD
            patientListView.showPatientList();

=======
>>>>>>> parent of 00c8c24 (Added patient list screen)
=======
>>>>>>> parent of 00c8c24 (Added patient list screen)
        }
        else
            System.out.println("Invalid username/password");

    }
    
}
