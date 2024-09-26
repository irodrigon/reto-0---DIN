/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessTier;

import Model.User;
import java.util.ResourceBundle;

/**
 * Clase que implementa la interfaz DataAccessible para el uso del metodo lookUserData()
 * 
 * @author Iñigo y Aitor
 * 
 */
public class FileUserDataAccessor implements DataAccessible{
    
    private User userData;
    
    /**
    * Accede a los datos de un User que se encuentran en un archivo de propiedades
    * 
    * @author Iñigo y Aitor
    * @throws Exception Si el archivo de propiedades no se encuentra
    * @return Devuelve un User con parametros
    */
    @Override
    public User lookUserData() throws Exception {
        try{
            userData = new User();
        ResourceBundle bundle = ResourceBundle.getBundle("resources/selection");
        String path = bundle.getString("path");
        ResourceBundle bundleFile = ResourceBundle.getBundle(path);
        String id = bundleFile.getString("id");
        String name = bundleFile.getString("name");
        String lastName = bundleFile.getString("lastname");
        String telephone = bundleFile.getString("telephone");
        String email = bundleFile.getString("email");
        userData.setId(id);
        userData.setName(name);
        userData.setLastName(lastName);
        userData.setTelephone(telephone);
        userData.setEmail(email);
        
        }catch (Exception e){
            System.out.println("No se encuentra el archivo");
        }
        return userData;
    }
}
