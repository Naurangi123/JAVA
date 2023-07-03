class Construc {
    private String s;
    private int a;
    private int b;
    //Default constructor
    Construc() {
        s = "Naurangi lal";
        a = 12;
        b = 15;
    }

    //Paramerterized Constructor
    Construc(String s, int a) {
        this.s = s;
        this.a = a;
    }
    //Parameterised Constructor
    Construc(String s, int a, int b) {
        this.s = s;
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("hello");
        System.out.println("Name is -->" + s);
        System.out.println("Age is -->" + a);
        System.out.println("Marks  is--> "+b);
    }
}

class Con1 {
    public static void main(String[] args) {
        Construc c1 = new Construc();
        c1.display();
        Construc c2 = new Construc("World", 15);
        c2.display();
        Construc c3 = new Construc("Rajesh", 25);
        c3.display();
        Construc c4 = new Construc("PQR", 12, 50);
        c4.display();
        Construc c5 = new Construc("XYZ", 10, 40);
        c5.display();
    }
}