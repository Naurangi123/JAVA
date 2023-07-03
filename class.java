class Point {
    int x;
    int y;

    Point(int x1, int y1) {
        x = x1;
        y = y1;

    }
    
}// end of point class

class Circle {
    int originX = 5;
    int originY = 10;
    int radius = 3;
    //Default constructor
    Circle() {

    }

    Circle(int X1, int Y1, int r) {
        originX = X1;
        originY = Y1;
        radius = r;
    }
    //Constructor taking parameters as the type of Point and as the second as an int 
    Circle(Point p, int r) {
        originX = p.x;
        originY = p.y;
        radius = r;

    }

    void display() {
        System.out.println("Center at " + originX + " and " + originY);
        System.out.println("Radius= " + radius);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(13, 15, 5);
        Circle c3 = new Circle(new Point(18, 17), 10);
        c1.display();
        c2.display();
        c3.display();

    }
}