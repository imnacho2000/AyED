package tp03.ejercicio1;

public class RedBinariaLlena {

	
	public int retardoReenvio(ArbolBinario<Integer> arbol) {
		int max1 = arbol.getDato();
		int max2 = arbol.getDato();
		
		if(!arbol.esHoja()) {
			max1 += retardoReenvio(arbol.getHijoIzquierdo());
			max2 += retardoReenvio(arbol.getHijoDerecho());
		}	
		
		return Math.max(max1, max2);
	}
	
}
