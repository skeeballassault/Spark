/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Nick
 */
public class TestUI implements Initializable{
    @FXML private TextArea questionField;
    @FXML private Button nextButton;
    @FXML private Text actiontarget;
    @FXML private ListView listView;
    
    protected String[] questions = new String[20];
    protected String[] answersA = new String[20];
    protected String[] answersB = new String[20];
    
    protected int questionCounter = 0;
    
    protected int counterEI = 0;
    protected int counterSN = 0;
    protected int counterTF = 0;
    protected int counterJP = 0;
    
    protected String testResult = "";
    boolean viewed = false;
       
    @FXML protected void handleNextButtonAction(ActionEvent event) {
        configureQuestions();
                
        questionCounter++;
        
        if (questionCounter <= 19) {
            char choiceLetter = listView.getSelectionModel().getSelectedItem().toString().charAt(0);
            boolean choiceBool=true;
            if (choiceLetter == 'a') {
                choiceBool = true;
            } else if (choiceLetter == 'b') {
                choiceBool = false;
            }
            
            int counterDeterminer = (questionCounter + 1) % 4;
            if(choiceBool==true){
                switch (counterDeterminer) {
                    case 0: counterEI++; break;
                    case 1: counterSN++; break;
                    case 2: counterTF++; break;
                    case 3: counterJP++; break;
                }
            }
            questionField.setText(questions[questionCounter]);
            listView.setItems(FXCollections.observableArrayList(answersA[questionCounter], answersB[questionCounter]));
            actiontarget.setText("Question Counter: " + Integer.toString(questionCounter) 
                    + " | E/I Counter: " + Integer.toString(counterEI)
                    + " | S/N Counter: " + Integer.toString(counterSN)
                    + " | T/F Counter: " + Integer.toString(counterTF)
                    + " | J/P Counter: " + Integer.toString(counterJP));
            //questionChoice.setItems(FXCollections.observableArrayList(answersA[questionCounter], answersB[questionCounter]));
        } else {
            if (counterEI > 2) {
                testResult = testResult + "E";
            } else {
                testResult = testResult + "I";
            }
            if (counterSN > 2) {
                testResult = testResult + "S";
            } else {
                testResult = testResult + "N";
            }
            if (counterTF > 2) {
                testResult = testResult + "T";
            } else {
                testResult = testResult + "F";
            }
            if (counterJP > 2) {
                testResult = testResult + "J";
            } else {
                testResult = testResult + "P";
            }
            //Display results, or back to main menu.
            if(viewed==false){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Result");
                alert.setHeaderText("Your results are in!");
                alert.setContentText("Your personality type has been determined to be " + testResult);
                viewed = true;
                alert.showAndWait();
            }else{
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                window.hide();
                NavigationController theNavigationController = NavigationController.getNavigationController(window);
            }
            
            
            /*Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                // THIS IS THE SPOT WHERE THE PROGRAM SHOULD GO BACK TO THE MAIN MENU
            }*/
        }     
    }
    
    @FXML protected void handleUsersButtonAction(ActionEvent event) {
        actiontarget.setText("Back button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.hide();
        NavigationController theNavigationController = NavigationController.getNavigationController(window);
    }
    
    @FXML protected void handleBackButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Back button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.hide();
            NavigationController theNavigationController = NavigationController.getNavigationController(window);
            
    } 
    
    public void configureQuestions(){
        // Fill question and answer arrays.
        if (questions[0] == null) {
            questions[0] = "1) When you are with a group of people, would you usually rather:";
            questions[1] = "2) Do you usually get along better with:";
            questions[2] = "3) Which word in the pair appeals to you more?";
            questions[3] = "4) Does following a schedule:";
            questions[4] = "5) When you have to meet strangers, do you find it:";
            questions[5] = "6) If you were a teacher, would you rather teach:";
            questions[6] = "7) Which word in the pair appeals to you more?";
            questions[7] = "8) Do you prefer to:";
            questions[8] = "9) Are you:";
            questions[9] = "10) Is it higher praise to say someone has:";
            questions[10] = "11) Which word in the pair appeals to you more?";
            questions[11] = "12) Does the idea of making a list of what you should get:";
            questions[12] = "13) Do you tend to have:";
            questions[13] = "14) Would you rather have as a friend someone who:";
            questions[14] = "15) Which word in the pair appeals to you more?";
            questions[15] = "16) When it is settled well in advance that you will do a:";
            questions[16] = "17) At parties, do you:";
            questions[17] = "18) Would you rather be considered:";
            questions[18] = "19) Is it a higher compliment to be called:";
            questions[19] = "20) Is it harder for you to adapt to:";
            
            
            answersA[0] = "a) Join in the talk of the group, or";
            answersA[1] = "a) Realistic people, or";
            answersA[2] = "a) Analyze";
            answersA[3] = "a) Appeal to you, or";
            answersA[4] = "a) Pleasant, or at lease easy, or";
            answersA[5] = "a) Fact courses, or";
            answersA[6] = "a) Foresight";
            answersA[7] = "a) Arrange dates, parties, etc., well in advance, or";
            answersA[8] = "a) Easy to get to know, or";
            answersA[9] = "a) Common sense, or";
            answersA[10] = "a) Firm";
            answersA[11] = "a) Appeal to you, or";
            answersA[12] = "a) Broad friendships with many different people, or";
            answersA[13] = "a) Has both feet on the ground, or";
            answersA[14] = "a) Thinking";
            answersA[15] = "a) Nice to be able to plan accordingly, or";
            answersA[16] = "a) Always have fun, or";
            answersA[17] = "a) A practical person, or";
            answersA[18] = "a) A consistently reasonable person, or";
            answersA[19] = "a) Constant change, or";
            
            answersB[0] = "b) Talk individually with people you know well?";
            answersB[1] = "b) Imaginative people?";
            answersB[2] = "b) Sympathize";
            answersB[3] = "b) Cramp you?";
            answersB[4] = "b) Something that takes a good deal of effort?";
            answersB[5] = "b) Courses involving theory?";
            answersB[6] = "b) Compassion";
            answersB[7] = "b) Be free to do whatever looks like fun when the time comes?";
            answersB[8] = "b) Hard to get to know?";
            answersB[9] = "b) Vision?";
            answersB[10] = "b) Gentle";
            answersB[11] = "b) Leave you cold";
            answersB[12] = "b) Deep friendships with a very few people?";
            answersB[13] = "b) Is always coming up with new ideas?";
            answersB[14] = "b) Feeling";
            answersB[15] = "b) A little unpleasant to be tied down?";
            answersB[16] = "b) Sometimes get bored?";
            answersB[17] = "b) An ingenious person?";
            answersB[18] = "b) A person of real feeling?";
            answersB[19] = "b) Routine?";
            
            questionCounter = 0;
            
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        questionField.setText("1) When you are with a group of people, would you usually rather:");
        listView.getItems().addAll(
                "a) Join in the talk of the group, or", 
                "b) Talk individually with people you know well?");
    }    
}
