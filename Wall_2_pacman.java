/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wall_2_pacman;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import static wall_2_pacman.Wall_2_pacman.g;

/**
 *
 * @author jwall9080
 */
public class Wall_2_pacman extends Application {
   static ArrayList<Wall> wall = new ArrayList<Wall>();
   static ArrayList<Pellet>pellet = new ArrayList<Pellet>();
    static Pacman pacman;
static int iteration = 0;
    static Group g = new Group();
      static Wall rect;
              
    


    public static void main(String[] args) {
        Application.launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pac Man");

        Scene scene = new Scene(g, 800, 900, Color.web("#000000", 1.0));
        pacman = new Pacman(400, 450);
        
        
pellet.add(new Pellet(30, 80));
        pellet.add(new Pellet(30, 135));
        pellet.add(new Pellet(30, 185));
        pellet.add(new Pellet(30, 235));
        pellet.add(new Pellet(770, 80));
        pellet.add(new Pellet(770, 135));
        pellet.add(new Pellet(770, 185));
        pellet.add(new Pellet(770, 235));
        pellet.add(new Pellet(80, 80));
        pellet.add(new Pellet(720, 80));
        pellet.add(new Pellet(130, 80));
        pellet.add(new Pellet(670, 80));
        pellet.add(new Pellet(180, 80));
        pellet.add(new Pellet(620, 80));
        pellet.add(new Pellet(570, 80));
        pellet.add(new Pellet(230, 80));
        pellet.add(new Pellet(520, 80));
        pellet.add(new Pellet(280, 80));
        pellet.add(new Pellet(470, 80));
        pellet.add(new Pellet(330, 80));
        pellet.add(new Pellet(380, 80));
        pellet.add(new Pellet(435, 80));
        pellet.add(new Pellet(380, 115));
        pellet.add(new Pellet(380, 150));
        pellet.add(new Pellet(380, 185));
        pellet.add(new Pellet(435, 115));
        pellet.add(new Pellet(435, 150));
        pellet.add(new Pellet(435, 185));
        pellet.add(new Pellet(655, 115));
        pellet.add(new Pellet(655, 150));
        pellet.add(new Pellet(655, 185));
        pellet.add(new Pellet(155, 115));
        pellet.add(new Pellet(155, 150));
        pellet.add(new Pellet(155, 185));
        pellet.add(new Pellet(160, 185));
        pellet.add(new Pellet(160, 220));
        pellet.add(new Pellet(160, 255));
        pellet.add(new Pellet(160, 290));
        pellet.add(new Pellet(160, 325));
        pellet.add(new Pellet(160, 360));
        pellet.add(new Pellet(160, 395));
        pellet.add(new Pellet(160, 430));
        pellet.add(new Pellet(160, 465));
        pellet.add(new Pellet(160, 500));
        pellet.add(new Pellet(160, 535));
        pellet.add(new Pellet(160, 605));
        pellet.add(new Pellet(160, 640));
        pellet.add(new Pellet(650, 185));
        pellet.add(new Pellet(650, 220));
        pellet.add(new Pellet(650, 255));
        pellet.add(new Pellet(650, 290));
        pellet.add(new Pellet(650, 325));
        pellet.add(new Pellet(650, 360));
        pellet.add(new Pellet(650, 395));
        pellet.add(new Pellet(650, 430));
        pellet.add(new Pellet(650, 465));
        pellet.add(new Pellet(650, 500));
        pellet.add(new Pellet(650, 535));
        pellet.add(new Pellet(650, 605));
        pellet.add(new Pellet(650, 640));
        pellet.add(new Pellet(55, 185));
        pellet.add(new Pellet(90, 185));
        pellet.add(new Pellet(125, 185));
        pellet.add(new Pellet(195, 185));
        pellet.add(new Pellet(230, 185));
        pellet.add(new Pellet(265, 185));
        pellet.add(new Pellet(300, 185));
        pellet.add(new Pellet(335, 185));
        pellet.add(new Pellet(405, 185));
        pellet.add(new Pellet(475, 185));
        pellet.add(new Pellet(510, 185));
        pellet.add(new Pellet(545, 185));
        pellet.add(new Pellet(580, 185));
        pellet.add(new Pellet(615, 185));
        pellet.add(new Pellet(685, 185));
        pellet.add(new Pellet(720, 185));
        pellet.add(new Pellet(55, 745));
        pellet.add(new Pellet(90, 745));
        pellet.add(new Pellet(125, 745));
        pellet.add(new Pellet(160, 745));
        pellet.add(new Pellet(195, 745));
        pellet.add(new Pellet(230, 745));
        pellet.add(new Pellet(265, 745));
        pellet.add(new Pellet(300, 745));
        pellet.add(new Pellet(335, 745));
        pellet.add(new Pellet(370, 745));
        pellet.add(new Pellet(405, 745));
        pellet.add(new Pellet(440, 745));
        pellet.add(new Pellet(475, 745));
        pellet.add(new Pellet(510, 745));
        pellet.add(new Pellet(545, 745));
        pellet.add(new Pellet(580, 745));
        pellet.add(new Pellet(615, 745));
        pellet.add(new Pellet(650, 745));
        pellet.add(new Pellet(685, 745));
        pellet.add(new Pellet(720, 745));
        pellet.add(new Pellet(30, 575));
        pellet.add(new Pellet(30, 630));
        pellet.add(new Pellet(30, 685));
        pellet.add(new Pellet(30, 740));
        pellet.add(new Pellet(770, 575));
        pellet.add(new Pellet(770, 630));
        pellet.add(new Pellet(770, 685));
        pellet.add(new Pellet(770, 740));
        pellet.add(new Pellet(195, 635));
        pellet.add(new Pellet(230, 635));
        pellet.add(new Pellet(265, 635));
        pellet.add(new Pellet(300, 635));
        pellet.add(new Pellet(335, 635));
        pellet.add(new Pellet(370, 635));
        pellet.add(new Pellet(405, 635));
        pellet.add(new Pellet(440, 635));
        pellet.add(new Pellet(475, 635));
        pellet.add(new Pellet(510, 635));
        pellet.add(new Pellet(545, 635));
        pellet.add(new Pellet(580, 635));
        pellet.add(new Pellet(615, 635));
        pellet.add(new Pellet(230, 520));
        pellet.add(new Pellet(265, 520));
        pellet.add(new Pellet(300, 520));
        pellet.add(new Pellet(335, 520));
        pellet.add(new Pellet(370, 520));
        pellet.add(new Pellet(405, 520));
        pellet.add(new Pellet(440, 520));
        pellet.add(new Pellet(475, 520));
        pellet.add(new Pellet(510, 520));
        pellet.add(new Pellet(545, 520));
        pellet.add(new Pellet(580, 520));
        pellet.add(new Pellet(230, 290));
        pellet.add(new Pellet(265, 290));
        pellet.add(new Pellet(300, 290));
        pellet.add(new Pellet(335, 290));
        pellet.add(new Pellet(370, 290));
        pellet.add(new Pellet(405, 290));
        pellet.add(new Pellet(440, 290));
        pellet.add(new Pellet(475, 290));
        pellet.add(new Pellet(510, 290));
        pellet.add(new Pellet(545, 290));
        pellet.add(new Pellet(580, 290));
        pellet.add(new Pellet(230, 235));
        pellet.add(new Pellet(265, 235));
        pellet.add(new Pellet(300, 235));
        pellet.add(new Pellet(335, 235));
        pellet.add(new Pellet(370, 235));
        pellet.add(new Pellet(440, 235));
        pellet.add(new Pellet(475, 235));
        pellet.add(new Pellet(510, 235));
        pellet.add(new Pellet(545, 235));
        pellet.add(new Pellet(580, 235));
        pellet.add(new Pellet(55, 575));
        pellet.add(new Pellet(90, 575));
        pellet.add(new Pellet(125, 575));
        pellet.add(new Pellet(160, 575));
        pellet.add(new Pellet(195, 575));
        pellet.add(new Pellet(230, 575));
        pellet.add(new Pellet(265, 575));
        pellet.add(new Pellet(300, 575));
        pellet.add(new Pellet(335, 575));
        pellet.add(new Pellet(370, 575));
        pellet.add(new Pellet(440, 575));
        pellet.add(new Pellet(475, 575));
        pellet.add(new Pellet(510, 575));
        pellet.add(new Pellet(545, 575));
        pellet.add(new Pellet(580, 575));
        pellet.add(new Pellet(615, 575));
        pellet.add(new Pellet(650, 575));
        pellet.add(new Pellet(685, 575));
        pellet.add(new Pellet(720, 575));
        pellet.add(new Pellet(230, 290));
        pellet.add(new Pellet(230, 325));
        pellet.add(new Pellet(230, 360));
        pellet.add(new Pellet(230, 395));
        pellet.add(new Pellet(230, 430));
        pellet.add(new Pellet(230, 465));
        pellet.add(new Pellet(230, 500));
        pellet.add(new Pellet(580, 290));
        pellet.add(new Pellet(580, 325));
        pellet.add(new Pellet(580, 360));
        pellet.add(new Pellet(580, 395));
        pellet.add(new Pellet(580, 430));
        pellet.add(new Pellet(580, 465));
        pellet.add(new Pellet(580, 500));
        pellet.add(new Pellet(160, 685));
        pellet.add(new Pellet(650, 685));
        pellet.add(new Pellet(300, 685));
        pellet.add(new Pellet(510, 685));
        pellet.add(new Pellet(335, 685));
        pellet.add(new Pellet(475, 685));
        pellet.add(new Pellet(370, 685));
        pellet.add(new Pellet(440, 685));
        pellet.add(new Pellet(100, 630));
        pellet.add(new Pellet(100, 685));
        pellet.add(new Pellet(710, 630));
        pellet.add(new Pellet(710, 685));
        pellet.add(new Pellet(100, 235));
    pellet.add(new Pellet(710, 235));



 



       
        rect = new Wall(0, 50, 800, 10);
        rect = new Wall(0, 770, 800, 10);

        rect = new Wall(0, 50, 10, 215);
        rect = new Wall(0, 545, 10, 225);

        rect = new Wall(790, 50, 10, 210);
        rect = new Wall(790, 545, 10, 225);

        rect = new Wall(0, 375, 125, 10);
        rect = new Wall(0, 425, 125, 10);

        rect = new Wall(675, 375, 125, 10);
        rect = new Wall(675, 425, 125, 10);

        rect = new Wall(0, 545, 125, 10);
        rect = new Wall(0, 255, 125, 10);

        rect = new Wall(675, 545, 125, 10);
        rect = new Wall(675, 255, 135, 10);

        rect = new Wall(115, 435, 10, 110);
        rect = new Wall(115, 265, 10, 110);

        rect = new Wall(675, 435, 10, 110);
        rect = new Wall(675, 265, 10, 110);

        rect = new Wall(400, 50, 10, 103);

        rect = new Wall(0, 655, 75, 15);
        rect = new Wall(730, 655, 75, 15);

        rect = new Wall(50, 100, 75, 55);
        rect = new Wall(675, 100, 75, 55);

        rect = new Wall(175, 100, 175, 55);
        rect = new Wall(460, 100, 175, 55);

        rect = new Wall(50, 195, 75, 25);
        rect = new Wall(675, 195, 75, 25);

        rect = new Wall(255, 195, 300, 15);
        rect = new Wall(255, 540, 300, 15);
        rect = new Wall(330, 655, 150, 15);

        rect = new Wall(400, 195, 15, 55);
        rect = new Wall(400, 540, 15, 75);
        rect = new Wall(400, 655, 15, 75);

        rect = new Wall(185, 424, 10, 131);
        rect = new Wall(610, 425, 10, 130);

        rect = new Wall(185, 195, 10, 192);
        rect = new Wall(610, 195, 10, 192);
        rect = new Wall(185, 255, 160, 15);
        rect = new Wall(470, 255, 140, 15);

        rect = new Wall(185, 595, 165, 15);
        rect = new Wall(465, 595, 155, 15);

        rect = new Wall(55, 595, 70, 15);
        rect = new Wall(675, 595, 70, 15);
        rect = new Wall(115, 595, 15, 75);
        rect = new Wall(675, 595, 15, 75);

        rect = new Wall(55, 715, 295, 15);
        rect = new Wall(465, 715, 280, 15);
        rect = new Wall(185, 655, 100, 75);
        rect = new Wall(520, 655, 100, 75);
        
         rect = new Wall(250, 310, 15, 175);
        rect = new Wall(545, 310, 15, 175);
        rect = new Wall(250, 485, 310, 15);
        rect = new Wall(250, 310, 105, 15);
         rect = new Wall(450, 310, 105, 15);
        
        rect.setFill(Color.BLUE);
        wall.add(rect);
        
        //g.getChildren().add(rect);

        Arc arc = new Arc();
        primaryStage.setScene(scene);

        MyTimer timer = new MyTimer();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override

            public void handle(KeyEvent event) {
                String code = event.getCode().toString();
                //    input.remove( code );
                if (event.getCode() == KeyCode.RIGHT) { // don't use toString here!!!
                    pacman.setCenterX(pacman.getCenterX() + 15);
                    pacman.setFill(Color.YELLOW);
                    pacman.direction = "right";
                     pacman.setStartAngle(45.0f);
                 pacman.checkBounds();
                } else if (event.getCode() == KeyCode.LEFT) {
                    pacman.setCenterX(pacman.getCenterX() - 15);
                    pacman.setFill(Color.YELLOW);
                    pacman.direction = "left";
                     pacman.setStartAngle(235.0f);
                    pacman.checkBounds();
                } else if (event.getCode() == KeyCode.UP) {
                    pacman.setCenterY(pacman.getCenterY() - 15);
                    pacman.setFill(Color.YELLOW);
                    pacman.direction = "up";
                     pacman.setStartAngle(135.0f);
                    pacman.checkBounds();
                } else if (event.getCode() == KeyCode.DOWN) {
                    pacman.setCenterY(pacman.getCenterY() + 15);
                    pacman.setFill(Color.YELLOW);
                    pacman.direction = "down";
                    pacman.setStartAngle(315.0f);
                    pacman.checkBounds();
                }
            }
        });
        primaryStage.show();
        timer.start();
    }
    


 

    static class Pacman extends Arc {

        int x = 400;
        int y = 500;
        public boolean up = true;
        public boolean down = true;
      public  boolean left = true;
     public   boolean right = true;
        String direction = "Right";
    
        public Pacman(int x, int y) {
            this.setCenterX(x);
            this.setCenterY(y);
            //this.setCenterX(35.0f);
            //this.setCenterY(75.0f);
            this.setRadiusX(13f);
            this.setRadiusY(13f);
            this.setStartAngle(45.0f);
            this.setLength(270.0f);
            this.setType(ArcType.ROUND);
            this.setFill(Color.YELLOW);
            g.getChildren().add(this);
         

        }
           void waka() {
            iteration++;
            if (iteration % 10 == 0) {
                if (this.getLength() == 270) {
                    this.setLength(360.0f);
                }
            } else if (iteration % 5 == 0) {
                if (this.getLength() == 360) {
                    this.setLength(270.0f);
                }
            }
           }
              //      void gotcaught() {
           // this.setFill(Color.ANTIQUEWHITE);
            //this.checkPellet(); 
        //}
        //public boolean amiavailable() {
           //
       // }
        
public void checkBounds(){
       
            for (Wall w : wall) {
                boolean collisionDetected = false;
                if (pacman.getBoundsInParent().intersects(w.getBoundsInParent()) && pacman.direction.equals("up")) {      
                    collisionDetected = true;
                    pacman.checkPellet();
                    pacman.setCenterY(pacman.getCenterY() + 5);
                }
                if (pacman.getBoundsInParent().intersects(w.getBoundsInParent()) && pacman.direction.equals("down")) {
                    collisionDetected = true;
                    pacman.setCenterY(pacman.getCenterY() - 5);
                    pacman.checkPellet();
                }
                if (pacman.getBoundsInParent().intersects(w.getBoundsInParent()) && pacman.direction.equals("left")) {
                    collisionDetected = true;
                    pacman.setCenterX(pacman.getCenterX() + 5);
                    pacman.checkPellet();
                }
                if (pacman.getBoundsInParent().intersects(w.getBoundsInParent()) && pacman.direction.equals("right")) {
                    collisionDetected = true;
                    pacman.setCenterX(pacman.getCenterX() - 5);
                    pacman.checkPellet();
                }
                if (collisionDetected) {
                    System.out.println("boopity boop boop mcboop");
                }
            }
            
            }
     public void checkPellet(){
       
            for (Pellet p : pellet) {
                boolean collisionDetected = false;
                if (pacman.getBoundsInParent().intersects(p.getBoundsInParent()) && pacman.direction.equals("up")) {      
                    collisionDetected = true;
                 p.setFill(Color.BLUEVIOLET);
                 p.setCenterX(90000);
                 p.setCenterY(90000);
                 p.setRadiusX(0);
                 p.setRadiusY(0);
                 
                }
                if (pacman.getBoundsInParent().intersects(p.getBoundsInParent()) && pacman.direction.equals("down")) {
                    collisionDetected = true;
                 p.setFill(Color.BLUEVIOLET);
                                  p.setCenterX(90000);
                 p.setCenterY(90000);
                 p.setRadiusX(0);
                 p.setRadiusY(0);
                }
                if (pacman.getBoundsInParent().intersects(p.getBoundsInParent()) && pacman.direction.equals("left")) {
                    collisionDetected = true;
                 p.setFill(Color.BLUEVIOLET); 
                                  p.setCenterX(90000);
                 p.setCenterY(90000);
                 p.setRadiusX(0);
                 p.setRadiusY(0);
                }
                if (pacman.getBoundsInParent().intersects(p.getBoundsInParent()) && pacman.direction.equals("right")) {
                    collisionDetected = true;
          p.setFill(Color.BLUEVIOLET);
                                   p.setCenterX(90000);
                 p.setCenterY(90000);
                 p.setRadiusX(0);
                 p.setRadiusY(0);             }
                if (collisionDetected) {
                    System.out.println("POOOOOOOOOOOOOOOOOOOOOOOOIIIIIIIIIIIIIIIIIIIIIIIIIIINTTTTTTT");
                }
            }
            
            }
    

 }

   
    

   
    static class Wall extends Rectangle {

        public boolean stop = false;
  public boolean up = true;
        public boolean down = true;
      public  boolean left = true;
     public   boolean right = true;
        public Wall(int x, int y, int w, int h) {
            this.setX(x);
            this.setY(y);
            this.setHeight(h);
            this.setWidth(w);
            this.setFill(Color.BLUE);
            g.getChildren().add(this);
            wall.add(this);
        }

    
    public void Wall(int x, int y){
        
    }
    }
 static class Pellet extends Arc {

      
        public boolean up = true;
        public boolean down = true;
      public  boolean left = true;
     public   boolean right = true;
        String direction = "Right";
    
        public Pellet(int x, int y) {
            this.setCenterX(x);
            this.setCenterY(y);
             
            this.setRadiusX(5f);
            this.setRadiusY(5f);
            this.setStartAngle(45.0f);
            this.setLength(360.0f);
            this.setType(ArcType.ROUND);
            this.setFill(Color.WHITE);
            
              
            
            this.setFill(Color.WHITESMOKE);
            g.getChildren().add(this);
         

        }

      
        
 }

