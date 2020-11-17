import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a");
        int a = scanner.nextInt();

        System.out.println("Enter number b");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }

        while (a!=b){
            if (a>b){
                a-=b;
            }else {
                b-=a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
