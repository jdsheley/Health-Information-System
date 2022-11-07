package PatientManagment;

import java.io.*;
import java.util.ArrayList;

public class UserList {
    private ArrayList<User> listOfUsers = new ArrayList<>();
    private String userFileName = "userFileName.ser";

    public UserList() {
        this.readUserListFile();
        if(listOfUsers.isEmpty() || listOfUsers == null){
            this.createUserList();
            this.writeUserListFile();
            this.readUserListFile();
        }
    }

    public void createUserList(){

        User u1 = new User("Joewhite", "password", "joe@psu.edu", "2157206172", "Joe White");

        listOfUsers.add(u1);
    }

    public void readUserListFile(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(userFileName);
            in = new ObjectInputStream(fis);
            listOfUsers = (ArrayList)in.readObject();
            in.close();
            if(!listOfUsers.isEmpty()){
                System.out.println("There are users in the file");
            }
        } catch(FileNotFoundException fne){
            System.out.println("File not found, file will be created");
        } catch(IOException ex){
            ex.printStackTrace();
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public void writeUserListFile(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try{
            fos = new FileOutputStream(userFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(listOfUsers);
            out.close();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public void printUserList(){
        System.out.println("The user list has these people");
        for(User u : listOfUsers){
            System.out.println(u.toString());
        }

    }

    public ArrayList<User> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(ArrayList<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

    public boolean authenticate(String userName, String pw){
        for(User u:listOfUsers){
            if(userName.equals(u.getUsername()) && pw.equals(u.getPassword())){
                return true;
            }
        }
        return false;
    }
}
