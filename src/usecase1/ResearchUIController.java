/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Thaddeus
 */
public class ResearchUIController implements Initializable {

  @FXML
    private TableView<Research> researchTable = new TableView<Research>();
    @FXML
    private TableColumn<Research, String> careerColumn = new TableColumn("Career Type");
    @FXML
    private TableColumn<Research, String> descriptionColumn  = new TableColumn("Description");;
    @FXML
    private ObservableList<Research> listOfResearch;
    @FXML
    private Button getSelectedRowButton;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Get the data for the table
        listOfResearch = PersistentResearchCntl.getPersistentResearchCntl().getPeristentResearchCollection().getresearchList().getResearchData();
    
        // Set up the table columns and link them to the table data fields
        careerColumn.setCellValueFactory(new PropertyValueFactory<Research,String>("careerPath"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<Research,String>("description"));
        
        // Add the data to the table
        researchTable.setItems(listOfResearch);
    }    
    
    @FXML
    public void getSelectedRow(){
        Research tempCareer = researchTable.getSelectionModel().getSelectedItem();
        System.out.println(tempCareer.getCareer());
    }
    

@FXML protected void handleBackButtonAction(ActionEvent event) throws IOException {
        //actiontarget.setText("Back button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.hide();
            NavigationController theNavigationController = NavigationController.getNavigationController(window);
}
}