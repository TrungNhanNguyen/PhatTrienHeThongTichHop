import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("Nhập vào chuỗi cần in hoa: ");
        message = sc.nextLine();
        System.out.println("Chuỗi sau khi in hoa: ");
        System.out.println(message.toUpperCase());
    }
}
