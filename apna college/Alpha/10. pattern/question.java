import java.util.*;
import java.util.regex.Pattern;

public class question {
    public static void hollowRect(int l, int h) {

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == l - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void rotatedHalfPyranud(int size) {
        int s = size - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = s; j > 0; j--) {
                System.out.print(" ");
            }
            s--;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedWithNumbers(int size) {
        for (int i = size; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int size) {
        int n = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }

    public static void triangle_01(int size) {
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < i; j++) {
                    if ((j + 1) % 2 == 0) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
            } else {
                for (int j = 0; j < i; j++) {
                    if ((j + 1) % 2 == 0) {
                        System.out.print(0);
                    } else {
                        System.out.print(1);
                    }
                }

            }
            System.out.println();

        }
    }

    public static void butterflyPattern(int size) {
        int n = size - 2;
        int szHalf = size / 2;

        for (int i = 1; i <= size; i++) {
            if (i < size / 2) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                n -= 2;
            } else {
                for (int j = szHalf; j > 0; j--) {
                    System.out.print("*");
                }
                for (int j = n; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = szHalf; j > 0; j--) {
                    System.out.print("*");
                }
                n += 2;
                szHalf--;
            }
            System.out.println();
        }
    }

    public static void solidRombus(int size) {
        int n = size - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }

    public static void hollowRombus(int size) {
        int n = size - 1;

        for (int i = 0; i < size; i++) {
            for (int s = 0; s < n; s++) {
                System.out.print(" ");
            }
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < size; j++) {
                    if (j == 0 || j == size - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            n--;
            System.out.println();
        }
    }

    public static void dimongPattern(int size) {
        int n = size / 2;

        for (int i = 1; i <= size; i += 2) {
            n--;
            for (int s = 0; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 1; i > 0; i -= 2) {
            for (int s = 0; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            n++;
        }
    }

    public static void numPramid(int size) {
        int n = size - 1;

        for (int i = 1; i <= size; i++) {
            for (int s = n; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            n--;
            System.out.println();
        }
    }

    public static void palondramicPattern(int size) {
        int n = size - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = n; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            n--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Question 1
        int l = 5;
        int h = 4;
        hollowRect(l, h);

        // Question 2: INVERTED & ROTATED HALF-PYRAMID pattern
        // int size = 4;
        // rotatedHalfPyranud(size);

        // Question 3 INVERTED HALF-PYRAMID with Numbers pattern
        // int size = 5;
        // invertedWithNumbers(size);

        // question 4 FLOYD'S Triangle pattern
        // int size = 5;
        // floydTriangle(size);

        // Question 5: 0-1 Triangle pattern
        // int size=5;
        // triangle_01(size);

        // Question 6: BUTTERFLY pattern
        // int size = 8;
        // butterflyPattern(size);

        // Question 7: SOLID RHOMBUS pattern
        // int size = 5;
        // solidRombus(size);

        // Question 8: HOLLOW RHOMBUS pattern
        // int size = 5;
        // hollowRombus(size);

        // Question 9: DIAMOND pattern;
        // int size = 8;
        // dimongPattern(size);

        // Question 10: NUMBER PYRAMID pattern
        // int size = 5;
        // numPramid(size);

        // Question 11: PALINDROMIC Pattern with Numbers pattern
        // int size = 5;
        // palondramicPattern(size);
    }
}
