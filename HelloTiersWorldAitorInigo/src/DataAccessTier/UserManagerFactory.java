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
    
    public static DataAccessible getData(){
        
        ResourceBundle bundle = ResourceBundle.getBundle("resources/factoryconfig", Locale.getDefault());
        String isFile = bundle.getString("isFile");
        
        if(isFile.equals("true")){
            return new FileUserDataAccessor();
        }else{
            return new DBUserDataAccessor();
        }
    }
    
}

