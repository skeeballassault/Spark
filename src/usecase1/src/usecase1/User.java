/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import java.io.Serializable;
/**
 *
 * @author Nick
 */
public class User implements Serializable{
    private String username;
    private String password;
    
    public User(String theUsername, String thePassword){
        username = theUsername;
        password = thePassword;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }
}
