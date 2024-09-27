/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Scanner;
import ma.projet.services.ExoJDBC;


public class Exercice3 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     ExoJDBC ej= new ExoJDBC();
        System.out.print("Entrez votre requête SQL : ");
        String s = sc.nextLine();
        ej.TypeReq(s);
    }
}
