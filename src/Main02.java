import java.util.Scanner;

public class Main02 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int senha;
        do {

            IO.println("Digite a senha");
            senha=sc.nextInt();

        }while (senha !=1234);
    }
}



