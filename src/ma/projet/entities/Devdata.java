/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

/**
 *
 * @author user
 */
public class Devdata {
    private String developpeurs;
    private String jour;
    private int nbScripts;

 
    public Devdata(String developpeurs, String jour, int nbScripts) {
        this.developpeurs = developpeurs;
        this.jour = jour;
        this.nbScripts = nbScripts;
    }

    public String getDeveloppeurs() {
        return developpeurs;
    }

    public String getJour() {
        return jour;
    }

    public int getNbScripts() {
        return nbScripts;
    }

    public void setDeveloppeurs(String developpeurs) {
        this.developpeurs = developpeurs;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public void setNbScripts(int nbScripts) {
        this.nbScripts = nbScripts;
    }

    @Override
    public String toString() {
        return "Devdata{" + "developpeurs=" + developpeurs + ", jour=" + jour + ", nbScripts=" + nbScripts + '}';
    }
    
}
