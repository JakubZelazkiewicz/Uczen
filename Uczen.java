package com.company;

import java.io.*;


public class Uczen {

    public static void main(String[] args) throws IOException {


            File UczniowieOceny = new File("C:\\Users\\Kuba\\Desktop\\iSA\\jdqz1-git-master\\Uczen\\src\\com\\company\\UczniowieOceny.txt");
            FileReader czytelnikFR = new FileReader(UczniowieOceny);
            BufferedReader czytelnik = new BufferedReader(czytelnikFR); {

                String wiersz =null;
        int nrLoop = 0;
        while((wiersz = czytelnik.readLine())!=null ){
            nrLoop = nrLoop+1;

                    System.out.println(nrLoop + "," + wiersz);
                }
                czytelnik.close();
            System.out.println("");
            System.out.println("");
                }


    Uczen uczen1 = new Uczen("Monika", "M");
    Uczen uczen2 = new Uczen("Agnieszka", "M");
    Uczen uczen3 = new Uczen("Kamil", "G");

        //Oceny uczen1
        System.out.println("Wyniki Moniki");
         System.out.println("Srednia ocen Moniki to " + uczen1.srednia());
         System.out.println("Najniższa ocena Moniki to " + uczen1.OcenaMin());
         System.out.println("Najwyższa ocena Moniki to " + uczen1.OcenaMax());
        System.out.println();
         //Oceny uczen2
        System.out.println("Wyniki Agnieszki");
        System.out.println("Srednia ocen Agnieszki to " + uczen2.srednia());
        System.out.println("Najniższa ocena Agnieszki to " + uczen2.OcenaMin());
        System.out.println("Najwyższa ocena Agnieszki to " + uczen2.OcenaMax());
        System.out.println();
         //Oceny uczen3
        System.out.println("Wyniki Kamila");
        System.out.println("Srednia ocen Kamila to " + uczen3.srednia());
        System.out.println("Najniższa ocena Kamila to " + uczen3.OcenaMin());
        System.out.println("Najwyższa ocena Kamila to " + uczen3.OcenaMax());
        System.out.println();



         }

    int iloscOcen = 6;
    String imie;
    String nazwisko;
    int [] oceny;

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = tabelaOcen();
    }

    public static int [] tabelaOcen() {
        int[] oceny = new int[6]; // deklaracja pustej tablicy
        for (int i = 0; i < 6; i++) { //petla uzupelniajca tablice
            int ocena = (int) Math.round(5 * Math.random() + 1); // losowe przypisanie oceny w sakli 1-6
            oceny[i] = ocena;
            //System.out.print(ocena);
        }
        return oceny;
    }

    public double srednia() {
        double a = 0;
        for(int i=0; i<this.iloscOcen; i++){
        double b = this.oceny[i];
        a=a+b;
    }
    return a/6;
}
    public int OcenaMin() {
        int Min=oceny[0];
        for(int i=1; i<6; i++){
            if(this.oceny[i]<Min) {
                Min = this.oceny[i];
            }

    }
        return Min;
    }
    public int OcenaMax() {
        int Max=oceny[0];
        for(int i=1; i<6; i++){
            if(this.oceny[i]>Max) {
                Max=this.oceny[i];
            }

        }
        return Max;
    }




    }
