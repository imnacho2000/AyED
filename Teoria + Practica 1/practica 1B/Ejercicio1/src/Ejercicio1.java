import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese rango inferior: ");
		int a = sc.nextInt();
		System.out.print("Ingrese rango superior: ");
		int b = sc.nextInt();
		System.out.print("Con for: ");
		calculando(a,b);
		System.out.print(" ");
		System.out.print(" Con While: ");
		calculandoDos(a,b);
		System.out.print(" ");
		System.out.print(" Sin nada: ");
		calculandoTres(a,b);
		sc.close();
	}
	
	public static void calculando(int a, int b){
		for (int n = a; n <= b ; n++) {
			System.out.print(n);
		}
	}
	
	public static void calculandoDos(int a, int b){
		while(a<=b) {
			System.out.print(a);
			a++;
		}
	}
	
	public static void calculandoTres(int a, int b){
		if(a<=b) {
			System.out.print(a);
			calculandoTres(a + 1, b);
		}
	}
}
