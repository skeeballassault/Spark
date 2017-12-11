/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Thaddeus
 */
public class ResearchList {
        private ObservableList<Research> theListOfResearch;
    
    public ResearchList(){
        theListOfResearch = getTestResearch();
    }
    
    public ObservableList<Research> getResearchData() {
        return theListOfResearch;
    }
    
    public ObservableList<Research> getTestResearch(){
        ObservableList<Research> testResearch = FXCollections.observableArrayList();
        for (int i = 0; i < 100; i++) {
            Research newResearch = new Research(i + "careerPath", i + "description");
            testResearch.add(newResearch);
        }
        return testResearch;
    }
    
}

