/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connexion {

    private static String url = "jdbc:mysql://localhost:3306/taf1";
    private static String user = "root";
    private static String password = "";
    private static Connection cn = null;

    public static Connection getCn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException e) {
            System.out.println("Driver introvable");
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
}
