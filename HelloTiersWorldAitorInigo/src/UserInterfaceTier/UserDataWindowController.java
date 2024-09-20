/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaceTier;

import DataAccessTier.DataAccessible;
import DataAccessTier.UserManagerFactory;
import Model.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Iñi
 */
public class UserDataWindowController implements Initializable {
    
     DataAccessible userManager = UserManagerFactory.getData();
     User user = userManager.lookUserData();
    
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
       idLabel.setText(user.getId());
       nameLabel.setText(user.getName());
       lastNameLabel.setText(user.getLastName());
       telephoneLabel.setText(user.getTelephone());
       emailLabel.setText(user.getEmail());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
