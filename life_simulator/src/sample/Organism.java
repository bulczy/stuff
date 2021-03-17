package sample;

public abstract class Organism {

    private int STR;
    private int INT;
    private int pos_x;
    private int pos_y;
    private int world_ref;

    public void action(){}
    public void collision(){}
    public void draw_Me(){}

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public int getSTR() {
        return STR;
    }

    public int getINT() {
        return INT;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }
}
