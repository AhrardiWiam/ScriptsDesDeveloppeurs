/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.connexion.Connexion;
import ma.projet.entities.Devdata;
import ma.projet.services.ExoJDBC;

public class Exercice1 {

    public static void main(String[] args) {

        ExoJDBC ej = new ExoJDBC();
        ej.createTable();
        ej.updateTable(new Devdata("ALAMI", "Lundi", 1));
        ej.updateTable(new Devdata("WAFI", "Lundi", 2));
        ej.updateTable(new Devdata("SALAMI", "Mardi", 9));
        ej.updateTable(new Devdata("SAFI", "Mardi", 2));
        ej.updateTable(new Devdata("ALAMI", "Mardi", 2));
        ej.updateTable(new Devdata("SEBIHI", "Mercredi", 2));
        ej.updateTable(new Devdata("WAFI", "Jeudi", 3));
        ej.updateTable(new Devdata("ALAOU", "Vendredi", 9));
        ej.updateTable(new Devdata("WAFI", "Vendredi", 3));
        ej.updateTable(new Devdata("SEBIHI", "Vendredi", 4));

        }

    }

