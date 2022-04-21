package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class PilaGenerica<T> {
	private ListaEnlazadaGenerica<T> datos = new ListaEnlazadaGenerica<T> ();
	
	public void apilar(T dato) {
		this.datos.agregarInicio(dato);
	}
	
	public T desapilar() {
		T dato = this.datos.elemento(1);
		this.datos.eliminarEn(1);
		return dato;
	}
	
	public T tope() {
		this.datos.comenzar();
		return this.datos.elemento(1);
	}
	
	public boolean esVacia() {
		return this.datos.esVacia();
	}
}
