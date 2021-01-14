import java.util.Random;
import java.util.Scanner;

public class PrviZadatak {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean provjera = false;
        String unos="";
        Random rand = new Random();
        int randomBroj = rand.nextInt(3)+1;
        String odabirKompa = "";

        switch (randomBroj) {
            case 1:
                odabirKompa = "skare";
                break;
            case 2:
                odabirKompa = "kamen";
                break;
            case 3:
                odabirKompa = "papir";
                break;
        }

        System.out.println("Napišite kamen, skare ili papir");

        while (!provjera) {
            unos = scanner.nextLine();
            if (unos.equalsIgnoreCase("kamen") || unos.equalsIgnoreCase("skare")
                    || unos.equalsIgnoreCase("papir")) {
                System.out.println("Vaš odabir je: " + unos);
                System.out.println("Odabir kompa je: " + odabirKompa);
                provjera = true;
            } else {
                System.out.println("Niste unijeli točan naziv, pokušajte ponovo");
                provjera = false;
            }
        }

        provjeraPobjednika(unos,odabirKompa);
    }

    private static void provjeraPobjednika(String igrac, String komp){
        if (igrac.equals(komp)){
            System.out.println("Nerješeno je!");
        }
        else if (igrac.equals("skare") && komp.equals("papir") || igrac.equals("papir") && komp.equals("kamen") ||
                igrac.equals("kamen") && komp.equals("skare")){
            System.out.println("Pobjedili ste!");
        }
        else{
            System.out.println("Izgubli ste!");
        }
    }
}
