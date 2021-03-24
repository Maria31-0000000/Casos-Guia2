package com.senati.eti;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int n = sc.nextInt();
		
		String estado = "Numero es impar";
		
		if(n % 2 == 0)
			estado = "Numero es par";
			
		System.out.println("\n---- R E S U L T A D O S----");
		System.out.println("Estado: " + estado);

	}

}
