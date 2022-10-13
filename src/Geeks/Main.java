package Geeks;

public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3};
        int n = 5;
        int m = 3;
        unionArr(a, n, b, m);

    }

    public static void unionArr(int a[], int n, int b[], int m) {
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                System.out.print(a[i++] + " ");
            }
            else if (a[j] < b[i])
                System.out.print(b[j++] + " ");
            else {
                System.out.print(b[j++] + " ");
                i++;
            }
        }

        while (i < n)
            System.out.print(a[i++] + " ");
        while (j < m)
            System.out.print(b[j++] + " ");
    }
}
