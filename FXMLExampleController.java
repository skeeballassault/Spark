package usecase1;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
 
public class FXMLExampleController {
    @FXML private Text actiontarget;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
      
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
        String un = usernameField.getText();
        String pw = passwordField.getText();
        if(authenticate(un, pw)){
            Stage stage = (Stage) actiontarget.getScene().getWindow();
            stage.hide();
            NavigationController theNavigationController = NavigationController.getNavigationController(stage);
        }else{
            usernameField.setText("");
            passwordField.setText("");
            actiontarget.setText("Invalid login");
        }
    }
    
    public boolean authenticate(String username, String password){
        boolean authenticated = false;
        if(username.equals("John")&& password.equals("Doe")){
            authenticated = true;
        }else{
            authenticated = false;
        }
        return authenticated;
    }

}

