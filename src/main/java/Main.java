import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę do sprawdzenia: ");
        int liczba = scanner.nextInt();

        boolean czyjestPierwsza = true;

        if (liczba <= 1) {
            czyjestPierwsza = false;
        } else {
            for (int i = 2; i <= Math.sqrt(liczba); i++) {
                if (liczba % i == 0) {
                    czyjestPierwsza = false;
                    break;
                }
            }}
        if (czyjestPierwsza) {
            System.out.println(liczba + " jest liczbą pierwszą.");
        } else {
            System.out.println(liczba + " nie jest liczbą pierwszą.");
        }

        scanner.close();
    }}