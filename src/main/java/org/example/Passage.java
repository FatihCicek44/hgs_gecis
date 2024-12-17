package org.example;

public class Passage extends HGSPassages {

    public Passage(String date, String entryGate, String exitGate, double fee) {
        super(date, entryGate, exitGate, fee);
    }

    @Override
    public void recordPassage() {
        System.out.println("Tarih: " + getDate());
        System.out.println("Giriş Gişesi: " + getEntryGate());
        System.out.println("Çıkış Gişesi: " + getExitGate());
        System.out.println("Ücret: " + getFee() + " TL\n");
    }
}



