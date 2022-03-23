import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero para el arreglo: ");
		int s = sc.nextInt();
		int[] arreglo = elArregloPa(s);
		System.out.print("Aca esta su arreglo: " );
		for (int n = 0; n < arreglo.length; n++) {
			System.out.print(arreglo[n]);
		}
		sc.close();
	}
	
	public static int[] elArregloPa(int n) {
		int[] arreglo = new int[n];
		for (int i = 1; i <= n; i++) {
			arreglo[i-1] = i * n;
		}
		return arreglo;
	}
	
}
