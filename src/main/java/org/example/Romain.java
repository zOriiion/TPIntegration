package org.example;

public class Romain {

    public String nombreRomain(int i){

        String nombreConverti = "";

        if (i % 10 == 9)
        {
            nombreConverti += "IX";
        }
        else if (i % 10 == 8)
        {
            nombreConverti += "VIII";
        }
        else if (i % 10 == 7)
        {
            nombreConverti += "VII";
        }
        else if (i % 10 == 6)
        {
            nombreConverti += "VI";
        }
        else if (i % 10 == 5)
        {
            nombreConverti += "V";
        }
        else if (i % 10 == 4)
        {
            nombreConverti += "IV";
        }
        else if (i % 10 == 3)
        {
            nombreConverti += "III";
        }
        else if (i % 10 == 2)
        {
            nombreConverti += "II";
        }
        else if (i % 10 == 1)
        {
            nombreConverti += "I";
        }

        return  nombreConverti;
    }
}
