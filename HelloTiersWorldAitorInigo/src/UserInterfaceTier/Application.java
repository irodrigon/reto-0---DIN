/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaceTier;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Iñi
 * @param stage The main window
 * @throws Exception when it doesn't find the view.
 */
public class Application extends javafx.application.Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //load DOM from XML view
        Parent root = FXMLLoader.load(getClass().getResource("UserDataView.fxml"));
        
        //Create scene with our view 
        Scene scene = new Scene(root);
        
        //put scene on stage
        stage.setScene(scene);
        //show stage
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
