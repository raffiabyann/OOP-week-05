package week05.raffi.id.umn.ac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int pilihan;
		
		while (true) {
            System.out.println("-------Program Menghitung Bangun Ruang-------");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilihan : ");
            pilihan = s.nextInt();
            switch (pilihan) {
            case 1:
            	System.out.println("Masukkan Jari Jari Lingkaran :");
                double radius = s.nextDouble();
                System.out.println("Masukkan Warna :");
                String color = s.next();

                Circle circle = new Circle(radius, color);

                System.out.println("------------------Lingkaran--------------------");
                System.out.println("Warna : " + circle.getColor());
                System.out.println("Jari Jari : " + circle.getRadius());
                System.out.println("Keliling Lingkaran : " + circle.getPerimeter());
                System.out.println("Luas Lingkaran : " + circle.getArea());
                break;
            case 2:
            	 System.out.print("Masukkan Sisi Persegi : ");
                 double sisi = s.nextDouble();
                 System.out.print("Masukkan Warna : ");
                 String colorPersegi = s.next();

                 Square square = new Square(sisi, colorPersegi);

                 System.out.println("\n---- Persegi ----");
                 System.out.println("Warna : " + square.getColor());
                 System.out.println("Sisi : " + square.getSisi());
                 System.out.println("Keliling : " + square.getPerimeter());
                 System.out.println("Luas : " + square.getArea());
                 break;
            case 3:
            	 System.out.print("Masukkan Panjang : ");
                 double panjang = s.nextDouble();
                 System.out.print("Masukkan Lebar : ");
                 double lebar = s.nextDouble();
                 System.out.print("Masukkan Warna : ");
                 String colorPersegiPanjang = s.next();

                 Rectangle rect = new Rectangle(panjang, lebar, colorPersegiPanjang);

                 System.out.println("\n---- Persegi Panjang ----");
                 System.out.println("Warna : " + rect.getColor());
                 System.out.println("Panjang : " + rect.getPanjang());
                 System.out.println("Lebar : " + rect.getLebar());
                 System.out.println("Keliling : " + rect.getPerimeter());
                 System.out.println("Luas : " + rect.getArea());
                 break;
            case 4:
            	  System.out.print("Masukkan Alas : ");
                  double alas = s.nextDouble();
                  System.out.print("Masukkan Tinggi : ");
                  double tinggi = s.nextDouble();
                  System.out.print("Masukkan Warna : ");
                  String colorSegitiga = s.next();

                  Triangle tri = new Triangle(alas, tinggi, colorSegitiga);

                  System.out.println("\n---- Segitiga ----");
                  System.out.println("Warna : " + tri.getColor());
                  System.out.println("Alas : " + tri.getAlas());
                  System.out.println("Tinggi : " + tri.getTinggi());
                  System.out.println("Keliling : " + tri.getPerimeter());
                  System.out.println("Luas : " + tri.getArea());
                  break;
            case 5:
                System.out.println("Keluar dari program. Terima kasih!");
                s.close();
                return;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
		}
	}
}