//((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))
    private static class MyTimer extends AnimationTimer {

        boolean movedown = true;

        /// handle is defined by the abstract parent class -- it must be redined 
        /// this is what happens again and again until stop()
        @Override

        public void handle(long now) {
            // You can look at the key presses here as well -- this is one of many. Try others
                        doHandle();
            iteration++;
            if (pacman.direction == "up") {
                pacman.setCenterY(pacman.getCenterY() - 3);
                pacman.waka();
pacman.checkBounds();
            }
            if (pacman.direction == "down") {
                pacman.setCenterY(pacman.getCenterY() + 3);
                pacman.waka();
                pacman.checkBounds();
            }
            if (pacman.direction == "right") {
                pacman.setCenterX(pacman.getCenterX() + 3);
                pacman.waka();
                pacman.checkBounds();
            }
            if (pacman.direction == "left") {
                pacman.setCenterX(pacman.getCenterX() - 3);
                pacman.waka();
                pacman.checkBounds();
                
                
                
            }

/// notice doHandle()  is what happens again and again it's defined below
        }
private void doHandle(){
   pacman.checkBounds();
    if(pacman.getCenterX() > 850){
        pacman.setCenterX(pacman.getCenterX()-851);
    }
       if(pacman.getCenterX() < 0){
        pacman.setCenterX(pacman.getCenterX() + 851);
    }
       if(pacman.getCenterY() > 975){
        pacman.setCenterY(pacman.getCenterY()-976);
    }
          if(pacman.getCenterY() < 0){
        pacman.setCenterY(pacman.getCenterX()+ 976);
    }
     pacman.waka();
}
       
        }
        

    }
