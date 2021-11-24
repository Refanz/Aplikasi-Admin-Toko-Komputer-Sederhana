package com.tokoelektronik.functions;

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
