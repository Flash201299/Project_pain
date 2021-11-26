import java.io.*;

public class Point implements Serializable{
    private int x;
    private int y;

    public Point(int a, int b)
    {
        this.x=a;
        this.y=b;
    }

    public Point ()
    {
        this.x=0;
        this.y=0;
    }

    public int getX()
    { return x;}

    public int getY()
    { return this.y;}


    @Override
    public String toString() {
        //return  String.format("valeur de x =" + this.x +"valeur de y ="+ this.y);
        return ("valeur de x = " + this.x +" et valeur de y = "+ this.y);

    }
}
