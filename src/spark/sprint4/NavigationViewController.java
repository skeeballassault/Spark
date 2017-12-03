/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark.sprint4;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author Nick
 */
public class NavigationViewController{
    @FXML private Text actiontarget;
    @FXML private Button profileButton;

    @FXML protected void handleExitButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Exit button pressed");
        Platform.exit();
    }
    
    @FXML protected void handleProfileButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Profile button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.hide();
        ProfileController theProfileController = ProfileController.getProfileController(window);
    }
    
    @FXML protected void handlePersonalityTestButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Personality Test button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.hide();
        PersonalityTestController thePersonalityTestController = PersonalityTestController.getPersonalityTestController(window);
    }
    /*
    @FXML protected void handleSearchJobsButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Search Jobs button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.hide();
        //ProfileController theProfileController = ProfileController.getProfileController(window);
    }
    
    @FXML protected void handlePostJobsButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Post Jobs button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.hide();
        //ProfileController theProfileController = ProfileController.getProfileController(window);
    }
    
    @FXML protected void handleCareerProfilesButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Career Profiles button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.hide();
        //ProfileController theProfileController = ProfileController.getProfileController(window);
    }
*/

}
