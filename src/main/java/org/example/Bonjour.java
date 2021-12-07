package org.example;

public class Bonjour {

    public String saluer(String name){
        if(name.isEmpty()){
            return "Bonjour, l'ami";
        } else {
            return "Bonjour, " + name;
        }
    }
}
