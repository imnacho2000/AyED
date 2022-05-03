package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {
		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {
		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	

	public Integer altura() {
		System.out.println(this.getDato());
		if(!this.esVacio()) {
			if(this.esHoja()) {
				return 0;
			}
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			int max = -1;
			hijos.comenzar();
			while(!hijos.fin()) {
				Integer aux = hijos.proximo().altura(); 
				if(aux > max) {
					max = aux;
				}
			}
			return max+1;
		}else {
			return -1;
		}
	}

	public Integer nivel(T dato) {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T> aux;
		int camino = 0;
		cola.encolar(this);
		cola.encolar(null);
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux != null) {
				if(aux.getDato() == dato) {
					return camino;
				}
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> hijos= aux.getHijos();
					hijos.comenzar();
					while (!hijos.fin()) {
						cola.encolar(hijos.proximo());
					}
				}
			}
			else {
				if(!cola.esVacia()) {
					camino++;
					cola.encolar(null);					
				} 
			}
		}
		return camino;
	}

	public Integer ancho() {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T> aux;
		int cantNodos = 0;
		int max = -1;
		int nivel = 0;
		cola.encolar(this);
		cola.encolar(null);
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux != null) {
				cantNodos++;
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> hijos= aux.getHijos();
					hijos.comenzar();
					while (!hijos.fin()) {
						cola.encolar(hijos.proximo());
					}
				}
			}
			else {
				if(!cola.esVacia()) {
					cola.encolar(null);					
					nivel++;
					if(cantNodos > max) {
						max = cantNodos;						
					} 
					cantNodos = 0;
				} 
			}
		}
		return max;
	}

}