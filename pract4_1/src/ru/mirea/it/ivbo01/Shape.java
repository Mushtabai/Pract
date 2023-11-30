package ru.mirea.it.ivbo01;

public  class Shape {
    public String getType()
    {
      //  String[] Sh = {"Circle","Rectangle","Square"};
        return ("Any figure");
    }
    public String toString()
    {
        return ("This shape ");
    }

};
 class Circle extends Shape {
     private double r;
     Circle(double r)
     {
       this.r =r;
     }
     public String getType()
     {
         return("Circle");
     }

     public double getArea()
     {
         return 3.14 * r*r;
     }
     public double getPerimetr()
     {
         return 2*3.14 *r;
     }
     @Override
     public String toString() {
         return super.toString()+(getType() +"with Perimetr: " + getPerimetr() +" and with Area: " + getArea());
     }
};
class Rectangle extends Shape {
    private double a, b;
    Rectangle (double a,double b)
    {
        this.a = a;
        this.b = b;
    }
    public String getType()
    {
        return("Rectangle");
    }
    public double getArea()
    {
        return a*b;
    }
    public double getPerimetr()
    {
        return 2*(a+b);
    }
    @Override
    public String toString() {
        return super.toString()+(getType() +" with Perimetr: " + getPerimetr() +"and with Area: " + getArea());
    }
};
class Square extends Shape {
    private double a;
    Square (double a)
    {
        this.a = a;
    }
    public String getType()
    {
        return("Square");
    }
    public double getArea()
    {
        return a*a;
    }
    public double getPerimetr()
    {
        return 4*a;
    }

    @Override
    public String toString() {
        return super.toString()+(getType() +"with Perimetr: " + getPerimetr() +"and with Area: " + getArea());
    }
}