/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpidev2018;

import Services.ServicePub;
import entity.publicite;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author a7med
 */
public class EsPersoController implements Initializable {

    @FXML
    private Button deconnect;
 
  
    @FXML
    private Button esPerso;
    @FXML
    private TextField titre_pub;
    @FXML
    private TextField site_pub;
    @FXML
    private TextField desc_pub;
    @FXML
    private TableColumn<publicite, String> titrepub;
    @FXML
    private TableColumn<publicite, String> sitepub;
    @FXML
    private TableColumn<publicite, String> descpub;
    @FXML
    private TableView<publicite> Tab_pub;

    /**
     * Initializes the controller class.
     */  
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
     System.out.println("Affichage du tableau !");
                ServicePub se= new ServicePub();
        //se.selectPub();
        titrepub.setCellValueFactory(new PropertyValueFactory<publicite, String>("titre_pub"));
        sitepub.setCellValueFactory(new PropertyValueFactory<publicite, String>("site_pub"));
        descpub.setCellValueFactory(new PropertyValueFactory<publicite, String>("desc_pub"));
         ObservableList<publicite> data = FXCollections.observableArrayList(se.selectPub());
 Tab_pub.setEditable(true);
 
     Tab_pub.setItems(data);
    }    

    @FXML
    private void sedeConnecter(ActionEvent event) {
   
    }



    @FXML
    private void esPerso(ActionEvent event) {
    }

    @FXML
    private void ajoutpub_onClick(ActionEvent event) {
          System.out.println("Ajout d'une ligne!");
       // int a=Integer.parseInt(LoginController.getId_user());
       ServicePub se= new ServicePub();
      se.ajouterPub(titre_pub.getText(),site_pub.getText(),desc_pub.getText(),12);
    //  afficher();
      System.out.println("Affichage du tableau !");
        //se.selectPub();
        titrepub.setCellValueFactory(new PropertyValueFactory<publicite, String>("titre_pub"));
        sitepub.setCellValueFactory(new PropertyValueFactory<publicite, String>("site_pub"));
        descpub.setCellValueFactory(new PropertyValueFactory<publicite, String>("desc_pub"));
         ObservableList<publicite> data = FXCollections.observableArrayList(se.selectPub());
 Tab_pub.setItems(data);
    
    }

    @FXML
    private void suppub_onClick(ActionEvent event) {
          System.out.println("Suppression d'une ligne !");
          ServicePub se= new ServicePub();
          // int a=Integer.parseInt(titre_pub.getText());
          se.supprimerPub(titre_pub.getText());
         // afficher();
            System.out.println("Affichage du tableau !");
        //se.selectPub();
        titrepub.setCellValueFactory(new PropertyValueFactory<publicite, String>("titre_pub"));
        sitepub.setCellValueFactory(new PropertyValueFactory<publicite, String>("site_pub"));
        descpub.setCellValueFactory(new PropertyValueFactory<publicite, String>("desc_pub"));
         ObservableList<publicite> data = FXCollections.observableArrayList(se.selectPub());
 Tab_pub.setItems(data);
    }

    @FXML
    private void modifpub_onClick(ActionEvent event) {
           System.out.println("Pub prete a modifier !");
         ServicePub se= new ServicePub();
          // int a=Integer.parseInt(titre_pub.getText());
       
         // img_pub.setText(se.modifierPub(titre_pub.getText(),3)); 
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
         System.out.println("Affichage du tableau !");
        //se.selectPub();
        titrepub.setCellValueFactory(new PropertyValueFactory<publicite, String>("titre_pub"));
        sitepub.setCellValueFactory(new PropertyValueFactory<publicite, String>("site_pub"));
        descpub.setCellValueFactory(new PropertyValueFactory<publicite, String>("desc_pub"));
         ObservableList<publicite> data = FXCollections.observableArrayList(se.selectPub());
 Tab_pub.setItems(data);
    }
    
}
