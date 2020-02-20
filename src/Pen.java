import java.awt.*;

public class Pen {
    private String name;
    private Color color;

    public Pen(String name, Color color){
        this.name = name;
        this.color = color;
    }


    public String getName(){
        return this.name;
    }

    public String changeName(String name){
        this.name = name;
        return this.name;
    }

    public Color getColor(){
        return this.color;
    }

}
