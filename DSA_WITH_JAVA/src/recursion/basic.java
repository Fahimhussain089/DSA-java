package recursion;

public class basic {
    public static void main(String[] args) {
        message();

    }
    public static void message(){
        System.out.print("print 1 ");
        message1();
    }
    public static void message1(){
        System.out.print("print 2 ");
        message2();
    }
    public static void message2(){
        System.out.print("print 3 ");
        message3();
    }
    public static void message3(){
        System.out.print("print 4 ");
        message4();
    }
    public static void message4(){
        System.out.print("print 5 ");
    }
}
