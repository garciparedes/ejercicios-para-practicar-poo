package cuenta;

import rol.Cliente;

public class Cuenta {
	
	// parte privada de la clase
	private Cliente cliente;
	private int saldo;
	
	
	public Cliente getTitular() { return cliente; } // Cliente tiene un método getEdad 
	
	
	public float getSaldo() { return saldo; }
	
	
	// otros métodos
	
	
	/**
	** @requires (cantidad >=0 && getSaldo()-cantidad>=0) **/
	public void reintegro(float cantidad) {}
	
	
	/**
	** @requires (cantidad >=0) **/
	public void ingreso(float cantidad) {}

}
