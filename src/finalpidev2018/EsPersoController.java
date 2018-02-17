/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpidev2018;

import Services.ServicePub;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeTableColumn;

/**
 * FXML Controller class
 *
 * @author a7med
 */
public class EsPersoController implements Initializable {

    @FXML
    private JFXButton deconnect;
    @FXML
    private JFXTextField titre_pub;
    @FXML
    private JFXTextField site_pub;
    @FXML
    private JFXTextArea desc_pub;
    @FXML
    private JFXButton ajout_pub;
    @FXML
    private JFXButton supp_pub;
    @FXML
    private JFXButton modif_pub;
    @FXML
    private JFXButton valid_pub;
    @FXML
    private TreeTableColumn<?, ?> tab_pub;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sedeConnecter(ActionEvent event) {
    }

    @FXML
    private void ajoutpub_onClick(ActionEvent event) {
       System.out.println("Ajout d'une ligne!");
     //   int a=Integer.parseInt(LoginController.getId_user());
       ServicePub se= new ServicePub();
      se.ajouterPub(titre_pub.getText(),site_pub.getText(),desc_pub.getText(),111);
    }

    @FXML
    private void suppub_onClick(ActionEvent event) {
            System.out.println("Suppression d'une ligne !");
          ServicePub se= new ServicePub();
          // int a=Integer.parseInt(titre_pub.getText());
          se.supprimerPub(titre_pub.getText());
         // afficher();
    }

    @FXML
    private void modifpub_onClick(ActionEvent event) {
             System.out.println("Pub prete a modifier !");
         ServicePub se= new ServicePub();
          // int a=Integer.parseInt(titre_pub.getText());
       
         
           site_pub.setText(se.modifierPub(titre_pub.getText(),4)); 
       desc_pub.setText(se.modifierPub(titre_pub.getText(),5));
        //afficher();
    }

    @FXML
    private void validpub_onClick(ActionEvent event) {
             System.out.println("Modification terminée !");
       ServicePub se= new ServicePub();
    //   int a=Integer.parseInt(se.modifierPub(titre_pub.getText(), 1));
        //System.out.println(a);
       se.modifier2Pub(titre_pub.getText(),site_pub.getText(),desc_pub.getText(),ServicePub.getId_pub());
      // afficher();
    }
    
}
