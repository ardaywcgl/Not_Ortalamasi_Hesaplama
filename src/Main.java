import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a,b,c;
        System.out.println("1.notunuzu giriniz");
        a = input.nextInt();
        System.out.println("2.notunuzu giriniz");
        b = input.nextInt();
        System.out.println("3.notunuzu giriniz");
        c = input.nextInt();
        int i = (a + b + c) / 3;
        System.out.println( "not ortalamanız :" + i  );
        };
    }
