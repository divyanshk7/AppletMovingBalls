import java.util.*;  
 import java.applet.*;  
 import java.awt.*;  
  
 public class balls extends Applet implements Runnable  
 {  
 Random r = new Random(); 
 int x = 10, y = 10,sang1 = 0, sang2 = 0, h = 500 , w = 500;  
 public void init()  
 {  
 Thread t = new Thread(this);   
 t.start();  
 }  
 public void run()  
 {  
 while(true)  
 {  
 try  
 {  
 repaint();  
 Thread.sleep(100);    
 if( x < w - 100)     
 x += 5;  
 if( y < h - 100)  
 y += 5;  
 if( x > w - 100)  
 x = w - 100;  
 if( y > h - 100)  
 y = h - 100;  
 sang1 += 10;  
 sang2 += 10;  
 }  
 catch(Exception e)  
 { }  
 }  
 }  
 public void paint(Graphics g)  
 {  
 Dimension d = getSize();  
 h = d.height;  
 w = d.width;  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255))); // Balls random colors sets  
 g.fillArc(x,20,100,100,sang1,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(x,20,100,100,sang1 + 90,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(x,20,100,100,sang1 + 180,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(x,20,100,100,sang1 + 270,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(10, y, 100, 100, sang2 ,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(10,y,100,100, sang2 + 90,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(10,y,100,100,sang2 + 180,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(10,y,100,100,sang2 + 270,90);  
 }  
 }
