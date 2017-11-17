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


public class NavigationController {
    
    @FXML private Stage stage;
    @FXML private Text actiontarget;
    private static NavigationController theNavigationController;
    
    private NavigationController(Stage theExistingStage){
        stage = theExistingStage;
        this.setUpNavigationScene();
        stage.show();
    }
    
    public static NavigationController getNavigationController(Stage theStage){
        if(theNavigationController != null){
            return theNavigationController;
        }else{
            theNavigationController = new NavigationController(theStage);
            return theNavigationController;
        }
    }
    
    @FXML public void setUpNavigationScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("Navigation.fxml"));
            scene = new Scene(root);
            stage.setTitle("Navigation");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void getProfileController(Stage theStage){
        ProfileController.getProfileController(theStage);
    }
    public void getTestController(Stage theStage){
        TestController.getTestController(theStage);
    }
    
    public void exit(){
        System.exit(0);
    } 
}