package PatientManagment;


public class LoginController {
    private LoginUI theLoginUI;
    private UserList theUserList;
    public LoginController(){
        theUserList = new UserList();
        theLoginUI = new LoginUI(this);

        showLoginUI();
    }
    public UserList getUserList(){

        return theUserList;
    }
    public void showLoginUI(){

        theLoginUI.setVisible(true);
    }
    public void requestAuthenticate(String userName, String password){
        if(theUserList.authenticate(userName, password)==true){
            System.out.println("Valid user");
        }
        else
            System.out.println("Invalid username/password");

    }
    
}
