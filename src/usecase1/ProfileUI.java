/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Thaddeus
 */
public class ProfileUI {
    @FXML private Text actiontarget;
    @FXML protected void handleSaveChangesButtonAction(ActionEvent event) {
        actiontarget.setText("Saved changes button pressed");
       
}
    
    @FXML protected void handleBackButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Back button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.hide();
        NavigationController theNavigationController = NavigationController.getNavigationController(window);
            
    }
}
