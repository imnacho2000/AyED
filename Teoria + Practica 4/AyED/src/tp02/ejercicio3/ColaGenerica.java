package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ColaGenerica<T> {
	private ListaEnlazadaGenerica<T> datos;
	
	public ColaGenerica(){
		this.datos = new ListaEnlazadaGenerica<T>();
		this.datos.comenzar();
	}
	
	public void encolar(T dato) {
		this.datos.agregarFinal(dato);
	}
	
	public T desencolar() {
		T dato = this.datos.elemento(1);
		this.datos.eliminarEn(1);
		return dato;
	}
	
	public T tope() {
		return this.datos.elemento(1);
	}
	
	public boolean esVacia() {
		return this.datos.esVacia();
	}
	
}
