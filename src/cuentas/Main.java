package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(miCuenta, "ingresar", 695);
        operativa_cuenta(miCuenta, "retirar", 2300);
    }
    
    public static void operativa_cuenta(CCuenta miCuenta, String operacion, float cantidad) {
        switch(operacion) {
        case "ingresar":
            try {
                System.out.println("Ingreso en cuenta");
                miCuenta.ingresar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
        	break;
        case "retirar":
	    	try {
	            miCuenta.retirar(cantidad);
	        } catch (Exception e) {
	            System.out.print("Fallo al retirar");
	        }
        	break;
        default:
        	System.out.println("Operación no permitida");
        }
    }
    
}
