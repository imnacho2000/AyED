package tp03.ejercicio1;

import tp02.ejercicio3.ColaGenerica;

public class ProfundidadArbolBinario {
	ArbolBinario<Integer> arbol;
	
	public ProfundidadArbolBinario() {
		
	}
	
	public ProfundidadArbolBinario(ArbolBinario<Integer> dato) {
		this.arbol = dato;
	}
	
	
	public int sumaElementosProfundidad(int p) {
        ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
        ArbolBinario<Integer> aux;
        int nivel = 0;
        int total = 0;
        if(!this.arbol.esVacio()) {
            cola.encolar(this.arbol);
            cola.encolar(null);
            while(!cola.esVacia() && nivel <= p) {
                aux = cola.desencolar();
                if(aux != null) {
                    if(nivel == p) 
                        total += aux.getDato();
                    if(aux.tieneHijoIzquierdo()) 
                        cola.encolar(aux.getHijoIzquierdo());
                    if(aux.tieneHijoDerecho())
                        cola.encolar(aux.getHijoDerecho());
                }else {
                    if(nivel++ < p) 
                        cola.encolar(null);
                }
            }
        }
        return total;
    }
}
