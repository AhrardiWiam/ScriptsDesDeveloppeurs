/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.connexion.Connexion;
import ma.projet.dao.IDao;
import ma.projet.entities.Devdata;

/**
 *
 * @author user
 */
public class ExoJDBC {

    public void createTable() {
        Connection cn = null;
        Statement st = null;
        int n = -1;
        try {
            String req = "CREATE TABLE DevData (Developpeurs VARCHAR (32) , Jour CHAR (11),NbScripts INTEGER)";
            cn = Connexion.getCn();
            st = cn.createStatement();
            n = st.executeUpdate(req);
            if (n == 0) {
                System.out.println("Table DevData créée avec succès");

            }
        } catch (SQLException e) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                st.close();
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Impossible de libérer les ressources");
            }

        }
    }

    public void updateTable(Devdata d) {
        Connection cn = null;
        Statement st = null;

        try {
            String req = "INSERT INTO DevData VALUES (' " + d.getDeveloppeurs() + "', '" + d.getJour() + "'," + d.getNbScripts() + ")";
            cn = Connexion.getCn();
            st = cn.createStatement();
            int n = st.executeUpdate(req);
            if (n == 1) {
                System.out.println("Ajoutée avec succès!");
            }
        } catch (SQLException e) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                st.close();
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Impossible de libérer les ressources");
            }
        }
    }

    public void NbrScript() {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            String req = "SELECT Developpeurs, jour, max(NBScripts) from devdata group by jour";
            cn = Connexion.getCn();
            st = cn.createStatement();
            rs = st.executeQuery(req);
            while (rs.next()) {
                System.out.println("La personne ayant réalisé le  maximum de script (" + rs.getInt(3) + ") en " + rs.getString(2) + " est " + rs.getString(1));
            }
        } catch (SQLException e) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                st.close();
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Impossible de libérer les ressources");
            }
        }

    }

    public void sortList() {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            String req = "SELECT Developpeurs, sum(NBScripts) as c from devdata Group by Developpeurs order by c desc";
            cn = Connexion.getCn();
            st = cn.createStatement();
            rs = st.executeQuery(req);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " a fait " + rs.getInt("c") + " scripts");
            }
        } catch (SQLException e) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                st.close();
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Impossible de libérer les ressources");
            }
        }
    }

    public void totalScript() {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            String req = "select sum(NBScripts) as n from devdata";
            cn = Connexion.getCn();
            st = cn.createStatement();
            rs = st.executeQuery(req);
            if (rs.next()) {
                System.out.println("Le nombre total de scripts est " + rs.getInt("n"));;
            }
        } catch (SQLException e) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                st.close();
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Impossible de libérer les ressources");
            }
        }

    }

    public void DevScript(String s) {
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    try {
        // c'est pour supprimer les espaces et convertir en majuscules
        s = s.trim().toUpperCase();

        String req = "SELECT SUM(NBScripts) AS n FROM devdata WHERE UPPER(TRIM(Developpeurs)) = '" + s + "'";
        
        cn = Connexion.getCn();
        st = cn.createStatement();
        rs = st.executeQuery(req);
        if (rs.next()) {
            if(rs.getInt(1)==0){  System.out.println("Votre entrée n'existe pas dans la base de données");
            }else 
                System.out.println("Le nombre total de scripts du developpeur " + s + " est " + rs.getInt("n"));
        }
    } catch (SQLException e) {
        Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, e);
    } finally {
        try {
            st.close();
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Impossible de libérer les ressources");
        }
    }
}


    public void TypeReq(String s) {
        
        Connection cn=null;
         Statement st=null;
        try {
            cn = Connexion.getCn();
            st = cn.createStatement();
            Boolean type = st.execute(s);//si type est true donc c'est une requete d'interrogation
            if (type) {
            List<Devdata> devdatas = new ArrayList<>();
            ResultSet rs= st.executeQuery(s);
            ResultSetMetaData rsinfo = rs.getMetaData();
            System.out.println("Le nombre de colonnes de la table renvoyé est "+ rsinfo.getColumnCount());
            for(int i=1;i<=rsinfo.getColumnCount();i++){
            System.out.println( rsinfo.getColumnName(i) +" de type "+ rsinfo.getColumnTypeName(i));
            }
            System.out.println("Votre requête renvoie la table suivante:");
              while (rs.next()){
                 for(int i=1;i<=rsinfo.getColumnCount();i++){
                 System.out.print(rs.getObject(i)+"  |  " );
                 }
                 System.out.println( );
              }
                
            }else{
            System.out.println(st.getUpdateCount()+" lignes ont été modifiées dans la table Devdata");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                st.close();
                cn.close();
            }catch (SQLException e) {
                System.out.println("Impossible de libérer les ressources");
            }
        
    }
}
}
