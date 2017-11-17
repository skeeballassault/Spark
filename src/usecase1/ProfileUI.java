/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 *
 * @author Thaddeus
 */
public class ProfileUI {
    @FXML private Text actiontarget;
    @FXML protected void handleSaveChangesButtonAction(ActionEvent event) {
        actiontarget.setText("Saved changes button pressed");
       
}
}
