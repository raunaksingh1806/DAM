/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dframes;
/**
 *
 * @author ACER
 */
public class splashwelcome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        welcomeframe wel = new welcomeframe();
        wel.setVisible(true);
        wel.nofunction.setVisible(false);
        
         
        try{
            int a=1;
            for(;a<=100;a++){    
        
                Thread.sleep(26);
        
                wel.bar.setValue(a);
        
                   
            }
            
        if(a==101){
                   wel.dispose();
                   
                   new User().setVisible(true);
                }
        
        }
        catch (Exception e){
        }
    }
    
}
