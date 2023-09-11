package ru.mirea.pract2;

public class B_Circle {
    private B_Point p;
    private int r;

    public B_Circle(B_Point p, int r) {
        this.r = r;
        this.p = p;
    }

    public int getX( ) {
        return p.x;
    }
    public void setX(int a ) {
       p.x = a;
    }
    public int getY( ) {
        return p.y;
    }
    public void setY(int b ) {
        p.y = b;
    }

}
