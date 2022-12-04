package PatientInformationPackage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;  
import LocationPackage.*;
import PatientManagment.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ReadInfo {

    private File infoFile;
    private ArrayList<String> keyList = new ArrayList<>();
    private ArrayList<String> valueList = new ArrayList<>();
    private ArrayList<Patient> patientList = new ArrayList<>();
    private String key;
    private String value;

    public ReadInfo(File infoFile) {
        this.infoFile = infoFile;
    }

    public ArrayList<Patient> readString() { //HashMap<String, String>
        try (Scanner scnr = new Scanner(infoFile)) {
            while(scnr.hasNextLine()) {
                String keyPair = scnr.nextLine(); 

                if(keyPair.contains(":")) { //get key value pair
                    int location = keyPair.indexOf(":");
                    key = keyPair.substring(0, location);
                    value = keyPair.substring(location + 1);
                    keyList.add(key);
                    valueList.add(value);
                }

                if(keyPair.contains("///")) { //Create patient herell
                    Patient currentPatient = new Patient("", "", "", "", UserType.Patient, "", 0);

                    for(int i = 0; i < keyList.size(); i++) {
                        switch(keyList.get(i)) {
                            case "id":
                                currentPatient.setId(Integer.parseInt(valueList.get(i)));
                                break;
                            case "bill":
                                currentPatient.setBill(Double.parseDouble(valueList.get(i)));
                                break;
                            case "username":
                                currentPatient.setUsername(valueList.get(i));
                                break;
                            case "email":
                                currentPatient.setEmail(valueList.get(i));
                                break;
                            case "Perscription":
                                currentPatient.setPerscription(valueList.get(i));
                                break;
                            case "phoneNum":
                                currentPatient.setPhoneNum(valueList.get(i));
                            case "diagnosis":
                                currentPatient.setDiagnosis(valueList.get(i));
                                break; 
                            case "name":
                                currentPatient.setName(valueList.get(i));
                                break;
                            case "heartRate":
                                currentPatient.setHeartRate(valueList.get(i));
                                break;
                            case "address":
                                currentPatient.setAddress(valueList.get(i));
                                break;
                            case "password":
                                currentPatient.setPassword(valueList.get(i));
                                break;
                            case "bloodPressure": 
                                currentPatient.setBloodPressure(valueList.get(i));
                                break;
                            case "symptoms":
                                currentPatient.setSymptoms(valueList.get(i));
                                break;
                            default:
                                System.out.println("End Patient");
                                break;
                               
                        }
                    }

                    patientList.add(currentPatient); //Adds current patient to list and clears key and value pair for next iteration
                    System.out.println(currentPatient.getName());
                    keyList.clear();
                    valueList.clear();                  
                }


            }
            return patientList;


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return patientList;
        }
    }
    
}
