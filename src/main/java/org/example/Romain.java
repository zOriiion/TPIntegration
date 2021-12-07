package org.example;

public class Romain {

    public String nombreRomain(int i){

        String nombreConverti = "";

        if (i % 100 >= 90 && i % 100 < 100)
        {
            nombreConverti += "XC";
        }
        else if (i % 100 >= 80 && i % 100 < 90)
        {
            nombreConverti += "LXXX";
        }
        else if (i % 100 >= 70 && i % 100 < 80)
        {
            nombreConverti += "LXX";
        }
        else if (i % 100 >= 60 && i % 100 < 70)
        {
            nombreConverti += "LX";
        }
        else if (i % 100 >= 50 && i % 100 < 60)
        {
            nombreConverti += "L";
        }
        else if (i % 100 >= 40 && i % 100 < 50)
        {
            nombreConverti += "XL";
        }
        else if (i % 100 >= 30 && i % 100 < 40)
        {
            nombreConverti += "XXX";
        }
        else if (i % 100 >= 20 && i % 100 < 30)
        {
            nombreConverti += "XX";
        }
        else if (i % 100 >= 10 && i % 100 < 20)
        {
            nombreConverti += "X";
        }


        if (i % 10 == 9) {
            nombreConverti += "IX";
        }
        else if (i % 10 == 8) {
            nombreConverti += "VIII";
        }
        else if (i % 10 == 7) {
            nombreConverti += "VII";
        }
        else if (i % 10 == 6) {
            nombreConverti += "VI";
        }
        else if (i % 10 == 5) {
            nombreConverti += "V";
        }
        else if (i % 10 == 4) {
            nombreConverti += "IV";
        }
        else if (i % 10 == 3) {
            nombreConverti += "III";
        }
        else if (i % 10 == 2) {
            nombreConverti += "II";
        }
        else if (i % 10 == 1) {
            nombreConverti += "I";
        }

        return  nombreConverti;
    }
}
