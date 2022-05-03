package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class RecorridoAG {
	
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer>ab, int n){
		ListaGenerica<Integer> numeros= new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePreOrden(ab,numeros,n);
		return numeros;
	}
	
	private void numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> ab, ListaGenerica<Integer>nros, int n) {
		if (!ab.esVacio()) {
			if ((ab.getDato() % 2 !=0) && (ab.getDato() > n)) {
				nros.agregarFinal(ab.getDato());
			}
			if (ab.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos= ab.getHijos();
				hijos.comenzar();
				while (!hijos.fin()) {
					numerosImparesMayoresQuePreOrden(hijos.proximo(),nros,n);
				}
			}
		}
	}
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer>ab, Integer n){
		ListaGenerica<Integer> numeros= new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePostOrden(ab,numeros,n);
		return numeros;
	}
	
	private void numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer>ab,ListaGenerica<Integer> numeros, Integer n) {
		if (!ab.esVacio()) {
			if (ab.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos= ab.getHijos();
				hijos.comenzar();
				while (!hijos.fin()) {
					numerosImparesMayoresQuePostOrden(hijos.proximo(),numeros,n);
				}
			}
			if ((ab.getDato() % 2 != 0 && (ab.getDato() > n))) {
				numeros.agregarFinal(ab.getDato());			}
		}
	}
	
	
	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> ab, int n){
		ListaGenerica<Integer> nros= new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQueInOrden(ab,nros,n);
		return nros;
	}

	private void numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> ab, ListaGenerica<Integer> nros, int n) {
		if (!ab.esVacio()) {
			
			ListaGenerica<ArbolGeneral<Integer>> hijos = ab.getHijos();
			if (ab.tieneHijos()) {
				hijos.comenzar();
				numerosImparesMayoresQueInOrden(hijos.proximo(),nros,n);
			}
			
			if (ab.getDato() % 2 != 0 && ab.getDato() > n) nros.agregarFinal(ab.getDato());
			
			while (!hijos.fin()) {
				numerosImparesMayoresQueInOrden(hijos.proximo(),nros,n);		
			}
		
		}
	}
	
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer>a, int n){
		ListaGenerica<Integer> nros= new ListaEnlazadaGenerica<Integer>();
		numerosImparesMayoresQuePorNiveles(a,nros,n);
		return nros;
	}

	private void numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, ListaGenerica<Integer> nros, int n) {
		ColaGenerica<ArbolGeneral<Integer>> cola= new ColaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> aux;
		cola.encolar(a);
		cola.encolar(null);
		while (!cola.esVacia()) {
			aux= cola.desencolar();
			if (aux != null) {
				if (aux.getDato() % 2 != 0 && aux.getDato() > n) {
					nros.agregarFinal(aux.getDato());
				}
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<Integer>> hijos= aux.getHijos();
					hijos.comenzar();
					while (!hijos.fin()) {
						cola.encolar(hijos.proximo());
					}
				}
			}
			else
				if (!cola.esVacia()) cola.encolar(null);
		}
		
	}
	
	
	

}
