/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaceTier;

import DataAccessTier.UserManagerFactory;
import Model.User;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

/**
 *
 * @author Iñi
 */
public class UserDataWindowController implements Initializable {
    
    @FXML
    private Label idLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label telephoneLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Button buttonShowUserData;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       try{
            User user = UserManagerFactory.getData().lookUserData();
            idLabel.setText(user.getId());
            nameLabel.setText(user.getName());
            lastNameLabel.setText(user.getLastName());
            telephoneLabel.setText(user.getTelephone());
            emailLabel.setText(user.getEmail());
       }catch(Exception e){
           Logger.getLogger("UserInterfaceTier").severe(e.getLocalizedMessage());
           new Alert(Alert.AlertType.ERROR,e.getLocalizedMessage(),ButtonType.OK).showAndWait();
       }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
