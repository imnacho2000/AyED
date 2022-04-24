package tp03.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ContadorArbol {
	private ArbolBinario<Integer> arbol;
	
	public ContadorArbol() {
	}
	
	public ContadorArbol(ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public ListaEnlazadaGenerica<Integer> numerosPares(){
		if(!this.arbol.esVacio()) {
			ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
			numerosEnOrden(lista,this.arbol);
			return lista;
		}
		return null;
	}
	
	public void numerosEnOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> arbol) {
		if(arbol != null) {
			if(arbol.tieneHijoIzquierdo()) {				
				numerosEnOrden(lista,arbol.getHijoIzquierdo());
			}
			if((arbol.getDato() % 2) == 0 ) {
				lista.agregarFinal(arbol.getDato());
			}
			if(arbol.tieneHijoDerecho()) {
				numerosEnOrden(lista,arbol.getHijoDerecho());				
			}
		}
	}
	
	
	
	public ListaEnlazadaGenerica<Integer> numerosParesPostOrden(){
		if(!this.arbol.esVacio()) {
			ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
			numerosEnPostOrden(lista,this.arbol);
			return lista;
		}
		return null;
	}
	
	public void numerosEnPostOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> arbol) {
		if(arbol != null) {
			if(arbol.tieneHijoIzquierdo()) {				
				numerosEnPostOrden(lista,arbol.getHijoIzquierdo());
			}
			if(arbol.tieneHijoDerecho()) {
				numerosEnPostOrden(lista,arbol.getHijoDerecho());				
			}
			if((arbol.getDato() % 2) == 0 ) {
				lista.agregarFinal(arbol.getDato());
			}
		}
	}
	
}
