package com.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.print("Connessione alla banca dati online");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(700);
                System.out.print("");
            }
            System.out.println(" CONNESSO!");
        } catch (InterruptedException e) {}

        Scanner in = new Scanner(System.in);
        GestoreFile gf = new GestoreFile();
        List<Apiario> listaApiari = gf.carica();
        
        System.out.println("\n AREA RISERVATA APICOLTORE");

        boolean continua = true;
        while (continua) {
            System.out.println("\nInserimento dati produzione annuale:");
            
            System.out.print("Numero arnie apiario: ");
            int arnie = in.nextInt();
            in.nextLine(); 

            System.out.print("Comune: ");
            String comune = in.nextLine();

            System.out.print("Provincia: ");
            String provincia = in.nextLine();

            System.out.print("Regione: ");
            String regione = in.nextLine();

            System.out.print("Denominazione Miele: ");
            String miele = in.nextLine();
            
            System.out.print("Miele Nazionale (si/no): ");
            String tipo = in.nextLine();

            System.out.print("Quantità prodotta (kg): ");
            double kg = in.nextDouble();
            in.nextLine(); 

            listaApiari.add(new Apiario(arnie, comune, provincia, regione, miele, tipo, kg));

            System.out.print("Vuoi registrare un altro apiario? (si/nooo!!): ");
            if (in.nextLine().equalsIgnoreCase("n")) continua = false;
        }

        gf.salva(listaApiari);
        
        System.out.println("\nOperazione completata. I dati sono stati inviati al sistema.");
        System.out.println("Fine sessione.");
    }
}