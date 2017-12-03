/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import java.io.*;

/**
 *
 * @author Thaddeus
 */
public class PeristentDataCollection implements Serializable{
    
    private JobList theJobList;
    // All other persistent data will go below here
    
    public PeristentDataCollection(){
        if(theJobList == null){
            theJobList = new JobList();
        }
    }
    
    public JobList getjobList(){
        return theJobList;
    }

  
}
    