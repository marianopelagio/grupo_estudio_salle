package co.edu.lasalle.calculadora.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import co.edu.lasalle.calculadora.services.CalculadoraService;

@Controller
@RequestMapping(value = "api/calculadora")
public class CalculadoraController {
    @Autowired
    private CalculadoraService cs;

    @RequestMapping(value="/sumar/{a}/{b}", method = RequestMethod.GET)
     public ResponseEntity<String> sumarV1(@PathVariable int a, @PathVariable int b){
        try{
            String re = cs.sumarV1(a, b);
            return ResponseEntity.status(HttpStatus.OK)
                                 .header("mensaje", "ok")
                                 .body(re);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                    .header("mensaje", "fail")
                    .body(e.getMessage());
        }
    }

    @RequestMapping(value="/restar/{a}/{b}", method = RequestMethod.GET)
     public ResponseEntity<String> restarV1(@PathVariable int a, @PathVariable int b){
        try{
            String re = cs.restarV1(a, b);
            return ResponseEntity.status(HttpStatus.OK)
                                 .header("mensaje", "ok")
                                 .body(re);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                    .header("mensaje", "fail")
                    .body(e.getMessage());
        }
    }

    @RequestMapping(value="/multiplicar/{a}/{b}", method = RequestMethod.GET)
    public ResponseEntity<String> mutiplicarV1(@PathVariable int a, @PathVariable int b){
       try{
           String re = cs.multiplicarV1(a, b);
           return ResponseEntity.status(HttpStatus.OK)
                                .header("mensaje", "ok")
                                .body(re);
       }catch(Exception e){
           return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                   .header("mensaje", "fail")
                   .body(e.getMessage());
       }
   }

   @RequestMapping(value="/dividir/{a}/{b}", method = RequestMethod.GET)
    public ResponseEntity<String> dividirV1(@PathVariable int a, @PathVariable int b){
       try{
           String re = cs.dividirV1(a, b);
           return ResponseEntity.status(HttpStatus.OK)
                                .header("mensaje", "ok")
                                .body(re);
       }catch(Exception e){
           return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                   .header("mensaje", "fail")
                   .body(e.getMessage());
       }
   }


    @RequestMapping(value="/", method = RequestMethod.GET)
    public String init() {
        return "Hola Mundo";

    }
    
}
