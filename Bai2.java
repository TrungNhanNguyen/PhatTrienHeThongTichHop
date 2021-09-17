import java.util.Scanner;
public class Bai2 {
    public static void main(String args[])
    {
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra:");
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        if(num >= 2){
            if(isPrime)
            System.out.println(num + " Là số nguyên tố!");
            else
            System.out.println(num + " Không phải là số nguyên tố!");
        }
        else
            System.out.println(num + " Không phải là số nguyên tố!");
    }
}
