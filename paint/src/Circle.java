import java.awt.*;

public class Circle extends Ellipse{

    public Circle (int Rayon)
    {

        super (Rayon, Rayon);
    }

    public Circle (int px, int py, Color c)
    {

        super (px,py,c);
    }
// le cercle  est une elispe avec les deux rayons x et y de la mm longueur
    public void setBoundingBox (int height, int width)
    {
        this.RayonX=height/2;
        this.RayonY=height/2;
    }

//pareille que pour l elispe mais avec Ry =Rx et inversement
    public void setRayonX(int RayonX)
    {
        super.setRayonX (RayonX);
        super.setRayonY (RayonX);
    }

    public void setRayonY(int RayonY)
    {
        super.setRayonX (RayonY);
        super.setRayonY (RayonY);
    }



    @Override
    public String toString() {
        //return  String.format("valeur de x =" + this.x +"valeur de y ="+ this.y);
        return ("valeur de hauteur = " + this.RayonY +" et valeur de longueur = "+ this.RayonX);

    }


}
