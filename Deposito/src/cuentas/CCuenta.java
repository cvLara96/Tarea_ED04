/**
 * Esta clase alberga los atributos y metodos propios de una cuenta bancaria
 * 
 * @author Carlos
 */
package cuentas;

public class CCuenta {


	/**
	 * Atributos de los objetos de tipo CCuenta
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    
	/**
	 * Metodo getter para el atributo nombre
	 * @return nombre. Nos devolverá el atributo nombre cuando sea llamado
	 */
    public String getNombre() {
		return nombre;
	}

    /**
     * Metodo setter para el atributo nombre
     * @param String nombre: recibe por parametro un String con un nombre
     * el cual mediante este metodo establecera al atributo nombre de la clase
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo getter para el atributo cuenta
	 * @return cuenta. Nos devolverá el atributo cuenta cuando sea llamado
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Metodo setter para el atributo cuenta
     * @param String cuenta: recibe por parametro un String con una cuenta
     * el cual mediante este metodo establecera al atributo cuenta de la clase
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Metodo getter para el atributo saldo
	 * @return saldo. Nos devolverá el atributo saldo cuando sea llamado
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo setter para el atributo saldo
     * @param double saldo: recibe por parametro un double que indica el saldo
     * el cual mediante este metodo establecera al atributo saldo de la clase
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Metodo getter para el atributo tipoInteres
	 * @return tipoInteres. Nos devolverá el atributo tipoInteres cuando sea llamado
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Metodo setter para el atributo tipoInteres
     * @param double tipoInteres: recibe por parametro un double que indica el tipoInteres
     * el cual mediante este metodo establecera al atributo tipoInteres de la clase
     */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * Constructor vacio (no recibe ningun parametro) por si fuese necesario su uso
	 */
	public CCuenta()
    {
    }

	/**
	 * Constructor que recibe como parametro:
	 * @param nom: String nom del titular de la cuenta
	 * @param cue: String cue con el numero de cuenta
	 * @param sal: double sal con el saldo de la cuenta
	 * @param tipo: double tipo con el tipo de interes
	 * Con estos parametros creará un objeto de tipo CCuenta que podremos utilizar 
	 * desde otra clase para llamar a los metodos de la clase CCuenta
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @return saldo: devuelve el saldo actual en la cuenta, similar al metodo getter para el saldo
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Metodo para ingresar saldo que recibe como parametro:
     * @param cantidad: double cantidad a ingresar en la cuenta
     * @throws Exception: en el caso de que se envie como parametro una cantidad negativa 
     * saltará una excepcion
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Metodo para retirar saldo que recibe como parametro:
     * @param cantidad: double cantidad a retirar en la cuenta
     * @throws Exception: en el caso de que se envie como parametro una cantidad negativa 
     * saltará una excepcion
     * Este metodo a su vez llamara al metodo estado() para obtener el saldo actual de la cuenta,
     * en caso de que este valor sea inferior a la cantidad ingresada, lanzara una excepcion indicando
     * que no hay suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

