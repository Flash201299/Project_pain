import java.awt.*;
import java.io.*;

public abstract class Figure implements Serializable{
    protected Point origin;
    protected Color c;


    public Figure (Point p)
    {
        this.origin=p;
    }
    // abstract de la fonction pour set l origin et la couleur d une figure qq
    public Figure (Point p, Color col)
    {
        this.origin=p;
        this.c=col;
    }

    public String toString ()
    {
        return "A figure that starts in ("+origin.getX()+
                ", "+origin.getY()+")";
    }


    public abstract void setBoundingBox (int height, int width);
    public abstract void draw (Graphics g);

}
