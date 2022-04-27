package test;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;
import tp03.ejercicio1.ContadorArbol;
import tp03.ejercicio1.ProfundidadArbolBinario;
import tp03.ejercicio1.RedBinariaLlena;

public class TestArbol {
	public static void main (String[]args) {
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> arbol15 = new ArbolBinario<Integer>(15);
		ArbolBinario<Integer> arbol13 = new ArbolBinario<Integer>(13);
		ArbolBinario<Integer> arbol10 = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> arbol9 = new ArbolBinario<Integer>(9);
		ArbolBinario<Integer> arbol11 = new ArbolBinario<Integer>(11);
		ArbolBinario<Integer> arbol16 = new ArbolBinario<Integer>(16);
		
		ArbolBinario<Integer> arbolEspejo = new ArbolBinario<Integer>();
		
		arbol.agregarHijoDerecho(arbol15);
		arbol15.agregarHijoDerecho(arbol16);
		arbol15.agregarHijoIzquierdo(arbol13);
		
		
		arbol.agregarHijoIzquierdo(arbol10);
		arbol10.agregarHijoIzquierdo(arbol9);
		arbol10.agregarHijoDerecho(arbol11);
		
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
		
		RedBinariaLlena resultaRetardo = new RedBinariaLlena();	
		
		System.out.println("Resultado de retardo de reenvio: " + resultaRetardo.retardoReenvio(arbol));	
		
		System.out.println("Resultado entre niveles: ");
		arbol.entreNiveles(0, 1);
		
		ProfundidadArbolBinario resultadoProfundidad = new ProfundidadArbolBinario(arbol);
		System.out.println("El resultado de la profundidad de 2 es: " + resultadoProfundidad.sumaElementosProfundidad(2));
		
		
		
	}
}
