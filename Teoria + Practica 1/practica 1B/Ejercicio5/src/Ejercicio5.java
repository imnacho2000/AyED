
public class Ejercicio5 {
static int[] arreglo = new int[] {4,23,64,2,62};
  static int minimo = 9999;
  static int maximo = -1;
  static int promedio = 0;
	public static void main(String [] args) {
		Datos resultado = new Datos();
		System.out.println("Con Return: ");
		System.out.println(calcularUno(arreglo));
		System.out.println("Sin parametro de tipo vector: ");
		calcularDos(resultado);
		System.out.println("Maximo: " + resultado.getMaximo() + " Minimo: " + resultado.getMinimo() + " Promedio: " + resultado.getPromedio());
		System.out.println("Sin parametros, ni return: ");
		calcularTres();
		System.out.println("Maximo: " + maximo + " Minimo: " + minimo + " Promedio: " + promedio);
	}
	
	public static String calcularUno(int[] arreglo) {
		int min = 9999;
		int max = -1;
		int suma = 0;
		int promedioLocal = 0;
		for (int n = 0; n < arreglo.length ; n++) {
			if(arreglo[n] > max) {
				max = arreglo[n];
			}
			if(arreglo[n] < min) {
				min = arreglo[n];
			}
			suma += arreglo[n];
		}
		promedioLocal = suma/arreglo.length;
		return "Maximo: " + max + " Minimo: " + min + " Promedio: " + promedioLocal;
	}
	
	public static void calcularDos(Datos resultado) {
		int suma = 0;
		for (int n = 0; n < arreglo.length ; n++) {
			if(arreglo[n] > resultado.getMaximo()) {
				resultado.setMaximo(arreglo[n]); 
			}
			if(arreglo[n] < resultado.getMinimo()) {
				resultado.setMinimo(arreglo[n]);
			}
			suma += arreglo[n];
		}
		resultado.setPromedio(suma/arreglo.length);
	}
	
	public static void calcularTres() {
		int suma = 0;
		for (int n = 0; n < arreglo.length ; n++) {
			if(arreglo[n] > maximo) {
				maximo = arreglo[n];
			}
			if(arreglo[n] < minimo) {
				minimo = arreglo[n];
			}
			suma += arreglo[n];
		}
		promedio = suma/arreglo.length;
	}
}
