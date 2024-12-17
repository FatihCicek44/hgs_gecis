package org.example;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class IndividualAccount extends HGSAccounts implements DisplayableDeposite, DisplayableRoutes {
    private List<HGSPassages> passagesList = new ArrayList<>();

    public IndividualAccount(String firstName, String lastName, String idNumber, String vehicleClass, double balance) {
        super(firstName, lastName, idNumber, vehicleClass, balance);
    }

    @Override
    public void addBalance(double amount) {
        setBalance(getBalance() + amount);
        System.out.println(amount + " TL bakiye eklendi. Yeni bakiye: " + getBalance() + " TL");
    }

    public void deductBalance(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " TL geçiş ücreti düşüldü. Yeni bakiye: " + getBalance() + " TL");
        } else {
            System.out.println("Yetersiz bakiye. Geçiş yapılamadı.");
        }
    }

    public void addPassage(HGSPassages passage) {
        if (getBalance() >= passage.getFee()) {
            passagesList.add(passage);
            deductBalance(passage.getFee());
            System.out.println("Geçiş kaydedildi:");
            passage.recordPassage();
        } else {
            System.out.println("Yetersiz bakiye, geçiş yapılamadı.");
        }
    }

    @Override
    public void displayBalance() {
        displayAccountInfo();
    }

    @Override
    public void displayRoutes() {
        System.out.println("\nBireysel hesap için tüm güzergahlar:");
        for (HGSPassages passage : passagesList) {
            System.out.println("Gişesi: " + passage.getEntryGate() + ", Çıkış Gişesi: " + passage.getExitGate() + ", Ücret: " + passage.getFee() + " TL");
        }
    }
}
