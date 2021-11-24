package com.tokoelektronik.app;

import com.tokoelektronik.login.TokoElektronikLogin;

public class TokoElektronikMain {

      public static void main(String[] args) {
        // TODO code application logic here
        
        TokoElektronikLogin tkl = new TokoElektronikLogin();
        tkl.setLocationRelativeTo(null);
        tkl.pack();
        tkl.setVisible(true);
        
        
    }
    
}
