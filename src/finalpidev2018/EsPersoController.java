/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpidev2018;

import entity.publicite;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author a7med
 */
public class EsPersoController implements Initializable {

    @FXML
    private Button deconnect;
 
    private TableColumn<publicite, String> titre;
    private TableColumn<publicite, String> site;
    private TableColumn<publicite, String> desc;
    private TableView<publicite> Tab_pub;
    @FXML
    private Button esPerso;

    /**
     * Initializes the controller class.
     */  
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
     
                
       
    }    

    @FXML
    private void sedeConnecter(ActionEvent event) {
   
    }



    @FXML
    private void esPerso(ActionEvent event) {
    }
    
}
