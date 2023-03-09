import java.util.Scanner;
public class SegitigaArterik {
    public static void main(String[] args) {
        int i;
        int j;
        int k;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        for (i=1;i <=n ; i++) {
            for (j=n; j>i; j--) {
                System.out.print(" ");
            }
            for (k=1;k<(2*i) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
