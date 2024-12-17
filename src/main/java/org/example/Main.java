package org.example;

public class Main {
    public static void main(String[] args) {
        // Bireysel hesap oluşturuluyor
        IndividualAccount account = new IndividualAccount("Ahmet", "Yılmaz", "123456789", "Binek", 100.0);

        // Bakiye görüntüleme
        System.out.println("Bireysel hesap için bakiye görüntüleme:");
        account.displayBalance();

        // Yeni bakiye ekleniyor
        account.addBalance(50.0);

        // Tekrar bakiye görüntüleme
        System.out.println("\nBireysel hesap için bakiye görüntüleme:");
        account.displayBalance();

        // Geçişler yapılıyor
        Passage passage1 = new Passage("2024-10-18", "Ankara", "İstanbul", 20.0);
        account.addPassage(passage1);

        Passage passage2 = new Passage("2024-10-19", "İstanbul", "Bursa", 15.0);
        account.addPassage(passage2);

        Passage passage3 = new Passage("2024-10-20", "Bursa", "Ankara", 25.0);
        account.addPassage(passage3);

        // Güzergahları görüntüleme
        account.displayRoutes();
    }
}
