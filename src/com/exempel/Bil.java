package com.exempel;
public class Bil {

    public String hastighet;
    public String literMil;
    public String farg;

    public String bilInfo(String namn){
        String text = "Din" + "namn" + "\nHastighet: " + hastighet + "km/h.\nLiter per mil: "
                + literMil + "\nFärg: " + farg;

        return text;
    }

}
