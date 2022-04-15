package cuentas;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void operativa_cuenta(String tipoOperacion, double cantidad) throws Exception
    {
    	switch(tipoOperacion) {
    	case "ingresar":
            if (cantidad<0)
                throw new Exception("No se puede ingresar una cantidad negativa");
            saldo = saldo + cantidad;
    		break;
    	case "retirar":
            if (cantidad <= 0)
                throw new Exception ("No se puede retirar una cantidad negativa");
            if (estado()< cantidad)
                throw new Exception ("No se hay suficiente saldo");
            saldo = saldo - cantidad;
    		break;
    	default:
    		System.out.println("Operaci�n no permitida");
    	}
    }

}
