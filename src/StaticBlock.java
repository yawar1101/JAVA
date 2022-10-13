public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("Inside static block");
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        StaticBlock.b = a * 5;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
