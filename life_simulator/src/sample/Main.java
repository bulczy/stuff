package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    private double sceneWidth = 1024;
    private double sceneHeight = 768;
    int rows = 20;
    int columns = 20;

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane root = new StackPane();
        Grid grid = new Grid(columns,rows, sceneWidth, sceneHeight);

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {

                Cell cell = new Cell(columns, rows);

                grid.add(cell, column, row);
            }
        }
            Scene scene = new Scene(root, sceneWidth, sceneHeight);
            primaryStage.setScene(scene);
            primaryStage.setTitle("my_world");
            primaryStage.setScene(scene);
            primaryStage.show();


    }
        public static void main (String[]args){
        launch(args);
        }

}