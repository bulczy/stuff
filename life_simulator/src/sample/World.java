package sample;

public class World {

    private double sceneWidth = 1024;
    private double sceneHeight = 768;

    private int WIDTH = 20;
    private int HEIGHT = 20;

    double gridWidth = sceneWidth / WIDTH;
    double gridHeight = sceneHeight / HEIGHT;

    Organism[][] world_container = new Organism[HEIGHT][WIDTH];


    public void next_Turn(){

    }

}
