package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Human extends Animal{

    public Human(String name, int x, int y){

        Rectangle rectangle = new Rectangle(50, 50);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.LIGHTBLUE);

        setPos_x(x);
        setPos_y(y);

    }

}
