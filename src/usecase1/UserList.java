/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import java.util.*;
import java.io.*;
/**
 *
 * @author Nick
 */
public class UserList {
    private ArrayList<User> listOfUsers = new ArrayList<User>();
    private String listOfUsersFileName = "listOfUsers.ser";
    
    public UserList(){
        this.readUserListFile();
        if(listOfUsers.isEmpty() || listOfUsers == null){
            this.createTestUserList();
            this.writeUserListFile();
            this.readUserListFile();
        }
        this.printUserList();
    }
    
    public void readUserListFile(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(listOfUsersFileName);
            in = new ObjectInputStream(fis);
            listOfUsers = (ArrayList<User>)in.readObject();
            in.close();
            if(!listOfUsers.isEmpty()){
                System.out.println("There are users in the user list");
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    
    public void writeUserListFile(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(listOfUsersFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(listOfUsers);
            out.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void createTestUserList(){
        for (int i = 0; i < 20; i++){
            listOfUsers.add(new User("User" + i, "Password" + i));
        }
        System.out.println("Test UserList created");
        System.out.println("The UserList is: "+listOfUsers);
    }
    
    public void printUserList(){
        System.out.println("The UserList has these users:");
        for(int i = 0; i < listOfUsers.size(); i++){
            User currentUser = (User) listOfUsers.get(i);
            System.out.println(currentUser.getUsername());
        }
    }
    
    public ArrayList<String> getValidUsernames(){
        ArrayList<String> validUsernames = new ArrayList<String>();
        
        for(int i = 0; i < listOfUsers.size(); i++){
            User currentUser = (User) listOfUsers.get(i);
            validUsernames.add(currentUser.getUsername());
        }
        return validUsernames;
    }
    
    public ArrayList<String> getValidPasswords(){
        ArrayList<String> validPasswords = new ArrayList<String>();
        
        for(int i = 0; i < listOfUsers.size(); i++){
            User currentUser = (User) listOfUsers.get(i);
            validPasswords.add(currentUser.getPassword());
        }
        return validPasswords;
    }
}
