package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class Test {
	
	public static void main(String []args) {
		ArbolGeneral<String> arbol13 = new ArbolGeneral<String>("B");
		ArbolGeneral<String> arbol15 = new ArbolGeneral<String>(15);
		ArbolGeneral<String> arbol17 = new ArbolGeneral<String>(17);
		ArbolGeneral<String> arbol18 = new ArbolGeneral<String>(18);
		ArbolGeneral<String> arbol19 = new ArbolGeneral<String>(19);
		
		ArbolGeneral<String> arbol7 = new ArbolGeneral<String>(7);
		ArbolGeneral<String> arbol11 = new ArbolGeneral<String>(11);
		ArbolGeneral<String> arbol14 = new ArbolGeneral<String>(14);
		ArbolGeneral<String> arbol16 = new ArbolGeneral<String>(16);
		
		ListaGenerica<ArbolGeneral<String>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<String>>();
		
		hijos.agregarFinal(arbol13);
		hijos.agregarFinal(arbol15);
		hijos.agregarFinal(arbol17);
		hijos.agregarFinal(arbol18);
		hijos.agregarFinal(arbol19);
		
		arbol13.agregarHijo(arbol7);
		arbol13.agregarHijo(arbol11);
		
		arbol15.agregarHijo(arbol14);
		arbol15.agregarHijo(arbol16);
		
		ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(14,hijos);
		System.out.println("La altura del arbol es: " + arbol.altura());
		
		RecorridoAG resultado = new RecorridoAG();
		ListaGenerica<Integer> lista = resultado.numerosImparesMayoresQuePreOrden(arbol, 6);
		System.out.println("En Pre Orden: ");
		for (int i = 1; i <= lista.tamanio(); i++) {
			System.out.println("Los numeros son: " + lista.elemento(i));
		}
		
		lista = resultado.numerosImparesMayoresQueInOrden(arbol, 6);
		System.out.println("En Orden: ");
		for (int i = 1; i <= lista.tamanio(); i++) {
			System.out.println("Los numeros son: " + lista.elemento(i));
		}
		
		lista = resultado.numerosImparesMayoresQuePostOrden(arbol, 6);
		System.out.println("En Post Orden: ");
		for (int i = 1; i <= lista.tamanio(); i++) {
			System.out.println("Los numeros son: " + lista.elemento(i));
		}
		
		lista = resultado.numerosImparesMayoresQuePorNiveles(arbol, 6);
		System.out.println("Por niveles: ");
		for (int i = 1; i <= lista.tamanio(); i++) {
			System.out.println("Los numeros son: " + lista.elemento(i));
		}
		
		System.out.println("El nivel del dato 16 es: " + arbol.nivel(16));
		
		System.out.println("El ancho del arbol es: " + arbol.ancho());
	}

}
