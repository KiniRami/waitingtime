package com.example;

public class Apiario {
    
    public int numero_arnie;
    
    
    public String comune;
    public String provincia;
    public String regione;
    
    
    public String denominazioneMiele; 
    public String tipologia;         
    public double quantitaKg;

    
    public Apiario(int numero_arnie, String comune, String provincia, String regione, 
                   String denominazioneMiele, String tipologia, double quantitaKg) {
        this.numero_arnie = numero_arnie;
        this.comune = comune;
        this.provincia = provincia;
        this.regione = regione;
        this.denominazioneMiele = denominazioneMiele;
        this.tipologia = tipologia;
        this.quantitaKg = quantitaKg;
    }

    
    @Override
    public String toString() {
        return "Apiario a " + comune + " (" + provincia + ", " + regione + ")\n" +
               " > Arnie: " + numero_arnie + " | Miele: " + denominazioneMiele + 
               " [" + tipologia + "] | Prodotto " + quantitaKg + " kg\n" +
               "";
    }
}