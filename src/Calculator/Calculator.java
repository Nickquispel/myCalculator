/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author bignick
 */
public class Calculator {
    private double getal,getal2;
    private String string = "";
    private String string2 = "";
    private String operation;
    
    
    public void setAction (String operation){
        this.operation = "";
        this.operation = operation;
    }
    
    public String getOperation(){
        return operation;
    }
   
    public void TelOp (double invoer) {
        getal += invoer;
    }
    
      
    public void getal2 (double invoer) {
        this.getal2 = getal2;
    }
    
    public void getal2Reset (){
        getal2=0;
    }
    
    public double getGetal2() {
        return getal2;
    }
    
    public double getSubtotaal () {
        return getal;
    }
    public void reset () {
        getal = 0;
        string = "";
    }
    
    public void reset2 () {
        string = "";
    }
    
    public void reset3 (){
        getal =0;
    }
    
    public void setString (String string){
        this.string += string;
    }
    
    public String getString () {
        return string;
    }
    
    public void setString2 (String string){
        this.string += string;
    }
    
    public String getString2 () {
        return string;
    }
   
}
