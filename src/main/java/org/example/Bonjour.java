package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Bonjour {

    public String saluer(String name){
        if(name.isEmpty()){
            return "Bonjour, l'ami";
        } else {
            String[] allName = name.split(",");
            List<String> lowerName;
            List<String> upperName;

            if(allName.length == 1) {
                name = allName[0];
                if (name.equals(name.toUpperCase(Locale.ROOT))) {
                    return "BONJOUR, " + name;
                } else {
                    return "Bonjour, " + name;
                }
            } else {
                lowerName = new ArrayList<>();
                upperName = new ArrayList<>();
                for (int i = 0; i < allName.length; i++) {
                    if (allName[i].equals(allName[i].toUpperCase(Locale.ROOT))) {
                        upperName.add(allName[i]);
                    } else {
                        lowerName.add(allName[i]);
                    }
                }
                String finalString = "";

                if (lowerName.size() >= 1) {
                    finalString += "Bonjour, " + lowerName.get(0) + ".";
                    for (int i = 0; i < lowerName.size() - 1; i++) {
                       finalString += ", " + lowerName.get(i);
                    }
                    finalString += " et " + lowerName.get(lowerName.size() - 1) + ".";
                } else {
                    finalString += "BONJOUR";
                }
                if(upperName.size() >= 1){
                    if(lowerName.size() != 0){
                        finalString += " ET BONJOUR";
                    }
                    if(upperName.size() == 1){
                        finalString += ", " + upperName.get(0) + " !";
                    } else {
                        for (int i = 0; i < upperName.size() - 1; i++) {
                            finalString += ", " + upperName.get(i);
                        }
                        finalString += " ET " + upperName.get(upperName.size() - 1) + " !";
                    }
                }
                return finalString;
            }
        }
    }
}
