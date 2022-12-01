package LoginPackage;

import PatientManagment.*;
import PatientManagment.UserType;

import java.util.ArrayList;

public class PatientList {
    private ArrayList<User> listOfPatients = new ArrayList<>();
    private UserList listOfUsers;

    public PatientList() {
        this.formPatientList();
    }

    // add only users that are patients to the patient list
    public void formPatientList() {
        for (int i = 0; i < listOfPatients.size(); i++) {
            if (listOfUsers.getSpecificUser(i).getType() == UserType.Patient) {
                listOfPatients.add(listOfUsers.getSpecificUser(i));
            }
        }
    }

    public ArrayList<User> getThePatientArrayList() {
        return listOfPatients;
    }
}
