import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class ArrayUse {

    public static void main(String[] args) {
        int[] values = { 1, 4, 3, 4, 7, 5, 8, 9 };
        for (int i = 0; i < 8; i++) {
            System.out.println(values[i]);
        }
    }
}

class Arr1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("how many subjects");
        int n = Integer.parseInt(br.readLine());
        int marks[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enters marks");
            marks[i] = Integer.parseInt(br.readLine());
        }
        int tot = 0;
        System.out.println("The marks are:");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i]);
            tot = tot + marks[i];
        }
        System.out.println("Total Marks=" + tot);
        float percent = (float) tot / n;
        System.out.println("Percent=" + percent);
        System.out.println("The length of array=" + marks.length);
    }
}

//Two DM Array
class Arr {
    public static void main(String[] args) {
        int x[][] = { { 12, 34, 56, 89, 43, 45 }, { 32, 98, 65, 87, 84, 76 }, { 16, 15, 19, 15, 10, 90 } };
        System.out.println("In Matrix From");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(x[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

//Three DM Arr
class Three {
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        int i, j, k;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    threeD[i][j][k] = i * j * k;
                }
            }
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 4; j++) {
                    for (k = 0; k < 5; k++) {
                        System.out.println(threeD[i][j][k] + "\t");
                    }
                    System.out.println("\t");
                }
                System.out.println();
            }
        }
    }
}

//Multipy of Two Array

class Multiply {
    int r1, c1, r2, c2;

    Multiply(int r1, int c1, int r2, int c2) {
        this.r1 = r1;
        this.c1 = c1;
        this.r2 = r2;
        this.c2 = c2;
    }

    int[][] getArray(int r, int c) {
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements for " + r + "X" + c + "Matrix:");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }

    int[][] findMul(int a[][], int b[][]) {
        int c[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < r2; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    void putArray(int res[][]) {
        System.out.println("The Resultant " + r1 + "X" + c2 + "Matrix is");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.println(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MatrixMultiply {
    public static void main(String[] args) {
        Multiply obj1 = new Multiply(2, 3, 3, 2);
        Multiply obj2 = new Multiply(3, 4, 4, 3);
        int x[][], y[][], z[][];
        System.out.println("Matrix-1");
        x=obj1.getArray(2, 3);
        System.out.println("Matrix-2:");
        y = obj2.getArray(4, 3);
        z = obj1.findMul(x, y);
        obj1.putArray(z);
    }
}



        
