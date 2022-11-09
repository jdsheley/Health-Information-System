package PatientInformationPackage;
import java.util.HashMap;
import java.io.File; 
import java.io.IOException;  
import LocationPackage.*;
import PatientManagment.*;
import java.io.FileWriter;
import java.util.ArrayList;

public class WriteInfo {


    static HashMap <String, String> strings = new HashMap<>();
    HashMap <String, Integer> ints = new HashMap<>();
    HashMap <String, Double> doubles = new HashMap<>();
    HashMap <String, Insurance> insurance = new HashMap<>();
    HashMap <String, Location> locations = new HashMap<>();
    HashMap <String, ArrayList<String>> arrayLists = new HashMap<>();

    public void writeInfo() {

    }

    public static void main(String[] args) {
        write();
    }

    public static void write() { //Will rewrite over file
        try {
            FileWriter patientWriter = new FileWriter("PatientInfo.txt");
            
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    public static void assembleMap(Patient patient) {
        //strings.put();
    }

}


