public class Learning {

    String message = "Hello World!";

   public static void display(Learning human) {
       System.out.println(human.message);
   }
    public static void main(String[] args) {
        Learning obj = new Learning();
        obj.message = "Yawar's Message";
        Learning.display(obj);
    }
}
