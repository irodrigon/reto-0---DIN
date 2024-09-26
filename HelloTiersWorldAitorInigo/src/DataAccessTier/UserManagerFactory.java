/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessTier;

import java.util.ResourceBundle;

/**
 * Factoria para la creacion de los metodos que nos devolveran un User
 * 
 * @author Iñigo y Aitor
 */
public class UserManagerFactory {
    
    
    /**
    * Metodo que utiliza un archivo de propiedades para decidir cual de los 2 metodos es devuelto
    * por la factoria.
    * 
    * @author Iñigo y Aitor
    * @return Un FileUserDataAccessor() o DBUserDataAccessor()
    */
    public static DataAccessible getData(){
        
        ResourceBundle bundle = ResourceBundle.getBundle("resources/factoryconfig");
        String isFile = bundle.getString("isFile");
        
        if(isFile.equals("true")){
            return new FileUserDataAccessor();
        }else{
            return new DBUserDataAccessor();
        }
    }
    
}

