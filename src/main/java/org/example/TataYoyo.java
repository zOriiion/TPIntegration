package org.example;

public class TataYoyo {

    public String tataYoyo(int i){

        if(i <= 50 && i >= 1){
            if(i %3 == 0 && i %5 == 0){
                return "Tata Yoyo";
            } else if(i %3 == 0){
                return "Tata";
            } else if(i %5 == 0){
                return "Yoyo";
            } else {
                return String.valueOf(i);
            }
        } else {
            return "Nombre invalide";
        }
    }
}
