/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import java.io.IOException;
import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Thaddeus
 */
public class TestSuitabilityUI {
 @FXML private TextArea questionField;
 @FXML private ChoiceBox questionChoice;
 @FXML private Button nextButton;
 @FXML private Text actiontarget;
    
    protected String[] questions = new String[20];
    protected String answersA = "none" ;
    protected String answersB = "low";
    protected String answersC = "medium";
    protected String answersD = "high";
    protected String answersE = "very high";
    
    protected int questionCounter = 0;
    
    protected int counterEI = 0;
    protected int counterSN = 0;
    
    protected String testResult = "";
    
    @FXML protected void handleNextButtonAction(ActionEvent event) {
        
        
        if(questions[0] == null) {
            
            //skills
            questions[0] = "1) Logic: reasoning and problem solving:";
            questions[1] = "2) Management: planning, proper use of time and resources:";
            questions[2] = "3) People: interaction with others, ability to train and counsel:";
            questions[3] = "4) Mechanical: working with tools and equipment:";
            questions[4] = "5) Communication: listening, speaking and working with others:";
            questions[5] = "6) Judgment: making clear, decisive decisions:";
            questions[6] = "7) Attention: focus on the problem at hand";
            questions[7] = "8) Thinking: working with new ideas and creative thinking";
            questions[8] = "9) Physical: strength, agility and dexterity:";
            questions[9] = "10) Senses: eyesight and hearing";
            
            //interests
            questions[10] = "11) Art: painting, drawing and sculpture:";
            questions[11] = "12) Business: economics, finance and marketing:";
            questions[12] = "13) Law: legal and criminal justice:";
            questions[13] = "14) Computers: programming and information technology:";
            questions[14] = "15) Science: math, physics and technology:";
            questions[15] = "16) Medical: biology and health care:";
            questions[16] = "17) Culinary: food and drinks:";
            questions[17] = "18) Construction: working with your hands:";
            questions[18] = "19) Office: working in an office environment:";
            questions[19] = "20) Outdoors: working outside of an office:";
         
            questionCounter = -1;
            
        }
        questionCounter++;
        
        if (questionCounter <= 19) {
            char choiceLetter = questionChoice.getValue().toString().charAt(0);
            int choiceBool;
            if (choiceLetter == 'a') {
                choiceBool = 0;
            } else if (choiceLetter == 'b') {
                choiceBool = 1;
            }
            else if (choiceLetter == 'c') {
                choiceBool = 2;
            }else if (choiceLetter == 'd') {
                choiceBool = 3;
            }
            else if (choiceLetter == 'e') {
                choiceBool = 4;
            }
            int counterDeterminer = (questionCounter + 1) % 10;
            switch (counterDeterminer) {
                case 1: counterEI++; break;
                case 2: counterSN++; break;
            }
            questionField.setText(questions[questionCounter]);} 
        else {
            if (counterEI >= 18 ) {
                testResult = testResult + "Technical Job";
            } else {
                testResult = testResult + "Physical Job";
            }
            if (counterSN > 20) {
                testResult = testResult + "Business, Law, Computers, Science, Medical, Office";
            } else {
                testResult = testResult + "Construction, Culinary, Outdoors, Art";
            }
            
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText("Your results are in!");
            alert.setContentText("Your personality type has been determined to be " + testResult);
            alert.showAndWait();
            
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                // THIS IS THE SPOT WHERE THE PROGRAM SHOULD GO BACK TO THE MAIN MENU
            }
        }
        
                
    }
   
    @FXML protected void handleBackButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Back button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.hide();
            NavigationController theNavigationController = NavigationController.getNavigationController(window);
            
    }
}

      
