package week05.raffi.id.umn.ac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Masukkan Jari Jari Lingkaran :");
		double radius= s.nextDouble();
		System.out.println("Masukkan Warna :");
		String color= s.next();
		
		Circle circle = new Circle (radius,color);
		System.out.println("------------------Lingkaran--------------------");
		System.out.println("Warna :" + circle.getColor());
		System.out.println("Jari Jari :" + circle.getRadius());
		System.out.println("Keliling Lingkaran :" + circle.getPerimeter());
		System.out.println("Luas Lingkaran :" + circle.getArea());
		s.close();
	}

}
