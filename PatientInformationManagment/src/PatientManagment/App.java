package PatientManagment;
import LoginPackage.*;
import PatientInformationPackage.*;
import java.util.ArrayList;
import LocationPackage.Location;
import java.io.File;
import java.util.Scanner;
//import PatientInformationPackage.*;



/** 
 * This will hold the main contents of the app
 */

public class App {
     
    public static void main(String[] args) {
        //Removed from testharness 
        ArrayList<Integer> rooms = new ArrayList<Integer>();
        ArrayList<Patient> pList = new ArrayList<Patient>();
        ArrayList<Nurse> nurseList = new ArrayList<>();
        ArrayList<Doctor> doctorList = new ArrayList<>();
        ArrayList<Secretary> secList = new ArrayList<>();
        ArrayList<Pharm> pharmList = new ArrayList<>();
        Location testLoc = new Location("testHospital", LocationType.Hospital, "testH", rooms, pList, nurseList , doctorList, secList, pharmList); 
        Patient testPatient = new Patient("testP", "testP", "testPEmail", "123456789", UserType.Patient, "TestP", 123);
        Patient testPatient2 = new Patient("testP2", "test2P", "testP2Email", "123456789", UserType.Patient, "TestP2", 1234);
        File output = new File("../PatientInfo.txt");
        pList.add(testPatient);
        pList.add(testPatient2);

        //Should execute on close 
        WriteInfo testWriter = new WriteInfo(output);
        for(int i = 0; i < pList.size(); i++) {
            WriteInfo.assembleMap(pList.get(i));
        }

        //Execute at begining
        ReadInfo testReader = new ReadInfo(output);
        ArrayList<Patient> patientList = new ArrayList<>();
        patientList = testReader.readString();


        // login panel, will come firs†
        LoginUI testLogin;
        LoginController loginController;
        PatientTableUI tableUI;
        PatientTableController tableControl = new PatientTableController(patientList);
        loginController = new LoginController(patientList);
        testLogin = new LoginUI(loginController);
        loginController.showLoginUI(testLogin);
        
        //tableUI = new PatientTableUI(tableControl, patientList);
        tableUI = new PatientTableUI(tableControl, patientList);
        tableUI.setPatientList(patientList);
        tableControl.setPatientTableUI(tableUI);
        tableControl.setFile(output);
        loginController.setController(tableControl);
        loginController.setTableUI(tableUI);
        PatientDetailsController patientDetailCont = new PatientDetailsController(tableControl);
        PatientDetailsUI patientDetailUI = new PatientDetailsUI(patientDetailCont);
        patientDetailCont.setThePatientDetailsUI(patientDetailUI);
        patientDetailCont.showPatientDetailsUI();

        // tableControl.show();

    }

    // public static void testHarnessGo() {

    //     // ArrayList<Integer> rooms = new ArrayList<Integer>();
    //     // ArrayList<Patient> pList = new ArrayList<Patient>();
    //     // ArrayList<Nurse> nurseList = new ArrayList<>();
    //     // ArrayList<Doctor> doctorList = new ArrayList<>();
    //     // ArrayList<Secretary> secList = new ArrayList<>();
    //     // ArrayList<Pharm> pharmList = new ArrayList<>();

    //     Nurse testNurse = new Nurse("testN", "testN", "testNEmail", "1234567", UserType.Nurse, "testN", 100, testLoc );
    //     Doctor testDoctor = new Doctor("testD", "testD", "testDEmail", "123456789", UserType.Doctor, "TestD", 101, testLoc);
    //     Secretary testSecretary = new Secretary("testSec", "testSec", "testSEmail", "1234567", UserType.Secretary, "testSec", 102, testLoc);
    //     Pharm testPhar = new Pharm("testPharm", "testPharm", "testPharmEmail", "1234567", UserType.Pharm, "testPharm", 103 , testLoc);
    //     Insurance testInsurance = new Insurance("testInsurance", "testInsurance", "testInsuranceEmail", "123456789", UserType.Insurance, "testInsurance", 145, testLoc);

    //     // rooms.add(100);
    //     // rooms.add(101);
    //     // rooms.add(102);

    //     // nurseList.add(testNurse);
    //     // doctorList.add(testDoctor);
    //     // secList.add(testSecretary);
    //     // pharmList.add(testPhar);
    //     // testPatient.setInsurance(testInsurance);

    //     // File output = new File("C:\\Users\\Ethan\\OneDrive\\Documents\\GitHub\\Health-Information-System\\PatientInformationManagment\\src\\PatientManagment\\PatientInfo.txt");
    //     // WriteInfo testWriter = new WriteInfo();
    //     // testWriter.assembleMap(testPatient);
    //     // testWriter.write(output);
    //     // ReadInfo testReader = new ReadInfo();
    //     // testReader.readString(output);


    //     /**
    //      * Simulates a patient walking in. A secretary adding the patient. The patient going to the room. The patient being treated by a nurse and doctor
    //      */
    //     // testLoc.setPatientList(pList);
    //     // testSecretary.addPatient(testPatient);
    //     // testSecretary.changeStatusInRoom(testPatient, 100);
    //     // ArrayList<String> patientInfo = testNurse.setPatientInfo();
    //     // testNurse.addPatientCondition(testPatient, patientInfo.get(0), patientInfo.get(1), patientInfo.get(2));
    //     // testDoctor.addDiagnosis(testPatient);
    //     // testDoctor.addPerscription(testPatient);
    //     // testInsurance.viewBill(testPatient);
    //     // testInsurance.viewDiagnosis(testPatient);
    //     // testPhar.viewPrescription(testPatient);
    //     // testPatient.viewDiagnosis(testPatient);
    //     // testPatient.viewPrescription(testPatient);


    // }
}
