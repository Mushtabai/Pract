package ru.mirea.it.ivbo01;

public class Moving {
    interface Movable {
        void MoveUp();

        void MoveDown();

        void MoveLeft();

        void MoveRight();

    }

     static class MovablePoint implements Movable {
         int x;
         int y;
         int xSpeed;
         int ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.ySpeed = ySpeed;
            this.xSpeed = xSpeed;
        }

        public void MoveUp() {
            y = y + ySpeed;
        }

        public void MoveDown() {
            y = y - ySpeed;
        }

        public void MoveLeft() {
            x = x - xSpeed;
        }

        public void MoveRight() {
            x = x + xSpeed;
        }
        public String toString(){
            return ("Координаты точки: " + "x = " + x + " y = " + y );
        }
    }

     static class MovableCircle implements Movable {
         int x;
         int y;
         int xSpeed;
         int ySpeed;
         int radius;

        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            this.x = x;
            this.y = y;
            this.ySpeed = ySpeed;
            this.xSpeed = xSpeed;
            this.radius = radius;
        }

        public void MoveUp() {
            y = y + ySpeed;
        }

        public void MoveDown() {
            y = y - ySpeed;
        }

        public void MoveLeft() {
            x = x - xSpeed;
        }

        public void MoveRight() {
            x = x + xSpeed;
        }
        public String toString(){
            return ("Координаты центра круга: " + "x = " + x + " y = " + y + " радиус r = " + radius);
        }
    }
    public static void main(String[] args){
        Movable a = new MovablePoint(1,1,2,3);
        Movable b = new MovableCircle(1,1,4,2,5);
        System.out.println(a);
        a.MoveLeft();
        a.MoveDown();
        System.out.println(a);
        System.out.println(b);
        b.MoveRight();
        b.MoveUp();
        System.out.println(b);
    }
}
