import java.awt.*;

public class Ellipse extends Figure{

    protected int RayonX;
    protected int RayonY;

    public Ellipse(int x, int y)
    {
        super (new Point());
        this.RayonX=x;
        this.RayonY=y;
    }

    public Ellipse(int px, int py, Color c)
    {
        super (new Point(px,py),c);
        this.RayonX=0;
        this.RayonY=0;
    }


    public void draw (Graphics g)
    {
        int Px, Py; // permet de prendre en compte les veleurs négatifs par rapport à l'origine

        if (RayonX<0) {Px=origin.getX()+RayonX*2;}
        else {Px=origin.getX();}

        if (RayonY<0) {Py=origin.getY()+RayonY*2;}
        else {Py=origin.getY();}

        g.setColor(c);
        g.fillOval(Px, Py, Math.abs(RayonX*2), Math.abs(RayonY*2));
    }


    public void setBoundingBox (int height, int width)
    {
        this.RayonY=width/2;
        this.RayonX=height/2;
    }

    public void setRayonX (int x) {
        this.RayonX = x;
    }

    public void setRayonY (int y) {
        this.RayonY=y;
    }


    @Override
    public String toString() {
        //return  String.format("valeur de x =" + this.x +"valeur de y ="+ this.y);
        return ("valeur de hauteur = " + this.RayonY +" et valeur de longueur = "+ this.RayonX);

    }

}
