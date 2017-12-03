/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark.sprint4;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Nick
 */
public class ProfileController {
    @FXML private Stage stage;
    @FXML private Text actiontarget;
    private static ProfileController theProfileController;
    
    private ProfileController(Stage theStage) throws IOException{
        stage = theStage;
        Parent profileViewParent = FXMLLoader.load(getClass().getResource("ProfileView.fxml"));
        Scene profileViewScene = new Scene(profileViewParent);
        
        stage.setScene(profileViewScene);
        stage.show();
    }
    
    public static ProfileController getProfileController(Stage theStage) throws IOException{
        if(theProfileController != null){            
            theProfileController.setUpProfileScene();
            return theProfileController;
        }else{
            theProfileController = new ProfileController(theStage);
            return theProfileController;
        }
    }
    
    @FXML public void setUpProfileScene() throws IOException{
        Parent profileViewParent = FXMLLoader.load(getClass().getResource("ProfileView.fxml"));
        Scene profileViewScene = new Scene(profileViewParent);
        
        stage.setTitle("Profile Window");
        stage.setScene(profileViewScene);        
        stage.show();
    }
}
