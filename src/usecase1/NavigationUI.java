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
    @FXML private Text actiontarget;
    
    
    @FXML protected void handleExitButtonAction(ActionEvent event) {
        actiontarget.setText("Exit button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        NavigationController.getNavigationController(theStage).exit();
    }
    
    @FXML protected void handleUsersButtonAction(ActionEvent event) {
        actiontarget.setText("Profile button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getProfileController(theStage);
    }
    @FXML protected void handleUC2ButtonAction(ActionEvent event) {
        actiontarget.setText("Personality Test button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getTestController(theStage);
    }
    
    @FXML protected void handleUC3ButtonAction(ActionEvent event) {
        actiontarget.setText("Post Job button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getPostJobController(theStage);
    }
    
        @FXML protected void handleUC4ButtonAction(ActionEvent event) {
        actiontarget.setText("Job Seach button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationController.getNavigationController(theStage).getJobSearchController(theStage);

    }
}
