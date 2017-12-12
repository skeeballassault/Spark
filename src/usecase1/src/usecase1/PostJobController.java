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


public class PostJobController {
       @FXML private Stage stage;
       @FXML private Text actiontarget;
    private static PostJobController thePostJobController; 

     private PostJobController(Stage theExistingStage){
        stage = theExistingStage;
        this.setUpPostJobScene();
        stage.show();
    }
    public static PostJobController getPostJobController(Stage theStage){
        if(thePostJobController != null){
            thePostJobController.setUpPostJobScene();
            return thePostJobController;
        }else{
            thePostJobController = new PostJobController(theStage);
            return thePostJobController;
        }
    }
@FXML public void setUpPostJobScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("PostJob.fxml"));
            scene = new Scene(root);
            stage.setTitle("Post Job");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    }
  