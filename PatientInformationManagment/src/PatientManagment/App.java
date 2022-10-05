package PatientManagment;

import java.util.ArrayList;

import javax.print.Doc;

/** 
 * This will hold the main contents of the app
 */

public class App {
    
    
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> rooms = new ArrayList<Integer>();
        ArrayList<Patient> pList = new ArrayList<Patient>();
        ArrayList<Nurse> nurseList = new ArrayList<>();
        ArrayList<Doctor> doctorList = new ArrayList<>();
        ArrayList<Secretary> secList = new ArrayList<>();
        ArrayList<Pharm> pharmList = new ArrayList<>();

        Location testLoc = new Location("testHospital", LocationType.Hospital, "testH", rooms, pList, nurseList , doctorList, secList, pharmList);
        
        rooms.add(100);
        rooms.add(101);
        rooms.add(102);

        Patient testPatient = new Patient("testP", "testP", "testPEmail", "123456789", UserType.Patient, "TestP");
        Nurse testNurse = new Nurse("testN", "testN", "testNEmail", "1234567", UserType.Nurse, "testN", 100, testLoc );
        Doctor testDoctor = new Doctor("testD", "testD", "testDEmail", "123456789", UserType.Doctor, "TestD", 101, testLoc);
        Secretary testSecretary = new Secretary("testSec", "testSec", "testSEmail", "1234567", UserType.Secretary, "testSec", 102, testLoc);
        Pharm testPhar = new Pharm("testPharm", "testPharm", "testPharmEmail", "1234567", UserType.Pharm, "testPharm", 103, testLoc);


        System.out.println("Hello, World!");
    }
}
