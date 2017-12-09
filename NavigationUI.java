/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class NavigationUI {
    @FXML private Button jobSearch;
    @FXML private Button actiontarget;
    @FXML private Button jobPost;
    @FXML private Button personalityTest;
    @FXML private Button Exit;
     
    
    @FXML protected void handleExitButtonAction(ActionEvent event) {
        actiontarget.setText("Exit button pressed");
        Platform.exit();
    }
    
    @FXML protected void handleUsersButtonAction(ActionEvent event) {
        //actiontarget.setText("Profile button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getProfileController(theStage);
    }
    @FXML protected void handleUC2ButtonAction(ActionEvent event) {
        //personalityTest.setText("Personality Test button pressed");
        Stage theStage = (Stage) personalityTest.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getTestController(theStage);
    }
    
    @FXML protected void handleUC3ButtonAction(ActionEvent event) {
        //jobPost.setText("Post Job button pressed");
        Stage theStage = (Stage) jobPost.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getPostJobController(theStage);
    }
    
        @FXML protected void handleUC4ButtonAction(ActionEvent event) {
        //jobSearch.setText("Job Seach button pressed");
        Stage theStage = (Stage) jobSearch.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getJobSearchController(theStage);

    }
}
