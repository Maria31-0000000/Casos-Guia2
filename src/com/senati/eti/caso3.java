package com.senati.eti;

import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese numero 2: ");
		int n2 = sc.nextInt();
		
		String mensaje = "";
		
		if (n1 == n2)
			mensaje = "los numeros son iguales";
		else if (n1 > n2)
			mensaje = "El primer numero " + n1 + " es mayor";
		else
			mensaje = "El segundo numero " + n2 + " es mayor";
		
		System.out.println("\n----R E S U L T A D O S----");
		System.out.println("Mensaje: " + mensaje);

	}

}
