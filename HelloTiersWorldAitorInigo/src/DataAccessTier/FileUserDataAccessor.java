/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessTier;

import Model.User;
import java.util.ResourceBundle;

/**
 *
 * @author Iñi
 */
public class FileUserDataAccessor implements DataAccessible{
    
    private User userData;
    
    @Override
    public User lookUserData() {
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
        return userData;
    }
}
