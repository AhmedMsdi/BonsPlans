/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceuil;

<<<<<<< HEAD:src/Acceuil/AcceuilController.java
import Login.LoginController;
=======
>>>>>>> 588bf05a648a0447a0b6e122c736bb2819d4dad3:src/finalpidev2018/AcceuilController.java
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author a7med
 */
public class AcceuilController implements Initializable {

    @FXML
    private Button connect;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void seConnecter(ActionEvent event) throws IOException {
            Stage stage = new Stage();
       Parent root = FXMLLoader.load(getClass().getResource("/Login/Login.fxml"));
      
        Scene scene = new Scene(root);
      
      stage.setScene(scene);  
        stage.show();
        stage.setMaximized(true);
        
        Stage stage2 = (Stage) connect.getScene().getWindow(); 
        stage2.close();
               // 
    }
    
}
