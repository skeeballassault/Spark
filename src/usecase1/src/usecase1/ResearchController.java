/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Thaddeus
 */
public class ResearchController {
        @FXML private Stage stage;
    private static ResearchController theResearchController;
    private ObservableList<Research> theListOfResearch;
    
    private ResearchController(Stage theExistingStage){
        theListOfResearch = PersistentResearchCntl.getPersistentResearchCntl().getPeristentResearchCollection().getresearchList().getResearchData();
        stage = theExistingStage;
        this.setUpResearchListScene();
        stage.show();
    }
    
    public static ResearchController getResearchController(Stage theStage){
        if(theResearchController != null){
            return theResearchController;
        }else{
            theResearchController = new ResearchController(theStage);
            return theResearchController;
        }
    }
    
    @FXML public void setUpResearchListScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("Research.fxml"));
            scene = new Scene(root);
            stage.setTitle("Research Career Paths");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ObservableList<Research> getListOfResearch(){
        return theListOfResearch;
    }
    
    public Stage getStage(){
        return stage;
    }
    
}
