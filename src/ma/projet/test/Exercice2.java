/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import ma.projet.services.ExoJDBC;

public class Exercice2 {

    public static void main(String[] args) {
        ExoJDBC ej = new ExoJDBC();
        //ej.NbrScript();//Identification du développeur ayant réalisé le maximum de scripts en une journée.
        //ej.sortList();//Affichage de la liste des développeurs triée par nombre décroissant
        //ej.totalScript();//Calcul du nombre total de scripts réalisés en une semaine. 
        ej.DevScript("alami ");//Calcul du nombre total de scripts réalisés par un dééveloppeur donné.
    }
}
