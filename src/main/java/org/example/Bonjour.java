package org.example;

import java.util.Locale;

public class Bonjour {

    public String saluer(String name){
        if(name.isEmpty()){
            return "Bonjour, l'ami";
        } else {
            String[] allName = name.split(",");
            if(allName.length == 1) {
                name = allName[0];
                if (name.equals(name.toUpperCase(Locale.ROOT))) {
                    return "BONJOUR, " + name;
                } else {
                    return "Bonjour, " + name;
                }
            } else {
                return "Bonjour, " + allName[0] + " et " + allName[1];
            }
        }
    }
}
