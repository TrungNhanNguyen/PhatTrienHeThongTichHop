import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số phần tử trong mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double total = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhập vào giá trị cho phần tử thứ "+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        System.out.format("Kết quả là:  %.3f", total);
    }
}
