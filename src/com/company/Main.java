package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    int km;
    double acilisUcreti = 20,perKm = 2.20,tutar;

        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        tutar = (km * perKm) + 10;

        System.out.print("Ücretiniz : " + (tutar >= 20 ? tutar : 20) + " tl");












    }
}
