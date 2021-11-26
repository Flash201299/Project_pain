import java.awt.*;

public class Rectangle extends Figure {


    protected int height;
    protected int width;

    public Rectangle (Point p)
    {
        super(p);
    }

    public Rectangle (int px, int py, Color c)
    {
        super(new Point(px,py),c);
        this.height=0;
        this.width=0;
    }

    public Rectangle (int w, int l)
    {
        super (new Point());
        this.width=w;
        this.height=l;
    }

    public void setBoundingBox (int height, int width)
    {
        this.width=width;
        this.height=height;
    }

    public void draw (Graphics g)
    {
        int realPx, realPy; // permet de prendre en compte les veleurs négatifs par rapport à l'origine

        if (height<0) {realPx=origin.getX()+height;}
        else {realPx=origin.getX();}

        if (width<0) {realPy=origin.getY()+width;}
        else {realPy=origin.getY();}

        g.setColor(c);
        g.fillRect(realPx, realPy, Math.abs(height), Math.abs(width));
    }

    public int getPerimeter()
    {	return (this.height+this.width)*2;}
    public int getSurface()
    {	return this.height*this.width;}
    public int getLength()
    {	return this.height;}
    public int getWidth()
    {	return this.width;}
    public void setLength (int l)
    {	this.height=l;}
    public void setWidth (int w)
    {	this.width=w;}

    public String toString ()
    {
        String s = "+";
        for (int i=0;i<height;i++) s=s+"--";
        s += "+\n";

        for (int j=0; j <width;j++)
        {
            s+="|";
            for (int i=0;i<height;i++) s=s+"  ";
            s+="|\n";
        }

        s+="+";
        for (int i=0;i<height;i++) s=s+"--";
        s += "+\n";
        return s;
    }

}

   /* @Override
    public String toString() {
        //return  String.format("valeur de x =" + this.x +"valeur de y ="+ this.y);
        return ("valeur de hauteur = " + this.height +" et valeur de longueur = "+ this.width);

    }*/



