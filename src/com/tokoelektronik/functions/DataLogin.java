/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tokoelektronik.functions;

/**
 *
 * @author Refanda Surya
 */
public class DataLogin {
    
    private String username;
    private String password;
    private String[]dataLogin = {"Admin", "123456"};
    
    public DataLogin(String username, String password){
        this.username = username;
        this.password = password; 
    }
    
    public boolean cekLogin(){
        
        return username.equalsIgnoreCase(dataLogin[0]) && password.equals(dataLogin[1]);
            
    }
    
}
