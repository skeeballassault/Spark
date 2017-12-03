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
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Nick
 */
public class LoginController {
    @FXML private Text actiontarget;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Button submitButton;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Sign in button pressed");
        String un = usernameField.getText();
        String pw = passwordField.getText();
        if(authenticate(un, pw)){
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.hide();
            NavigationController theNavigationController = NavigationController.getNavigationController(window);
        }else{
            usernameField.setText("");
            passwordField.setText("");
            actiontarget.setText("Invalid login");
        }
    }
    
    public boolean authenticate(String username, String password){
        boolean authenticated = false;
        if(username.equals("guest")&& password.equals("guest")){
            authenticated = true;
        }else{
            authenticated = false;
        }
        return authenticated;
    }
}
