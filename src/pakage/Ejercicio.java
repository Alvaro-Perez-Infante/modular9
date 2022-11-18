package pakage;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final String SI_SON_AMIGOS = "Sí, si son amigos";
		final String NO_SON_AMIGOS = "No, no son amigos";
		int a;
		int b;
		boolean sonA;
		String respuesta;

		a = Util.leerInt("Introduce un número: ");
		b = Util.leerInt("Introduce otro número: ");

		sonA = sonNumerosAmigos(a, b);

		respuesta = sonA ? SI_SON_AMIGOS : NO_SON_AMIGOS;

		System.out.println(respuesta);

	}

	public static boolean sonNumerosAmigos(int n1, int n2) {

		int sumaDivN1;
		int sumaDivN2;
		boolean respuesta;

		sumaDivN1 = sumaDivisores(n1);
		sumaDivN2 = sumaDivisores(n2);

		if (sumaDivN1 == n2 && sumaDivN2 == n2) {

			respuesta = true;

		} else {

			respuesta = false;

		}
		
		// (Forma muy eficiendo de hacer lo mismo que el if anterior -->)  respuesta = (sumaDivN1 == n2 && sumaDivN2 == n1);
		
		return respuesta;
	}

	public static int sumaDivisores(int n) {

		int suma = 0;

		for (int div = 1; div <= n; div++) {

			if (n % div == 0) {
				suma += div;
			}
		}
		return suma;
	}
}
