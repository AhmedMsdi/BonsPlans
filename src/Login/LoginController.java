/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mahdi
 */
public class LoginController implements Initializable {

    @FXML
    private JFXButton inscrit;
    @FXML
    private JFXButton connect;
    @FXML
    private JFXButton Retour;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void inscrit_click(ActionEvent event) {
    }

    @FXML
    private void connect_click(ActionEvent event) throws IOException {
        Stage stage = new Stage();
       Parent root = FXMLLoader.load(getClass().getResource("/AcceuilClient/AcceuilClient.fxml"));
      
        Scene scene = new Scene(root);
      
      stage.setScene(scene);  
        stage.show();
        stage.setMaximized(true);
        
        Stage stage2 = (Stage) connect.getScene().getWindow(); 
        stage2.close();
    }

    @FXML
    private void retour_click(ActionEvent event) throws IOException {
        Stage stage = new Stage();
       Parent root = FXMLLoader.load(getClass().getResource("/Acceuil/Acceuil.fxml"));
      
        Scene scene = new Scene(root);
      
      stage.setScene(scene);  
        stage.show();
        stage.setMaximized(true);
        
        Stage stage2 = (Stage) connect.getScene().getWindow(); 
        stage2.close();
    }
    
}
