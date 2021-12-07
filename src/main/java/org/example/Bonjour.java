package org.example;

public class Bonjour {

    public String saluer(String name){
        if(name.isEmpty()){
            return "Bonjour, lami";
        } else {
            return "Bonjour, " + name;
        }
    }
}
