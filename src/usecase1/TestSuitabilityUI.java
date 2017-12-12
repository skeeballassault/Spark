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
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Thaddeus
 */
public class TestSuitabilityUI implements Initializable{
    @FXML private TextArea questionField;
    @FXML private Button nextButton;
    @FXML private Text actiontarget;
    @FXML private ListView listView;
    
    protected String[] questions = new String[20];
    protected String[] answersA = new String[20];
    protected String[] answersB = new String[20];
    protected String[] answersC = new String[20];
    protected String[] answersD = new String[20];
    protected String[] answersE = new String[20];
    
    protected int questionCounter = 0;
    
    protected int counterEI = 0;
    protected int counterSN = 0;
    
    protected String testResult = "";
    boolean viewed = false;
    
    @FXML protected void handleNextButtonAction(ActionEvent event) {
        configureQuestions();
                
        questionCounter++;
              
        
        if (questionCounter <= 19) {
            char choiceLetter = listView.getSelectionModel().getSelectedItem().toString().charAt(0);
            int choiceBool = 0;
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
            
            int counterDeterminer = (questionCounter + 1) % 2;
            if(choiceBool>0){
            switch (counterDeterminer) {
                case 0: counterEI=counterEI+choiceBool; break;
                case 1: counterSN=counterSN+choiceBool; break;
            }
            }
            questionField.setText(questions[questionCounter]);
            listView.setItems(FXCollections.observableArrayList(answersA[questionCounter], answersB[questionCounter], answersC[questionCounter], answersD[questionCounter], answersE[questionCounter]));
            actiontarget.setText("Question Counter: " + Integer.toString(questionCounter) 
                    + " | E/I Counter: " + Integer.toString(counterEI)
                    + " | S/N Counter: " + Integer.toString(counterSN));
        } 
            
        else {
            if (counterEI >= 18 ) {
                testResult = testResult + "Technical Job- ";
            } else {
                testResult = testResult + "Physical Job- ";
            }
            if (counterSN > 20) {
                testResult = testResult + "Business, Law, Computers, Science, Medical, Office";
            } else {
                testResult = testResult + "Construction, Culinary, Outdoors, Art";
            }
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
            
            //Optional<ButtonType> result = alert.showAndWait();
            //if (result.get() == ButtonType.OK){
                // THIS IS THE SPOT WHERE THE PROGRAM SHOULD GO BACK TO THE MAIN MENU
            //}
        }
        
                
    }
   
    @FXML protected void handleBackButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Back button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.hide();
            NavigationController theNavigationController = NavigationController.getNavigationController(window);
            
    }
    
    public void configureQuestions(){
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
            
            for (int i = 0; i < 10; i++){
            answersA[i] = "a) No skill";
            answersB[i] = "b) A little skill";
            answersC[i] = "c) Some skill";
            answersD[i] = "d) Good skill";
            answersE[i] = "e) Excellent skill";
            }
            
            for (int i = 10; i < 20; i++){
            answersA[i] = "a) No interest";
            answersB[i] = "b) A little interest";
            answersC[i] = "c) Some interest";
            answersD[i] = "d) Good interest";
            answersE[i] = "e) A lot of interest";
            }
         
            questionCounter = 0;
            
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        questionField.setText("1) Logic: reasoning and problem solving:");
        listView.getItems().addAll(
                "a) No skill", 
                "b) A little skill",
                "c) Some skill",
                "d) Good skill",
                "e) Excellent skill");
    } 
}

      
