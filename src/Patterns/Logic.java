package Patterns;

public class Logic {
    public static void main(String[] args) {
        patterLib(5);
    }

    static void pattern1(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int j = n; j >= rows; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    static void pattern5(int n) {
        for (int rows = 0; rows < 2 * n; rows++) {
            int totalColsInRows = rows > n ? 2 * n - rows: rows;
            for (int cols  = 0; cols < totalColsInRows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 0; row < n; row++) {
            int totalColsInRow = row;
            int noOfSpaces = n - totalColsInRow;
            for (int space = 0; space < noOfSpaces; space++) {
                System.out.print(" ");
            }

            for (int cols = 0; cols < totalColsInRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n? 2 * n - row: row;
            int noOfSpaces = n - totalColsInRow;
            for (int space = 0; space < noOfSpaces; space++) {
                System.out.print(" ");
            }
                for (int cols = 0; cols < totalColsInRow; cols++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void pattern30(int n) {
            for (int row = 1; row <= n; row++) {

                for (int space = 0; space < n - row; space++) {
                    System.out.print("  ");
                }

                for (int col = row; col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= row; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
        }

        public static boolean isPrime(int n) {
            if (n <= 1)
                return false;

                // Check if number is 2
            else if (n == 2)
                return true;

                // Check if n is a multiple of 2
            else if (n % 2 == 0)
                return false;

            // If not, then just check the odds
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }

        static void patterLib(int n) {
            for (int row = 1; row <= n; row++) {
                for (int space = 0; space < n - row; space++) {
                    System.out.print("  ");
                }

                for (int col = 2; col <= row; col++) {
                    if (isPrime(col))
                        System.out.print(col + " ");
                }

                for (int col = row - 1; col >= 2; col--) {
//                    System.out.print(col + " ");
                    if (isPrime(col))
                        System.out.print(col + " ");
                }
                System.out.println();
            }
        }
    }
