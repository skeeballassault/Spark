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

/**
 *
 * @author SHaynes
 */
public class TestController {
    
    @FXML private Stage stage;
    @FXML private Text actiontarget;
    private static TestController theTestController;
    
    private TestController(Stage theExistingStage){
        stage = theExistingStage;
        this.setUpTestScene();
        stage.show();
    }
    
    public static TestController getTestController(Stage theStage){
        if(theTestController != null){
            return theTestController;
        }else{
            theTestController = new TestController(theStage);
            return theTestController;
        }
    }
    
    @FXML public void setUpTestScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("Test.fxml"));
            scene = new Scene(root);
            stage.setTitle("Test");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void getProfileController(Stage theStage){
        ProfileController.getProfileController(theStage);
    }
    
    public void exit(){
        System.exit(0);
    }
}