/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;
import java.io.Serializable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Thaddeus
 */
public class PostJobUI implements Serializable {
     @FXML private Text actiontarget;
    @FXML private TextField jobNameField;
    @FXML private TextField jobDescriptionField;
    
    @FXML protected void handleSaveButtonAction(ActionEvent event) {
          actiontarget.setText("Save button pressed");
     }
      @FXML
    public void saveButton(){
        Job tempJob = new Job( jobNameField , jobDescriptionField );
        Stage theStage = (Stage) saveButton.getScene().getWindow();
        JobController.getJobController(theStage).addJobRow(tempJob);
    }
}

  