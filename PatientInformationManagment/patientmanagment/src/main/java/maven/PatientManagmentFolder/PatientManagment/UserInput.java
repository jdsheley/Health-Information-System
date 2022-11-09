package maven.PatientManagmentFolder.PatientManagment;
import java.util.Scanner;

/**
 * To be deleted with the addition of UI
 */
public class UserInput {
    Scanner scnr = new Scanner(System.in);

    public String getBloodPressure() {
        System.out.println("Enter Patient Blood Pressure Here: ");
        String bloodPressure = scnr.nextLine();
        return bloodPressure;
    }

    public String getHeartRate(){
        System.out.println("Enter Patient heart rate here: ");
        String heartRate = scnr.nextLine();
        return heartRate;
    }
 
    public String getSymptoms() {
        System.out.println("Enter Patient Sympotoms here: ");
        String symptoms = scnr.nextLine();
        return symptoms;
    }

    public String addDiagnosis() {
        System.out.println("Enter Diagnosis here: ");
        String diagnosis = scnr.nextLine();
        return diagnosis;
    }

    public String addPerscription() {
        System.out.println("Enter Perscription here: ");
        String perscription = scnr.nextLine();
        return perscription;
    }


}





















