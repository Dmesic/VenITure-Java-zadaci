import java.util.Scanner;

public class DrugiZadatak {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite tekst za koji mislite da je palindrom");
        String unos = scanner.nextLine();
        String unosIspravljen = unos.replaceAll("[^A-Za-z]+", "").toLowerCase();

        String prvaPolovica = unosIspravljen.substring(0, (unosIspravljen.length() / 2));
        String drugaPolovica = unosIspravljen.substring((unosIspravljen.length() / 2));

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(prvaPolovica);

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(drugaPolovica);
        stringBuilder2 = stringBuilder2.reverse();

        if (stringBuilder1.length() > stringBuilder2.length()) {
            stringBuilder1.setLength(stringBuilder1.length()-1);
        }
        else if(stringBuilder1.length() < stringBuilder2.length()){
            stringBuilder2.setLength(stringBuilder2.length()-1);
        }

        if (stringBuilder1.toString().equalsIgnoreCase(stringBuilder2.toString()))
            System.out.println("Unešen tekst je palindrom");
        else
            System.out.println("Unešen tekst nije palindrom");
    }
}
