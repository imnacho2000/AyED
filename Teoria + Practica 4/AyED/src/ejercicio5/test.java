package ejercicio5;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class test {
	
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
		
		

}
