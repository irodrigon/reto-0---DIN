/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessTier;

import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Locale;
import java.util.ResourceBundle;



/**
 *
 * @author Iñi
 */
public class DBUserDataAccessor implements DataAccessible{
    
    private Connection con = null;
    private User userData;
    private final String USER_DATA = "SELECT * FROM USER";
    
    @Override
    public User lookUserData() {
       
       ResourceBundle bundle = ResourceBundle.getBundle("resources/selection", Locale.getDefault());
       String driver = bundle.getString("driver");
       String url = bundle.getString("url");
       String user = bundle.getString("user");
       String pass = bundle.getString("pass");
       try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,pass);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(USER_DATA);
            
            if(rs.next()){
                userData = new User();
                userData.setId(rs.getString("id"));
                userData.setName(rs.getString("name"));
                userData.setLastName(rs.getString("lastname"));
                userData.setTelephone(rs.getString("telephone"));
                userData.setEmail(rs.getString("email"));
                
            }
            
       }catch(Exception e){
           e.printStackTrace();
       }
        
       return userData;
    }
}
