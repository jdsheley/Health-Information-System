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


    HashMap <String, String> strings = new HashMap<>();
    HashMap <String, Integer> ints = new HashMap<>();
    HashMap <String, Double> doubles = new HashMap<>();
    HashMap <String, Insurance> insurance = new HashMap<>();
    HashMap <String, Location> locations = new HashMap<>();
    HashMap <String, ArrayList<String>> arrayLists = new HashMap<>();
    HashMap <String, Date> dates = new HashMap<>();

    public void writeInfo() {

    }


    public void write() { //Will rewrite over file
        try {
            try (FileWriter patientWriter = new FileWriter("PatientInfo.txt")) {
                Iterator<String> stringIT = strings.keySet().iterator();
                while(stringIT.hasNext()) {
                    String key = stringIT.next();
                    String value = strings.get(key);
                    patientWriter.write(key + ":" + value+ "\n");
                }

                Iterator<String> intIT = strings.keySet().iterator();
                while(intIT.hasNext()) {
                    String key = intIT.next();
                    Integer value = ints.get(key);
                    patientWriter.write(key + ":" + value+ "\n");
                }

                Iterator<String> doubleIT = strings.keySet().iterator();
                while(doubleIT.hasNext()) {
                    String key = doubleIT.next();
                    Double value = doubles.get(key);
                    patientWriter.write(key + ":" + value + "\n");
                }
            }
            
            Iterator<String> insuranceIT = strings.keySet().iterator();
            while(insuranceIT.hasNext()) {
                String key = insuranceIT.next();
                Insurance value = insurance.get(key);
                //patientWriter.write(key + ":" + value.getName());
            }

            Iterator<String> locationIT = strings.keySet().iterator();
            while(locationIT.hasNext()) {
                String key = locationIT.next();
                Location value = locations.get(key);
                //patientWriter.write(key + ":" + value.getName());
            }

            Iterator<String> arrayListsIT = strings.keySet().iterator();
            while(arrayListsIT.hasNext()) {
                String key = arrayListsIT.next();
                ArrayList<String> value = arrayLists.get(key);
                //patientWriter.write(key + ":" + value.toString());
            }

            Iterator<String> datesIT = strings.keySet().iterator();
            while(datesIT.hasNext()) {
                String key = datesIT.next();
                Date value = dates.get(key);
                //patientWriter.write(key + ":" + value.toString());
            }

        
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

<<<<<<< Updated upstream
    public static void assembleMap(Patient patient) {
        //strings.put();
=======
    public void assembleMap(Patient patient) {
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
>>>>>>> Stashed changes
    }

}


