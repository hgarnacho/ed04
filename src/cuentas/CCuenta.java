package cuentas;

/**
* Clase CCuenta
* Clase que implementa los atributos y comportamientos de una cuenta bancaria
* @author Héctor Garnacho García
* @version 0.1, 2022/04/15
*/

public class CCuenta {

	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
    * Constructor por defecto de la clase. Vacío
    */
    public CCuenta()
    {
    }

    /**
    * Constructor sobrecargado que inicializa una cuenta
    * @param nom - Nombre de la cuenta (String).
    * @param cue - Número de cuenta (String).
    * @param sal - Saldo de la cuenta (double).
    * @param tipo - Tipo de la cuenta (double).
    */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
    * Método público que retorna el saldo de la cuenta
    * @return - Saldo de la cuenta (Double)
    */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método que suma una cantidad al saldo de la cuenta
     * @param cantidad - Cantidad a ingresar (double).
     * @throws Exception
     */  
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método que resta una cantidad al saldo de la cuenta
     * @param cantidad - Cantidad a retirar (double).
     * @throws Exception
     */ 
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Método retorna el nombre de la cuenta
     * @return string.
     */  
    public String getNombre() {
		return nombre;
	}

    /**
     * Método que establece el nombre de la cuenta
     * @param nombre (string).
     */  
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     * Método retorna el número de la cuenta
     * @return string.
     */  
	public String getCuenta() {
		return cuenta;
	}

    /**
     * Método que establece el número de la cuenta
     * @param cuenta (string).
     */  
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

    /**
     * Método retorna el saldo de la cuenta
     * @return double.
     */  
	public double getSaldo() {
		return saldo;
	}

    /**
     * Método que establece el saldo de la cuenta
     * @param saldo (double).
     */  
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    /**
     * Método retorna el interés de la cuenta
     * @return double.
     */  
	public double getTipoInteres() {
		return tipoInteres;
	}

    /**
     * Método que establece el tipo de interés de la cuenta
     * @param tipoInteres (double).
     */  
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
    
}
