/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Quartier;
import bean.Ville;
import java.util.List;

/**
 *
 * @author SOUKAINA
 */
public class VilleService extends AbstractFacade<Ville>{
    
    public VilleService(){
        super(Ville.class);
    }
    
    public Ville createVille(){
        Ville ville =new Ville();
        ville.setNom("Marrakech");
        create(ville);
        return ville;
        
        
    }
    
    public static void main(String[] args) {
        VilleService villeService=new VilleService();
        villeService.createVille();
        
    }
    
}
