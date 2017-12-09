/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;
import javafx.collections.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Thaddeus
 */
public class JobList implements Serializable {
       private ArrayList<Job> theListOfJobsA;
    
    public JobList(){
        theListOfJobsA = getTestJobs();
    }
    
    public ObservableList<Job> getJobData() {
        ObservableList<Job> theListOfJobs;
        List<Job> jobList = (List<Job>) theListOfJobsA;
        theListOfJobs = FXCollections.observableList(jobList);
        return theListOfJobs;
    }
    
    public ArrayList<Job> getTestJobs(){
        ArrayList<Job> testJobs = new ArrayList();
        for (int i = 0; i < 20; i++) {
            Job newJob = new Job(i + "JobTitle", i + "JobDescription");
            testJobs.add(newJob);
        }
        return testJobs;
    }
    
}
