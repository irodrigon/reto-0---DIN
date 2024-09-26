/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaceTier;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Clase main donde se empezara ejecutando el programa
 * 
 * @author Iñigo y Aitor
 *  
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
        //put icon on view
        stage.getIcons().add(new Image("resources/javacup.png"));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
