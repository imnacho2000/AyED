
public class Datos {
	private int Maximo, Minimo, Promedio;

	public Datos() {
		super();
		Maximo = -1;
		Minimo = 9999;
		Promedio = 0;
	}

	public int getMaximo() {
		return Maximo;
	}

	public void setMaximo(int maximo) {
		Maximo = maximo;
	}

	public int getMinimo() {
		return Minimo;
	}

	public void setMinimo(int minimo) {
		Minimo = minimo;
	}

	public int getPromedio() {
		return Promedio;
	}

	public void setPromedio(int promedio) {
		Promedio = promedio;
	}
	
	
}
