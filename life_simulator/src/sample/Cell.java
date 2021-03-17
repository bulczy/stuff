package sample;

import javafx.scene.layout.StackPane;

public class Cell extends StackPane {

    private int column;
    private int row;

    public Cell(int column, int row){

        this.column = column;
        this.row = row;
    }
}
