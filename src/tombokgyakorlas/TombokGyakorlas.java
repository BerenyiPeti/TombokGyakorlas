package tombokgyakorlas;

import java.util.Random;

public class TombokGyakorlas {

    public static void main(String[] args) {
        TombFeltoltes();
    }

    private static void TombFeltoltes() {
        int tombHossz = 15;
        Random rndSzam = new Random();
        int[] tomb = new int[tombHossz];
        int also = 1, felso = 10;

        for (int i = 0; i < tombHossz; i++) {
            int szam = rndSzam.nextInt(felso - also + 1) + also;
            //System.out.println(szam);
            tomb[i] = szam;
        }

        for (int i = 0; i < tombHossz; i++) {
            System.out.print(tomb[i] + " ");
        }
        
        TombKiir(tomb);

    }

    private static void TombKiir(int[] tomb) {
        for (int i = 0; i < tomb.length - 1; i++) {
            System.out.print(tomb[i] + " ");
        }

    }

}
