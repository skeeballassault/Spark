/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Thaddeus
 */
public class Research {
    private SimpleStringProperty career = new SimpleStringProperty();
    private SimpleStringProperty description  = new SimpleStringProperty();

    public Research(String newCareer, String newDescription){
        career.set(newCareer);
        description.set(newDescription);
  
    }
    
    public String getCareer() {
        return career.get();
    }
    public void setCareer(String newCareer) {
        career.set(newCareer);
    }
        
    public String getDescription() {
        return description.get();
    }
    
    public void setDescription(String newDescription) {
        description.set(newDescription);
    }
   
}

