/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Thaddeus
 */
public class JobController {
    @FXML private Stage stage;
    private static JobController theJobController;
    private ObservableList<Job> theListOfJobs;
    
    private JobController(Stage theExistingStage){
        theListOfJobs = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getjobList().getJobData();
        stage = theExistingStage;
        this.setUpJobListScene();
        stage.show();
    }
    
    public static JobController getJobController(Stage theStage){
        if(theJobController != null){
            theJobController.setUpJobListScene();
            return theJobController;
        }else{
            theJobController = new JobController(theStage);
            return theJobController;
        }
    }
    
    @FXML public void setUpJobListScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("JobSearch.fxml"));
            scene = new Scene(root);
            stage.setTitle("Jobs");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void saveRow(Job newJob){
        PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getjobList().getJobData().add(newJob);
        PersistentDataCntl.getPersistentDataCntl().writeSerializedDataModel();
    }
    
    public ObservableList<Job> getListOfJobs(){
        return theListOfJobs;
    }
    
    public Stage getStage(){
        return stage;
    }

    void addJobRow(Job tempJob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
