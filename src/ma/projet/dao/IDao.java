/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.dao;

import java.util.List;

/**
 *
 * @author user
 */
public interface IDao<T> {
    void updateTable(T o);
    //List<T> displayTable ();
    //T findByDeveloppeurs(String s);
}
