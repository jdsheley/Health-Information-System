package PatientManagment;
import LocationPackage.*;

public class Employee extends User{

    protected int empID;
    protected Location location;

    
    public Employee(String username, String password, String email, String phoneNum, String type, String name, int empID, Location location) {
        super(username, password, email, phoneNum, type, name);
        this.name = name; 
        this.empID = empID;
        this.location = location;
    }
    
    public int getEmpID() {
        return this.empID;
    }
    
    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    
}
