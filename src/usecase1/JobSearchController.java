/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;


public class JobSearchController {
       @FXML private Stage stage;
       @FXML private Text actiontarget;
    private static JobSearchController theJobSearchController; 
        private ObservableList<Job> theListOfJobs;


     private JobSearchController(Stage theExistingStage){
        stage = theExistingStage;
        this.setUpJobSearchScene();
        stage.show();
    }
    public static JobSearchController getJobSearchController (Stage theStage){
        if(theJobSearchController != null){
            return theJobSearchController;
        }else{
            theJobSearchController = new JobSearchController(theStage);
            return theJobSearchController;
        }
    }
@FXML public void setUpJobSearchScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("JobSearch.fxml"));
            scene = new Scene(root);
            stage.setTitle("JobSearch");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    }
