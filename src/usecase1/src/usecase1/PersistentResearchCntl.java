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
public class PersistentResearchCntl {
    
    private static PersistentResearchCntl thePersistentResearchCntl;
    private PeristentResearchCollection thePeristentResearchCollection;
    
    private PersistentResearchCntl(){
        if(thePeristentResearchCollection == null){
            thePeristentResearchCollection = new PeristentResearchCollection();
        }
    }
    
    public static PersistentResearchCntl getPersistentResearchCntl(){
        if(thePersistentResearchCntl == null){
            thePersistentResearchCntl = new PersistentResearchCntl();
        }
        return thePersistentResearchCntl;
    }
    
    public PeristentResearchCollection getPeristentResearchCollection(){
        return thePeristentResearchCollection;
    }
    
    
}
