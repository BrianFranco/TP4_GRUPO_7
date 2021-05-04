package TP4;

import java.io.IOException;

public class HoraInvalidaException extends Exception {
public HoraInvalidaException() {
	
}

@Override
public String getMessage() {
	return "Hora ingresada invalida, solo numeros y mayores 0.";
}

}
