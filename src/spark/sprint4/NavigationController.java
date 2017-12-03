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
public class NavigationController {
    @FXML private Stage stage;
    @FXML private Text actiontarget;
    private static NavigationController theNavigationController;
    
    private NavigationController(Stage theStage) throws IOException{
        stage = theStage;
        this.setUpNavigationScene();
        
    }
    
    public static NavigationController getNavigationController(Stage theStage) throws IOException{
        if(theNavigationController != null){
            theNavigationController.setUpNavigationScene();
            return theNavigationController;
        }else{
            theNavigationController = new NavigationController(theStage);
            return theNavigationController;
        }
    }
    
    @FXML public void setUpNavigationScene() throws IOException{
        Parent navViewParent = FXMLLoader.load(getClass().getResource("NavigationView.fxml"));
        Scene navViewScene = new Scene(navViewParent);
        
        stage.setTitle("Navigation Window");
        stage.setScene(navViewScene);        
        stage.show();
    }
   
}
