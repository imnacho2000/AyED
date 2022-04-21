package test;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;
import tp03.ejercicio1.ContadorArbol;

public class TestArbol {
	public static void main (String[]args) {
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> arbol1 = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> arbol2 = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> arbol3 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> arbol4 = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> arbol5 = new ArbolBinario<Integer>(60);
		ArbolBinario<Integer> arbol6 = new ArbolBinario<Integer>(66);
		
		ArbolBinario<Integer> arbolEspejo = new ArbolBinario<Integer>();
		
		arbol.agregarHijoDerecho(arbol1);
		arbol1.agregarHijoDerecho(arbol5);
		arbol5.agregarHijoDerecho(arbol6);
		
		arbol.agregarHijoIzquierdo(arbol2);
		arbol2.agregarHijoIzquierdo(arbol3);
		arbol3.agregarHijoIzquierdo(arbol4);
		
		System.out.println("La cantidad de hojas es: " + arbol.contarHojas());
		arbol.enOrden();
		
		arbolEspejo = arbol.espejo();
		
		System.out.println("El resultado de espejo es: ");
		arbolEspejo.enOrden();
		
		ContadorArbol resultado = new ContadorArbol(arbol);
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		
		lista = resultado.numerosPares();
		
		System.out.println("Lista en Orden: ");
		for (int n = 1; n <= lista.tamanio(); n++) {
			System.out.println(lista.elemento(n));
		}
		
		ListaEnlazadaGenerica<Integer> listaEnPostOrden = new ListaEnlazadaGenerica<Integer>();
		
		listaEnPostOrden = resultado.numerosParesPostOrden();
		System.out.println("Lista en Post Orden: ");
		for (int n = 1; n <= listaEnPostOrden.tamanio(); n++) {
			System.out.println(listaEnPostOrden.elemento(n));
		}
		
		
		
	}
}
