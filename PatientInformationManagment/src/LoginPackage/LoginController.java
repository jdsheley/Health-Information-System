package LoginPackage;


public class LoginController {
    private LoginUI theLoginUI;
    private UserList theUserList;

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
        }
        else
            System.out.println("Invalid username/password");

    }
    
}
