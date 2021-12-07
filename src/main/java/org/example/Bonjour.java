package org.example;

import java.util.Locale;

public class Bonjour {

    public String saluer(String name){
        if(name.isEmpty()){
            return "Bonjour, l'ami";
        } else {
            if(name.equals(name.toUpperCase(Locale.ROOT))){
                return "BONJOUR, " + name;
            } else {
                return "Bonjour, " + name;
            }
        }
    }
}
