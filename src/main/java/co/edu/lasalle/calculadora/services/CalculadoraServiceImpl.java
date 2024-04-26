package co.edu.lasalle.calculadora.services;
import org.springframework.stereotype.Service;

import co.edu.lasalle.exception.CalculadoraException;

@Service
public class CalculadoraServiceImpl  implements CalculadoraService{

    @Override
    public String sumarV1(int a, int b) {
        return String.valueOf(a+b);
    }

    @Override
    public String restarV1(int a, int b) {
        return String.valueOf(a-b);
    }

    @Override
    public String multiplicarV1(int a, int b) {
        return String.valueOf(a*b);
    }

    @Override
    public String dividirV1(int a, int b) throws CalculadoraException {
        String ret = "";
        try{
            ret = String.valueOf(a/b);
        }catch(ArithmeticException ex){
            throw new CalculadoraException("División por cero");
        }
        return ret;
    }
    
}
