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
    private HashMap<String, String> strings = new HashMap<>();
    private HashMap<String, Integer> ints = new HashMap<>();
    private HashMap<String, Double> doubles = new HashMap<>();
    private ArrayList<HashMap> hashList = new ArrayList<>();
    private HashMap<String, String> masterList = new HashMap<>();
    private String key;
    private String value;

    public ReadInfo(File infoFile) {
        this.infoFile = infoFile;
    }

    public HashMap<String, String> readString() { //HashMap<String, String>
        try (Scanner scnr = new Scanner(infoFile)) {
            while(scnr.hasNextLine()) {
                String keyPair = scnr.nextLine(); 

                if(keyPair.contains(":")) { //get key value pair
                    int location = keyPair.indexOf(":");
                    key = keyPair.substring(0, location);
                    value = keyPair.substring(location + 1);
                    System.out.println(key + " " + value);
                    masterList.put(key, value);
                }

                switch(key) {
                    case "id":
                        ints.put(key, Integer.parseInt(value));
                        System.out.println("Int Added");
                        break;
                    
                    case "bill":
                        doubles.put(key, Double.parseDouble(value));
                        System.out.println("Double added");
                        break;

                    default :
                        strings.put(key, value);
                        System.out.println("String added");
                }

            }

            hashList.add(strings);
            hashList.add(ints);
            hashList.add(doubles);

            return masterList;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return masterList;
        }
    }
    
}
