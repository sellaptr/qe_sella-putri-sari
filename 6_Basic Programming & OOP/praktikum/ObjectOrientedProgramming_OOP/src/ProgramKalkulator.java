import java.util.Scanner;
public class ProgramKalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan operasi matematika (contoh: add(3,4)): ");
        String input = scanner.nextLine();

        String[] parts = input.split("[\\(\\),]");

        String operation = parts[0];
        int num1 = Integer.parseInt(parts[1]);
        int num2 = Integer.parseInt(parts[2]);

        int result = 0;

        switch (operation) {
            case "add":
                result = add(num1, num2);
                System.out.println("Penjumlahan: " + result);
                break;
            case "substract":
                result = substract(num1, num2);
                System.out.println("Pengurangan: " + result);
                break;
            case "multiply":
                result = multiply(num1, num2);
                System.out.println("Perkalian: " + result);
                break;
            case "divide":
                result = divide(num1, num2);
                System.out.println("Pembagian: " + result);
                break;
            default:
                System.out.println("Operasi tidak dikenali!");
        }

        scanner.close();
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int substract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
