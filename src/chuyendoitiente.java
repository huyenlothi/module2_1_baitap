import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        final double RATE = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap so tien USD muon doi");
        double Usd = scanner.nextDouble();
        double result = Usd * RATE;
        System.out.println(Usd+ " USD = " + result + "VND" );
    }
}
