/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessTier;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Iñi
 */
public class UserManagerFactory {
    
    private static Boolean isFile = true;
    
    public static FileUserDataAccessor createFileConnection(){
        ResourceBundle bundle = ResourceBundle.getBundle("resources/selection", Locale.getDefault());
        String path = bundle.getString("path");
        
        return new FileUserDataAccessor();
    }
    
    public static DBUserDataAccessor createDatabaseConnection(){
        ResourceBundle bundle = ResourceBundle.getBundle("resources/selection", Locale.getDefault());
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String pass = bundle.getString("pass");
        
        return new DBUserDataAccessor();
    }
}

