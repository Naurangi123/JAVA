// public class static_members {
//     public static void main(String[] args) {
//         int NumResult = MathUtility.add(10, 5);
//         System.out.println("(10+5) is " + NumResult);

//     }

// }

// class MathUtility {
//     public static int add(int first, int second) {
//         return first + second;
//     }
// }

//Another Example

class B {
    int x = 0;
    static int y = 0;

    void setX(int n) {
        x = n;
    }

    void setY(int n) {
        y = n;
    }

    int getX() {
        return x;

    }

    int getY() {
        return y;
    }
}

class A {
    public static void main(String[] args) {
        B x1 = new B();
        B x2 = new B();
        x1.setX(10);
        x2.setX(20);
        System.out.println(x1.getX());
        System.out.println(x2.getX());
        System.out.println(B.y);
        B.y = 5;
        System.out.println(B.y);

        x1.setY(B.y + 1);
        System.out.println(x1.getY());
    }
}