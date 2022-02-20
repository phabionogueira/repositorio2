package Desafio;

import java.util.*;

public class senhaForte {

	public static void main(String[] args) {

		boolean numero = false;
		boolean maiuscula = false;
		boolean minuscula = false; // declaração de conjunto de variaveis e um vetor que usaremos no algoritimo
		boolean carEspec = false;
		boolean tamanho = false;
		char[] vchar = { '!', '@', '#', '$', '%', '&', '*', '(', ')', '-', '+' };

		System.out.println(
				"digite uma senha com 6 digitos, com no mínimo um minúsculo, um maiúsculo, um caractere especial e um número");

		Scanner digitar = new Scanner(System.in);
		String senha = digitar.next(); // recebe a digitação do usuario

		while ((numero == false) || (maiuscula == false) || (minuscula == false) || (carEspec == false)
				|| (tamanho == false)) {

			char[] c = senha.toCharArray();

			for (int i = 0; i != c.length; i++) {
				if (c[i] >= '0' && c[i] <= '9') {
					numero = true;
				} else if (c[i] >= 'A' && c[i] <= 'Z') { // validação de maiusculo, minusculo, tamanho e numero
					maiuscula = true;
				} else if (c[i] >= 'a' && c[i] <= 'z') {
					minuscula = true;
				} else if (c.length == 6) {
					tamanho = true;
				}

				for (int j = 0; j < c.length; j++) {

					for (int y = 0; y < vchar.length; y++) { // validação do caractere especial
						if (c[i] == vchar[j]) {
							carEspec = true;

						}
					}

				}

			}

			if ((numero == false) || (maiuscula == false) || (minuscula == false) || (carEspec == false)
					|| (tamanho == false)) {

				System.out.println(
						"ERRADO!!Digite novamente com no mínimo um minúsculo, um maiúsculo, um caractere especial e um número");
				digitar = new Scanner(System.in);
				senha = digitar.next(); // senha errada pede para fazer novamente, caso certa imprime na tela
			} else {
				System.out.println(senha);
			}

		}

	}

}
