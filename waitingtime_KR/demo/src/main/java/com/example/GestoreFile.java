package com.example;

import com.google.gson.*;
import java.io.*;
import java.util.*;

public class GestoreFile {
    private String nomeFile = "miele.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void salva(List<Apiario> lista) {
        try (FileWriter writer = new FileWriter(nomeFile)) {
            gson.toJson(lista, writer);
        } catch (IOException e) {
            System.out.println("Errore nel salvataggio!");
        }
    }

    public List<Apiario> carica() {
        try (FileReader reader = new FileReader(nomeFile)) {
            Apiario[] array = gson.fromJson(reader, Apiario[].class);
            if (array != null) {
                return new ArrayList<>(Arrays.asList(array));
            }
        } catch (IOException e) {
            // Se il file non esiste ancora, non fa nulla e crea una lista nuova
        }
        return new ArrayList<>();
    }
}