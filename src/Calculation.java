import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập y: ");
        int y = scanner.nextInt();
//        Calculation calculation = new Calculation();
//        calculation.calculate(x,y);
        calculate(x,y);
    }
    public static void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng là: " + a);
            System.out.println("Hiệu là:" + b);
            System.out.println("Tích là: " + c);
            System.out.println("Hiệu là " + d);
        }
        catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
