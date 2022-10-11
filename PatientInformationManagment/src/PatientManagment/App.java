package PatientManagment;

import java.util.ArrayList;

/** 
 * This will hold the main contents of the app
 */

public class App {
     
    public static void main(String[] args) throws Exception {
        System.out.println("Test Harness Started");
        testHarness();
    }

    /**
     * Runs through scenario of patient walking into location. Being added, nurse updates, doctor updates and then leaves
     * Test case includes a patient already in system to simulate flow
     */
    public static void testHarness() {

        ArrayList<Integer> rooms = new ArrayList<Integer>();
        ArrayList<Patient> pList = new ArrayList<Patient>();
        ArrayList<Nurse> nurseList = new ArrayList<>();
        ArrayList<Doctor> doctorList = new ArrayList<>();
        ArrayList<Secretary> secList = new ArrayList<>();
        ArrayList<Pharm> pharmList = new ArrayList<>();

        Location testLoc = new Location("testHospital", LocationType.Hospital, "testH", rooms, pList, nurseList , doctorList, secList, pharmList);
        
        Patient testPatient = new Patient("testP", "testP", "testPEmail", "123456789", UserType.Patient, "TestP", 123);
        Nurse testNurse = new Nurse("testN", "testN", "testNEmail", "1234567", UserType.Nurse, "testN", 100, testLoc );
        Doctor testDoctor = new Doctor("testD", "testD", "testDEmail", "123456789", UserType.Doctor, "TestD", 101, testLoc);
        Secretary testSecretary = new Secretary("testSec", "testSec", "testSEmail", "1234567", UserType.Secretary, "testSec", 102, testLoc);
        Pharm testPhar = new Pharm("testPharm", "testPharm", "testPharmEmail", "1234567", UserType.Pharm, "testPharm", 103 , testLoc);
        
        rooms.add(100);
        rooms.add(101);
        rooms.add(102);

        nurseList.add(testNurse);
        doctorList.add(testDoctor);
        secList.add(testSecretary);
        pharmList.add(testPhar);

        testLoc.setPatientList(pList);
        testSecretary.addPatient(testPatient);
        testSecretary.changeStatusInRoom(testPatient, 100);
        ArrayList<String> patientInfo = testNurse.setPatientInfo();
        testNurse.addPatientCondition(testPatient, patientInfo.get(0), patientInfo.get(1), patientInfo.get(2));
        testDoctor.addDiagnosis(testPatient);
        testDoctor.addPerscription(testPatient);
    }
}
