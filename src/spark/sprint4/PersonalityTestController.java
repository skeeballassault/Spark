/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark.sprint4;

import java.io.IOException;
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
public class PersonalityTestController {
    @FXML private Stage stage;
    @FXML private Text actiontarget;
    private static PersonalityTestController thePersonalityTestController;
    
    private PersonalityTestController(Stage theStage) throws IOException{
        stage = theStage;
        Parent personalityTestViewParent = FXMLLoader.load(getClass().getResource("PersonalityTestView.fxml"));
        Scene personalityTestViewScene = new Scene(personalityTestViewParent);
        
        stage.setScene(personalityTestViewScene);
        stage.show();
    }
    
    public static PersonalityTestController getPersonalityTestController(Stage theStage) throws IOException{
        if(thePersonalityTestController != null){            
            thePersonalityTestController.setUpPersonalityTestScene();
            return thePersonalityTestController;
        }else{
            thePersonalityTestController = new PersonalityTestController(theStage);
            return thePersonalityTestController;
        }
    }
    
    @FXML public void setUpPersonalityTestScene() throws IOException{
        Parent personalityTestViewParent = FXMLLoader.load(getClass().getResource("PersonalityTestView.fxml"));
        Scene personalityTestViewScene = new Scene(personalityTestViewParent);
        
        stage.setTitle("Personality Test Window");
        stage.setScene(personalityTestViewScene);        
        stage.show();
    }
}
