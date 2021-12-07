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
                String finalString = "Bonjour, ";
                for(int i = 0; i < allName.length - 2; i++){
                    finalString += allName[i] + ", ";
                }
                finalString += allName[allName.length - 2] + " et " + allName[allName.length - 1];
                return finalString;
            }
        }
    }
}
