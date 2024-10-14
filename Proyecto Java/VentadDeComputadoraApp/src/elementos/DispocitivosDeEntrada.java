package elementos;

public class DispocitivosDeEntrada {
	protected String tipoEntrada;
	protected String marca;

	public DispocitivosDeEntrada() {
	}

	public DispocitivosDeEntrada(String tipoEntrada, String marca) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	// metodo toString
	@Override
    public String toString() {
        return "Tipo de entrada: " + tipoEntrada + ", Marca: " + marca;
    }

}

// clase raton hereda de DispocitivosDeEntrada
class Raton extends DispocitivosDeEntrada {

	private static int contadorRaton = 0;

	private int idRaton;

	public Raton() {
		super();
		Raton.contadorRaton++;
	}

	public Raton(String tipoEntrada, String marca,int idRaton) {
		super(tipoEntrada,marca);
		this.idRaton = idRaton;
		Raton.contadorRaton++;
	}
	public Raton(int idRaton) {
		super();
		this.idRaton = idRaton;
		Raton.contadorRaton++;
	}

	public int getIdRaton() {
		return idRaton;
	}

	public void setIdRaton(int idRaton) {
		this.idRaton = idRaton;
	}

	public static int getContadorRaton() {
		return contadorRaton;
	}

	// metodo toString
	@Override
    public String toString() {
        return "Raton [idRaton=" + idRaton + ", " + super.toString() + "]";
    }
	

}

// clase teclado hereda de DispocitivosDeEntrada

class Teclado extends DispocitivosDeEntrada {

    private static int contadorTeclado = 0;

    private int idTeclado;

    public Teclado() {
        super();
        Teclado.contadorTeclado++;
    }

    public Teclado(int idTeclado) {
        super();
        this.idTeclado = idTeclado;
        Teclado.contadorTeclado++;
    }
    public Teclado(String tipoEntrada, String marca,int idTeclado) {
        super(tipoEntrada,marca);
        this.idTeclado = idTeclado;
        Teclado.contadorTeclado++;
    }
   
    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    public static int getContadorTeclado() {
        return contadorTeclado;
    }

	@Override
	public String toString() {
        return "Teclado [idTeclado=" + idTeclado + ", " + super.toString() + "]";
    }

}
