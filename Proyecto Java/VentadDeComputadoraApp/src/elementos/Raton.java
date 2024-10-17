package elementos;

//clase raton hereda de DispocitivosDeEntrada
public class Raton extends DispocitivosDeEntrada {

	private static int contadorRaton = 0;

	private int idRaton;

	public Raton() {
		super();
		this.idRaton = ++Raton.contadorRaton;
	}

	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton = ++Raton.contadorRaton;
	}

	public int getIdRaton() {
		return idRaton;
	}

	public static int getContadorRaton() {
		return Raton.contadorRaton;
	}

	// metodo toString
	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton + ", " + super.toString() + "]";
	}
}