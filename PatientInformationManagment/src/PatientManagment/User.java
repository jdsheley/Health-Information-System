package PatientManagment;
 /**
    *This is the base class for a user in the system. This can be a patient or healthcare provider*/
public class User {
    private String username;
    private String password;
    private String email;
    private String phoneNum;
    private UserType type;


    public User(String username, String password, String email, String phoneNum, UserType type) {

    }
    
    /** 
     * @return String
     */
    public String getUsername() {
        return this.username;
    }

    
    /** 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    
    /** 
     * @return String
     */
    public String getPassword() {
        return this.password;
    }

    
    /** 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    
    /** 
     * @return String
     */
    public String getEmail() {
        return this.email;
    }

    
    /** 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    /** 
     * @return String
     */
    public String getPhoneNum() {
        return this.phoneNum;
    }

    
    /** 
     * @param phoneNum
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    
    /** 
     * @return UserType
     */
    public UserType getType() {
        return this.type;
    }

    
    /** 
     * @param type
     */
    public void setType(UserType type) {
        this.type = type;
    }

}
