package org.example;

public abstract class HGSAccounts {
    private String firstName;
    private String lastName;
    private String idNumber;
    private String vehicleClass;
    private double balance;

    public HGSAccounts(String firstName, String lastName, String idNumber, String vehicleClass, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.vehicleClass = vehicleClass;
        this.balance = balance;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getIdNumber() { return idNumber; }
    public String getVehicleClass() { return vehicleClass; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void displayAccountInfo() {
        System.out.println("Ad: " + firstName);
        System.out.println("Kimlik Numarası: " + idNumber);
        System.out.println("Araç Sınıfı: " + vehicleClass);
        System.out.println("Bakiye: " + balance + " TL");
    }

    public abstract void addBalance(double amount);
}

