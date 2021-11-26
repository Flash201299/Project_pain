import java.awt.Color;

public class Square extends Rectangle{


    public Square(int side)
    {
        super (side, side);
    }

    public Square (int px, int py, Color c)
    {
        super (px,py,c);
    }

    public void setLength(int side)
    {
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(int side)
    {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setBoundingBox (int height, int width)
    {

        this.width=height;
        this.height=height;
    }



    @Override
    public String toString() {
        //return  String.format("valeur de x =" + this.x +"valeur de y ="+ this.y);
        return ("Le carre à un cote de longueur = "+ this.width);

    }


}
