package com.exempel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Bil saab = new Bil();
        Bil volvo = new Bil();

        System.out.println("Skriv in hastigheten för din Saab: ");
        saab.hastighet = scan.nextLine();

        System.out.println("Skriv in hastigheten för din Volvo: ");
        volvo.hastighet = scan.nextLine();

        saab.literMil = "1.2";
        volvo.literMil = "1.6";
        saab.farg = "röd";
        volvo.farg = "blå";

        System.out.println(saab.bilInfo("Saab"));
        System.out.println(volvo.bilInfo("Volvo"));

        if (Integer.parseInt(saab.hastighet) > Integer.parseInt(volvo.hastighet)){
            System.out.println("Saab är snabbast!");
        }else {
            System.out.println("Volvo är snabbast");
        }
    }
}
