package TP4;

import java.io.IOException;

public class NotaInvalidaException extends Exception {

	public NotaInvalidaException() {
		
	}

	@Override
	public String getMessage() {
		
		return "Debe ingresar solo n�meros y valores desde 1 hasta 10";
	}
}
