/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class NavigationUI {
    @FXML private Text jobSearch;
    @FXML private Text actiontarget;
    @FXML private Text jobPost;
    @FXML private Text personalityTest;
    @FXML private Text Exit;
     
    
    @FXML protected void handleExitButtonAction(ActionEvent event) {
        Exit.setText("Exit button pressed");
        Stage theStage = (Stage) Exit.getScene().getWindow();
        NavigationController.getNavigationController(theStage).exit();
    }
    
    @FXML protected void handleUsersButtonAction(ActionEvent event) {
        actiontarget.setText("Profile button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getProfileController(theStage);
    }
    @FXML protected void handleUC2ButtonAction(ActionEvent event) {
        personalityTest.setText("Personality Test button pressed");
        Stage theStage = (Stage) personalityTest.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getTestController(theStage);
    }
    
    @FXML protected void handleUC3ButtonAction(ActionEvent event) {
        jobPost.setText("Post Job button pressed");
        Stage theStage = (Stage) jobPost.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getPostJobController(theStage);
    }
    
        @FXML protected void handleUC4ButtonAction(ActionEvent event) {
        jobSearch.setText("Job Seach button pressed");
        Stage theStage = (Stage) jobSearch.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getJobSearchController(theStage);

    }
}
