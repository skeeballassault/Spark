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


public class ProfileController {
       @FXML private Stage stage;
       @FXML private Text actiontarget;
    private static ProfileController theProfileController; 

     private ProfileController(Stage theExistingStage){
        stage = theExistingStage;
        this.setUpProfileScene();
        stage.show();
    }
    public static ProfileController getProfileController(Stage theStage){
        if(theProfileController != null){
            theProfileController.setUpProfileScene();
            return theProfileController;
        }else{
            theProfileController = new ProfileController(theStage);
            return theProfileController;
        }
    }
@FXML public void setUpProfileScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("Profile.fxml"));
            scene = new Scene(root);
            stage.setTitle("Profile");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    }
  

    


