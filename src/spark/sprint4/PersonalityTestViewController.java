/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spark.sprint4;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nick
 */
public class PersonalityTestViewController{
    
    @FXML private Text actiontarget;
    @FXML private TextArea questionField;
    @FXML private RadioButton answerA;
    @FXML private TextField answerFieldA;
    @FXML private RadioButton answerB;
    @FXML private TextField answerFieldB;
    @FXML private Button previousButton;
    @FXML private Button nextButton;
    @FXML private Button backButton;
    
    @FXML protected void handleBackButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Back button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.hide();
        NavigationController theNavigationController = NavigationController.getNavigationController(window);
            
    }
        
}
