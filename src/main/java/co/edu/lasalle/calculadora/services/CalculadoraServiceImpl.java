package co.edu.lasalle.calculadora.services;
import org.springframework.stereotype.Service;

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
    
}
