package org.example;

public class Romain {

    public String nombreRomain(int i){

        String nombreConverti = "";

        if (i % 10000 == 3000) {
            nombreConverti += "MMM";
        }
        else if (i % 10000 >= 2000 && i % 10000 < 3000) {
            nombreConverti += "MM";
        }
        else if (i % 10000 >= 1000 && i % 10000 < 2000) {
            nombreConverti += "M";
        }


        if (i % 1000 >= 900 && i % 1000 < 1000) {
            nombreConverti += "CM";
        }
        else if (i % 1000 >= 800 && i % 1000 < 900) {
            nombreConverti += "DCCC";
        }
        else if (i % 1000 >= 700 && i % 1000 < 800) {
            nombreConverti += "DCC";
        }
        else if (i % 1000 >= 600 && i % 1000 < 700) {
            nombreConverti += "DC";
        }
        else if (i % 1000 >= 500 && i % 1000 < 600) {
            nombreConverti += "D";
        }
        else if (i % 1000 >= 400 && i % 1000 < 500) {
            nombreConverti += "CD";
        }
        else if (i % 1000 >= 300 && i % 1000 < 400) {
            nombreConverti += "CCC";
        }
        else if (i % 1000 >= 200 && i % 1000 < 300) {
            nombreConverti += "CC";
        }
        else if (i % 1000 >= 100 && i % 1000 < 200) {
            nombreConverti += "C";
        }


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
