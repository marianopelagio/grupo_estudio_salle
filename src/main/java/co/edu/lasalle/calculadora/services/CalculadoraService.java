package co.edu.lasalle.calculadora.services;
import co.edu.lasalle.exception.CalculadoraException;

public interface CalculadoraService {
    String sumarV1(int a, int b);
    String restarV1(int a, int b);
    String multiplicarV1(int a, int b);
    String dividirV1(int a, int b) throws CalculadoraException ;
}
