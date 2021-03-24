package com.senati.eti;

import java.util.Scanner;

public class caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese cliente: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese producto [TB/LT/MN/IM] : ");
		String producto = sc.nextLine(); 
		
		System.out.println("Ingrese forma de pago [C1/C2]: ");
		String pago = sc.nextLine();
		
		System.out.println("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.println("--------------------");
		
		
		String fpago = "";
		
		float precio = 0;
		
		switch (producto) {
		case "TB":
			precio = 350;
			break;
		case "LT":
			precio = 2300;
			break;
		case "MN":
			precio = 850;
			break;
		case "IM":
			precio = 680;
			break;
		default:
			precio = 0;
			break;
		
		}
		
		float importe = (float)precio * cantidad;
		
		float desct = 0, incre = 0;
		
		float totalp = 0;
		
		switch(pago) {
		case "C1":
			fpago = "Contado";
			desct = 0.05f * importe ;
			totalp = importe - desct;
			break;
		case "C2":
			fpago = "Crédito";
			incre = 0.12f * importe ;
			totalp = importe + incre;
			break;
			
		
		}
		
		System.out.println("\nCliente: " + nombre);
		System.out.println("Producto: " + producto);
		System.out.println("Precio: " + precio);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Importe: " + importe);
		System.out.println("Forma de pago: " + fpago);
		if (fpago == "Contado")
			System.out.println("Descuento: " + desct);
		else 
			System.out.println("Incremento: " + incre);
		System.out.println("Total a pagar: " + totalp); 

	}

}
