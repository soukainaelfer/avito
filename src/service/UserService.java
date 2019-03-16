/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.User;

/**
 *
 * @author SOUKAINA
 */
public class UserService extends AbstractFacade<User> {
    
    public UserService(){
        super(User.class);
    }
    
    public User createUser(String login,String password,String nom,String prenom,String adresse,String tele,int bloque,int NbreCnnx){
        User user=new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setBloque(bloque);
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setTel(0);
        user.setNbrCnnxRestant(NbreCnnx);
        user.setAdresse(adresse);
        create(user);
        return user;
        
    }
    
    public int connectUser(String login,String password){
        User user=find(login);
        if(user==null){
            return -1;
        }else if(user.getBloque()==1){
            return -2;
        }else if(user.getPassword().equals(password)){
            if(user.getNbrCnnxRestant()>0){
                user.setNbrCnnxRestant(user.getNbrCnnxRestant()-1);
                edit(user);
                return -3;
                
            }else{
                user.setBloque(1);
                edit(user);
                return -4;
              }
        }else{
            return 1;
                    
     }
   }
}

        
 