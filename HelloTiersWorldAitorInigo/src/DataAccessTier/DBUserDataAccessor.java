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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 *
 * @author Iñi
 */
public class DBUserDataAccessor implements DataAccessible {

    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    private User userData;
    private final String USER_DATA = "SELECT * FROM USER";

    @Override
    public User lookUserData() {

        ResourceBundle bundle = ResourceBundle.getBundle("resources/selection");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String pass = bundle.getString("pass");
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.createStatement();
            rs = stmt.executeQuery(USER_DATA);

            if (rs.next()) {
                userData = new User();
                userData.setId(rs.getString("id"));
                userData.setName(rs.getString("name"));
                userData.setLastName(rs.getString("lastname"));
                userData.setTelephone(rs.getString("telephone"));
                userData.setEmail(rs.getString("email"));

            }

        } catch (SQLException e) {
            Logger.getLogger("DataAccessTier").severe(e.getLocalizedMessage());
        } catch (ClassNotFoundException e) {
            Logger.getLogger("DataAccessTier").severe(e.getLocalizedMessage());
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                Logger.getLogger("DataAccessTier").severe(e.getLocalizedMessage());
            }

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                Logger.getLogger("DataAccessTier").severe(e.getLocalizedMessage());
            }

            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                Logger.getLogger("DataAccessTier").severe(e.getLocalizedMessage());
            }
        }

        return userData;
    }
}
