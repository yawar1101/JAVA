package Geeks;

public class Working {
    public static void main(String[] args) {
        String s1 = "Yawar";
        String s2 = "Mohd";
        if (s1.compareToIgnoreCase(s2) > 0)
            s2 = s1;

        System.out.println(s2);
    }
}
