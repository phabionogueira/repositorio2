package Desafio;

import java.util.Scanner;      //Importa classe scanner para capturar o n�mero digitado 

public class escadaAsterisco {

	public static void main(String[] args) {
		
		System.out.println("Por favor digite a quantidade de degraus");  // Menssagem para o usu�rio digitar o tamanho da escada 
		
		Scanner tamanho = new Scanner(System.in); // Captura a digita��o
		int degrau = tamanho.nextInt();           // Atribui o valor digitado a uma vari�vel           
		int i , j ;                               // Declara��o de vari�veis necess�rias para o algoritimo
		
		for(i = 1; i <= degrau; i++) {            // for que controla o tamanho 
			
			for(j = degrau - i; j >= 1; j--)      // for que imprime os espa�os
				System.out.print(" ");
			
			for(j = 1; j <= i; j++)               // for que imprime os *
				System.out.print("*");
		System.out.print("\r\n");
		}

	}

}
