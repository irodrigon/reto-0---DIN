/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessTier;

import Model.User;

/**
 * Description: This is an interface which carries a method used by UserDataWindowController to return a User by means of UserManagerFactory.
 * 
 * @author Inigo,Aitor
 * 
 * 
 */
public interface DataAccessible {
    
            /**
             * 
             * 
             * @throws Exception if an errors occurs interacting with database or files.
             */
    
            public User lookUserData() throws Exception;
    
}
