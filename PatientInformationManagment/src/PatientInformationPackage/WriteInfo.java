package PatientInformationPackage;
import java.util.HashMap;
import java.util.Iterator;
import java.io.File; 
import java.io.IOException;  
import LocationPackage.*;
import PatientManagment.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;

public class WriteInfo {
    public static HashMap <String, String> strings = new HashMap<>();
    public static HashMap <String, Integer> ints = new HashMap<>();
    public static HashMap <String, Double> doubles = new HashMap<>();
    public static HashMap <String, Insurance> insurance = new HashMap<>();
    public static HashMap <String, Location> locations = new HashMap<>();
    public static HashMap <String, ArrayList<String>> arrayLists = new HashMap<>();
    public static HashMap <String, Date> dates = new HashMap<>();
    static File file;

    public WriteInfo(File file) {
       this.file = file;
        try(FileWriter fileClear = new FileWriter(file, false)) { //This clears the file for the Filewriter in Write() Method
            fileClear.write("");
            fileClear.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred in clearing file");
            e.printStackTrace();
          }

    }


    public static void write() { //Will rewrite over file
        try {
            try (FileWriter patientWriter = new FileWriter(file, true)) {
                Iterator<String> stringIT = strings.keySet().iterator();
                while(stringIT.hasNext()) {
                    String key = stringIT.next();
                    String value = strings.get(key);
                    patientWriter.write(key + ":" + value+ "\n");
                }

                Iterator<String> intIT = ints.keySet().iterator();
                while(intIT.hasNext()) {
                    String key = intIT.next();
                    Integer value = ints.get(key);
                    patientWriter.write(key + ":" + value+ "\n");
                    // System.out.println(key + ":" + value+ "\n");
                }

                Iterator<String> doubleIT = doubles.keySet().iterator();
                while(doubleIT.hasNext()) {
                    String key = doubleIT.next();
                    Double value = doubles.get(key);
                    patientWriter.write(key + ":" + value + "\n");
                }

                patientWriter.write("/// \n");
            }
            
            // Iterator<String> insuranceIT = insurance.keySet().iterator();
            // while(insuranceIT.hasNext()) {
            //     String key = insuranceIT.next();
            //     Insurance value = insurance.get(key);
            //     patientWriter.write(key + ":" + value.getName());
            // }

            // Iterator<String> locationIT = locations.keySet().iterator();
            // while(locationIT.hasNext()) {
            //     String key = locationIT.next();
            //     Location value = locations.get(key);
            //     patientWriter.write(key + ":" + value.getName());
            // }

            // Iterator<String> arrayListsIT = arrayLists.keySet().iterator();
            // while(arrayListsIT.hasNext()) {
            //     String key = arrayListsIT.next();
            //     ArrayList<String> value = arrayLists.get(key);
            //     patientWriter.write(key + ":" + value.toString());
            // }

            // Iterator<String> datesIT = dates.keySet().iterator();
            // while(datesIT.hasNext()) {
            //     String key = datesIT.next();
            //     Date value = dates.get(key);
            //     patientWriter.write(key + ":" + value.toString());
            // }

        
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred in writing to file");
            e.printStackTrace();
          }
    }


    public static void assembleMap(Patient patient) {

        // This is what gets written to PatientInfo.txt

        strings.put("name",patient.getName());
        strings.put("username", patient.getUsername());
        strings.put("password", patient.getPassword());
        strings.put("email", patient.getEmail());
        strings.put("phoneNum", patient.getPhoneNum());
        strings.put("address", patient.getAddress());
        strings.put("symptoms", patient.getSymptoms());
        strings.put("heartRate", patient.getHeartRate());
        strings.put("bloodPressure", patient.getBloodPressure());
        strings.put("diagnosis", patient.getDiagnosis());
        strings.put("perscription", patient.getPerscription());
        dates.put("futureAppointments", patient.getFutureAppointment());
        ints.put("id", patient.getId());
        doubles.put("bill", patient.getBill());
        insurance.put("insurance", patient.getInsurance());
        locations.put("pharm", patient.getPharm());
        locations.put("gp", patient.getGp()); 
        locations.put("currentLoc", patient.getCurrentLoc());
        arrayLists.put("pastPerscriptions", patient.getPastPerscriptions());
        arrayLists.put("pastDiagnosis", patient.getPastDiagnosis()); 
        write();
    }

}


