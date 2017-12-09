/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


/**
 *
 * @author Thaddeus
 */
   public class JobSearchUI  {
    
    @FXML
    private TableView<Job> jobTable = new TableView<Job>();
    @FXML
    private TableColumn<Job, String> jobTitleColumn = new TableColumn("Job Title");
    @FXML
    private TableColumn<Job, String> jobDescriptionColumn  = new TableColumn("Job Description");
    @FXML
    private ObservableList<Job> listOfJobs;
    @FXML
    private Text actiontarget;
 

    @FXML protected void handleBackButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Back button pressed");
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.hide();
            NavigationController theNavigationController = NavigationController.getNavigationController(window);
            
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        // Get the data for the table
        listOfJobs = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getjobList().getJobData();
    
        // Set up the table columns and link them to the table data fields
        jobTitleColumn.setCellValueFactory(new PropertyValueFactory<Job,String>("jobTitle"));
        jobDescriptionColumn.setCellValueFactory(new PropertyValueFactory<Job,String>("jobDescription"));
        
        SimpleStringProperty s = new SimpleStringProperty("Test");
        TextField t = new TextField("Test");
        if(s.get().equals(t.getText())){
            System.out.println("Success");
        }
        
        // Add the data to the table
        jobTable.setItems(listOfJobs);
    } 
    
}
