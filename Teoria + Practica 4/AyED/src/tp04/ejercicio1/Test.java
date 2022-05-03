package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class Test {
	
	public static void main(String []args) {
		ArbolGeneral<Integer> arbol13 = new ArbolGeneral<Integer>(13);
		ArbolGeneral<Integer> arbol15 = new ArbolGeneral<Integer>(15);
		ArbolGeneral<Integer> arbol17 = new ArbolGeneral<Integer>(17);
		ArbolGeneral<Integer> arbol18 = new ArbolGeneral<Integer>(18);
		ArbolGeneral<Integer> arbol19 = new ArbolGeneral<Integer>(19);
		
		ArbolGeneral<Integer> arbol7 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> arbol11 = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> arbol14 = new ArbolGeneral<Integer>(14);
		ArbolGeneral<Integer> arbol16 = new ArbolGeneral<Integer>(16);
		
		ListaGenerica<ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
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
