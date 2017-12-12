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


public class CareerProfileController {
       @FXML private Stage stage;
       @FXML private Text actiontarget;
    private static CareerProfileController theCareerProfileController; 

     private CareerProfileController(Stage theExistingStage){
        stage = theExistingStage;
        this.setUpCareerProfileScene();
        stage.show();
    }
    public static CareerProfileController getCareerProfileController(Stage theStage){
        if(theCareerProfileController != null){
            theCareerProfileController.setUpCareerProfileScene();
            return theCareerProfileController;
        }else{
            theCareerProfileController = new CareerProfileController(theStage);
            return theCareerProfileController;
        }
    }
@FXML public void setUpCareerProfileScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("CareerProfile.fxml"));
            scene = new Scene(root);
            stage.setTitle("Career Profile");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    }
