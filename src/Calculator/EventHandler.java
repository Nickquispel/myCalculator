/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.awt.Desktop;
import java.io.IOException;
import static java.lang.Math.log;
import java.net.URI;
import java.net.URISyntaxException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author bignick
 */
public class EventHandler {
    private  TextField v1;
    private final Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    private final Calculator Calculator;
    public Image i1;
    public ImageView img1;
    public Hyperlink hp1;
    
    
    
    public EventHandler (GridPane p) {

      
       v1 = new TextField ();
       v1.setAlignment(Pos.CENTER_LEFT);
       v1.setEditable(false);
       
       
       
       
       b1 = new Button ("0");
       b2 = new Button ("C");
       b3 = new Button ("=");
       b4 = new Button ("-");
       b5 = new Button ("1");
       b6 = new Button ("2");
       b7 = new Button ("3");
       b8 = new Button ("+");
       b9 = new Button ("4");
       b10 = new Button ("5");
       b11= new Button ("6");
       b12 = new Button ("*");
       b13 = new Button ("7");
       b14 = new Button ("8");
       b15 = new Button ("9");
       b16 = new Button ("/");
       
       
       
       i1 = new Image("https://www.stadsringarnhem.nl/wp-content/uploads/2014/05/Internet-IPv6-1000x650.jpg");
       img1 = new ImageView(i1);
       img1.setFitWidth(175);
       img1.setFitHeight(100);
       
       hp1 = new Hyperlink();
       hp1.setGraphic(img1);
       
       Calculator = new Calculator();
       
          
       p.setVgap(10);
       p.setHgap(10);
       p.setPadding(new Insets(10,10,10,10));
  
       
      
      b1.setOnAction(event -> {
        String string = "0";
        Calculator.setString(string);
        v1.setText(Calculator.getString());
        });
      
      b2.setOnAction(event -> {
        v1.setText("0");
        Calculator.reset();       
      });
      
      b3.setOnAction(event -> {
          String string = Calculator.getString(); 
          double getal1 = Double.parseDouble(string);
         
        if (Calculator.getOperation().equals("+")) {
            v1.setText(String.format("%.2f",(Calculator.getSubtotaal() + getal1)));  
        }
        if (Calculator.getOperation().equals("*")) {
            v1.setText(String.format("%.2f",( Calculator.getSubtotaal() * getal1 )));
        }
        if (Calculator.getOperation().equals("/")) {
            v1.setText(String.format("%.2f",( Calculator.getSubtotaal() / getal1 )));
        }
        if (Calculator.getOperation().equals("-")) {
            v1.setText(String.format("%.2f",( Calculator.getSubtotaal() - getal1 )));
        }
        
        Calculator.reset();
        Calculator.setString(v1.getText());     
        
        
      });
      
      b4.setOnAction(event -> {
          String operation = "-";
          String string = Calculator.getString();
          double getal1 = Double.parseDouble(string);
          Calculator.TelOp(getal1);
          Calculator.reset2();
          Calculator.setAction(operation);
          v1.setText("-");  
      });
      
       b5.setOnAction(event -> {
        String string = "1";
        Calculator.setString(string);
        v1.setText(Calculator.getString());
        });
      
       b6.setOnAction(event -> {
        String string = "2";
        Calculator.setString(string);
        v1.setText(Calculator.getString());
        });
       
       b7.setOnAction(event -> {
        String string = "3";
        Calculator.setString(string);
        v1.setText(Calculator.getString());
        });
       
       b8.setOnAction(event -> {
          String operation = "+";
          String string = Calculator.getString();
          double getal1 = Double.parseDouble(string);
          Calculator.TelOp(getal1);
          Calculator.reset2();
          Calculator.setAction(operation);
          v1.setText("+");
      });
       
       b9.setOnAction(event -> {
        String string = "4";
        Calculator.setString(string);
        v1.setText(Calculator.getString());
        });
       
       b10.setOnAction(event -> {
        String string = "5";
        Calculator.setString(string);
        v1.setText(Calculator.getString());
        });
       
       b11.setOnAction(event -> {
        String string = "6";
        Calculator.setString(string);
        v1.setText(Calculator.getString());
        });
       
       b12.setOnAction(event -> {
          String operation = "*";
          String string = Calculator.getString();
          double getal1 = Double.parseDouble(string);
          Calculator.TelOp(getal1);
          Calculator.reset2();
          Calculator.setAction(operation);
          v1.setText("*");  
        
      });
       
       b13.setOnAction(event -> {
        String string = "7";
        Calculator.setString(string);
        v1.setText(Calculator.getString());
        });
       
       b14.setOnAction(event -> {
        String string = "8";
        Calculator.setString(string);
        v1.setText(Calculator.getString());
        });
       
       b15.setOnAction(event -> {
        String string = "9";
        Calculator.setString(string);
        v1.setText(Calculator.getString());
        });
       
       b16.setOnAction(event -> {
        String operation = "/";
          String string = Calculator.getString();
          double getal1 = Double.parseDouble(string);
          Calculator.TelOp(getal1);
          Calculator.reset2();
          Calculator.setAction(operation);
          v1.setText("/");  
      });
       
       hp1.setOnAction(event->{
       hp1.setText("www.google.com");
       try{
           Desktop.getDesktop().browse(new URI("www.google.com"));
       }catch (IOException | URISyntaxException e){
       e.printStackTrace();
    }
       
       
       });
       
       
       
       
    
    b1.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b2.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b3.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b4.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b5.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b6.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b7.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b8.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b9.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b10.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b11.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b12.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b13.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b14.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b15.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    b16.setMaxSize(Double.MAX_VALUE, Double.MIN_VALUE);
    
    
    p.setAlignment(Pos.BASELINE_CENTER);
    p.add(v1, 0, 0,4,1);
    p.add(b1,0,4,1,1);
    p.add(b2,1,4,1,1);
    p.add(b3,2,4,1,1);
    p.add(b4,3,4,1,1);
    p.add(b5,0,3,1,1);
    p.add(b6,1,3,1,1);
    p.add(b7,2,3,1,1);
    p.add(b8,3,3,1,1);
    p.add(b9,0,2,1,1);
    p.add(b10,1,2,1,1);
    p.add(b11,2,2,1,1);
    p.add(b12,3,2,1,1);
    p.add(b13,0,1,1,1);
    p.add(b14,1,1,1,1);
    p.add(b15,2,1,1,1);
    p.add(b16,3,1,1,1);
    p.add(hp1,0,5,4,1);
    
   
    
  
    }
    
}
