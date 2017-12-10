/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;


public class TestSuitabilityController {
       @FXML private Stage stage;
       @FXML private Text actiontarget;
    private static TestSuitabilityController theTestSuitabilityController; 

     private TestSuitabilityController(Stage theExistingStage){
        stage = theExistingStage;
        this.setUpTestSuitabilityScene();
        stage.show();
    }
    public static TestSuitabilityController getTestSuitabilityController(Stage theStage){
        if(theTestSuitabilityController != null){
            theTestSuitabilityController.setUpTestSuitabilityScene();
            return theTestSuitabilityController;
        }else{
            theTestSuitabilityController = new TestSuitabilityController(theStage);
            return theTestSuitabilityController;
        }
    }
@FXML public void setUpTestSuitabilityScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("TestSuitability.fxml"));
            scene = new Scene(root);
            stage.setTitle("Test Job Suitability");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    }
  
  

