package PatientManagment;
import LocationPackage.*;
import java.util.ArrayList;
import PatientInformationPackage.*;

/**
* Runs through scenario of patient walking into location. Being added, nurse updates, doctor updates and then leaves
* Test case includes a patient already in system to simulate flow
*/
public class testHarness {
    public static void main(String[] args) throws Exception {
        System.out.println("Test Harness Started");
        testHarnessGo();
    }

    public static void testHarnessGo() {

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
        Insurance testInsurance = new Insurance("testInsurance", "testInsurance", "testInsuranceEmail", "123456789", UserType.Insurance, "testInsurance", 145, testLoc);

        rooms.add(100);
        rooms.add(101);
        rooms.add(102);

        nurseList.add(testNurse);
        doctorList.add(testDoctor);
        secList.add(testSecretary);
        pharmList.add(testPhar);
        testPatient.setInsurance(testInsurance);

        WriteInfo testWriter = new WriteInfo();
        testWriter.assembleMap(testPatient);
        testWriter.write();


        /**
         * Simulates a patient walking in. A secretary adding the patient. The patient going to the room. The patient being treated by a nurse and doctor
         */
        // testLoc.setPatientList(pList);
        // testSecretary.addPatient(testPatient);
        // testSecretary.changeStatusInRoom(testPatient, 100);
        // ArrayList<String> patientInfo = testNurse.setPatientInfo();
        // testNurse.addPatientCondition(testPatient, patientInfo.get(0), patientInfo.get(1), patientInfo.get(2));
        // testDoctor.addDiagnosis(testPatient);
        // testDoctor.addPerscription(testPatient);
        // testInsurance.viewBill(testPatient);
        // testInsurance.viewDiagnosis(testPatient);
        // testPhar.viewPrescription(testPatient);
        // testPatient.viewDiagnosis(testPatient);
        // testPatient.viewPrescription(testPatient);


    }
}
