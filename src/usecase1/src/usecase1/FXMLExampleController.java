package usecase1;
 
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
 
public class FXMLExampleController {
    @FXML private Text actiontarget;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private UserList theUserList; 
    
    @FXML private ArrayList<String> validUsernames; 
    @FXML private ArrayList<String> validPasswords; 
    
    
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
        theUserList = new UserList();
        validUsernames = new ArrayList();
        validUsernames = theUserList.getValidUsernames();
        validPasswords = new ArrayList();
        validPasswords = theUserList.getValidPasswords();
        
        boolean authenticated = false;
        for (int i = 0; i < validUsernames.size(); i++) {
        if (validUsernames.get(i).equals(username) && validPasswords.get(i).equals(password)) {
            authenticated = true;
        }
    }
        /*
        if(username.equals("John")&& password.equals("Doe")){
            authenticated = true;
        }else{
            authenticated = false;
        }
        return authenticated;
*/
        return authenticated;
    }

}

