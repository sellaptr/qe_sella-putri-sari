import java.util.Scanner;
public class DrawPersegi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();


      for (int j = 1; j <= n; j++) {
          for (int i = 1; i <= n; i++) {
              if (i % 3 == 0) {
                  System.out.print("X");
              } else if (i % 2 == 1) {
                  System.out.print("Y");
              } else {
                  System.out.print("Z");
              }

          }
          System.out.println();
      }
    }
}

