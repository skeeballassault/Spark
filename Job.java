/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import java.io.Serializable;

/**
 *
 * @author Thaddeus
 */
public class Job implements Serializable {
     private String jobTitle = new String();
    private String jobDescription  = new String();
  
    
    public Job(String newJobName, String newJobDescription){
        jobTitle = newJobName;
        jobDescription = newJobDescription;
    }
    
   
    
    public String getJobTitle() {
        return jobTitle;
    }
    
    public void setJobTitle(String newJobTitle) {
        jobTitle = newJobTitle;
    }
        
    public String getJobDescription() {
        return jobDescription;
    }
    
    public void setJobDescription(String newJobDescription) {
        jobDescription = newJobDescription;
    }
    
}
