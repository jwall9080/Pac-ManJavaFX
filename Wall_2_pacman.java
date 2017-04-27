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

        Scene scene = new Scene(g, 825, 1000, Color.web("#000000", 1.0));
        pacman = new Pacman(400, 500);
        rect = new Wall(250, 250 , 12, 12);
        rect.setFill(Color.BLUE);
        wall.add(rect);
        g.getChildren().add(rect);

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
                         checkBounds(pacman);
                } else if (event.getCode() == KeyCode.LEFT) {
                    pacman.setCenterX(pacman.getCenterX() - 15);
                    pacman.setFill(Color.YELLOW);
                    pacman.direction = "left";
                     pacman.setStartAngle(235.0f);
                    checkBounds(pacman);
                } else if (event.getCode() == KeyCode.UP) {
                    pacman.setCenterY(pacman.getCenterY() - 15);
                    pacman.setFill(Color.YELLOW);
                    pacman.direction = "up";
                     pacman.setStartAngle(135.0f);
                    checkBounds(pacman);
                } else if (event.getCode() == KeyCode.DOWN) {
                    pacman.setCenterY(pacman.getCenterY() + 15);
                    pacman.setFill(Color.YELLOW);
                    pacman.direction = "down";
                    pacman.setStartAngle(315.0f);
                    checkBounds(pacman);
                }
            }
        });
        primaryStage.show();
        timer.start();
    }
    


    public boolean checkBounds(Shape s) {
        boolean collisionDetected = false;
        for (Wall w : wall){
            if(s.getBoundsInParent().intersects(w.getBoundsInParent())){
                System.out.println("WHY YOU DO DIS?");
                pacman.setCenterX(-10);
                 pacman.setCenterY(-10);
                return true;
            }
        }
        return false;
    }

    static class Pacman extends Arc {

        int x = 400;
        int y = 500;
        String direction = "Right";
    
        public Pacman(int x, int y) {
            this.setCenterX(x);
            this.setCenterY(y);
            this.setCenterX(25.0f);
            this.setCenterY(25.0f);
            this.setRadiusX(19.5f);
            this.setRadiusY(19.5f);
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
        }

    
    static class Wall extends Rectangle {

        public boolean stop = false;

        public Wall(int x, int y, int w, int h) {
            this.setX(x);
            this.setY(y);
            this.setHeight(w);
            this.setWidth(h);
            this.setFill(Color.BLUE);
            g.getChildren().add(this);
            wall.add(this);
        }

    
    public void Wall(int x, int y){
        
    }
    }
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

            }
            if (pacman.direction == "down") {
                pacman.setCenterY(pacman.getCenterY() + 3);
                pacman.waka();
            }
            if (pacman.direction == "right") {
                pacman.setCenterX(pacman.getCenterX() + 3);
                pacman.waka();
            }
            if (pacman.direction == "left") {
                pacman.setCenterX(pacman.getCenterX() - 3);
                pacman.waka();
                
            }

/// notice doHandle()  is what happens again and again it's defined below
        }
private void doHandle(){
     pacman.waka();
}
       
        }
        

    }

