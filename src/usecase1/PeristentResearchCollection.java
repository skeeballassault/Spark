/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

/**
 *
 * @author Thaddeus
 */
public class PeristentResearchCollection {
    
    private ResearchList theResearchList;
    // All other persistent data will go below here
    
    public PeristentResearchCollection(){
        if(theResearchList == null){
            theResearchList = new ResearchList();
        }
    }
    
    public ResearchList getresearchList(){
        return theResearchList;
    }
    
    
}
