package Kayttoliittyma;

import Keskiarvo.Keskiarvo;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author antti
 */
public class Kayttoliittyma {

    private ArrayList<Integer> arvosanat = new ArrayList<>();
    private Scanner lukija;

    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
    }

    public void aloita() {
        
        System.out.print("Anna käyttäjätunnus: ");
        String tunnus = lukija.nextLine();

        System.out.print("Anna salasana: ");
        String salasana = lukija.nextLine();

        if (this.kirjaudu(tunnus, salasana)) {
            this.valikko();
        }


    }

    public void valikko() {
        int valinta;
        System.out.println("(1) Anna arvosanat ja laske keskiarvo.");
        System.out.println("(0) Lopeta ohjelma.");

        while (true) {

            System.out.print("Anna toiminto: ");
            valinta = Integer.parseInt(lukija.nextLine());

            if (valinta == 0) {
                System.out.println("Ohjelma lopetetaan.");
                break;
            } else if (valinta == 1) {
                this.arvosanojenSyotto();
            }

        }
    }

    public void arvosanojenSyotto() {
        int arvosana;

        System.out.println("Syötä arvosanat (0-5):");

        System.out.print("Ohjelmoinnin perusteet: ");
        arvosana = Integer.parseInt(lukija.nextLine());
        if (arvosana >= 0 && arvosana <= 5) {
            arvosanat.add(arvosana);
        }

        System.out.print("Ohjelmoinnin jatkokurssi: ");
        arvosana = Integer.parseInt(lukija.nextLine());
        if (arvosana >= 0 && arvosana <= 5) {
            arvosanat.add(arvosana);
        }

        System.out.print("Ohjelmistotekniikan menetelmät: ");
        arvosana = Integer.parseInt(lukija.nextLine());
        if (arvosana >= 0 && arvosana <= 5) {
            arvosanat.add(arvosana);
        }

        System.out.print("Johdatus yliopistomatematiikkaan: ");
        arvosana = Integer.parseInt(lukija.nextLine());
        if (arvosana >= 0 && arvosana <= 5) {
            arvosanat.add(arvosana);
        }

        Keskiarvo ka = new Keskiarvo();
        

        System.out.println("Keskiarvo: " + ka.laske(arvosanat));
    }

    public boolean kirjaudu(String tunnus, String salasana) {
        // hallinto-tilin kirjautuminen
        if (tunnus.equals("hallinto") && salasana.equals("gangnamstyle")) {
            return true;
        }

        // opiskelijan kirjautuminen
        if (tunnus.equals("opiskelija") && salasana.equals("macarena")) {
            return true;
        }

        return false;
    }
}
