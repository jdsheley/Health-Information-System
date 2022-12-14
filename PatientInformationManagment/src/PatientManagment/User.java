package PatientManagment;
 /**
    *This is the base class for a user in the system. This can be a patient or healthcare provider*/
public class User {
    protected String username;
    protected String password;
    protected String email;
    protected String phoneNum;
    protected String type;
    protected String name;
    
    public User(String username, String password, String email, String phoneNum, String type2 , String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNum = phoneNum;
        this.name = name;
    }
    
    
    /** 
     * @return String
     */
    public String getName() {
        return this.name;
    }

    
    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
    public String getType() {
        return this.type;
    }

    
    /** 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

}
