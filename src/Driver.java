import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Driver {

     @Test //
     public void testeRetangulo() {
         System.out.println("Testando retângulo");
         Triangulo tr = new Triangulo(3, 4, 5);
         if (tr.getTipoAngulo() == Triangulo.Tipo.RETANGULO) System.out.println("Passou no teste");
         else System.out.println("Teste falhou");
         assertTrue(tr.getTipoAngulo() == Triangulo.Tipo.RETANGULO);
     }

    @Test //
    public void testeObtusangulo() {
        System.out.println("Testando obtusângulo");
        Triangulo tr = new Triangulo(3, 3, 5);
        if (tr.getTipoAngulo() == Triangulo.Tipo.OBTUSANGULO) System.out.println("Passou no teste");
        else System.out.println("Teste falhou");
        assertTrue(tr.getTipoAngulo() == Triangulo.Tipo.OBTUSANGULO);
    }

}
