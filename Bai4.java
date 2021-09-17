import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhập số nguyên n từ bàn phím:");
        int n=scan.nextInt();
        int sum = 0;
        for(int i=0; i<= n;i++)
        {
            sum = sum + i;
        }
        System.out.println("Tổng từ 1 đến "+n +" là: " + sum);
    }
}
