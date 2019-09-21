import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Driver {

     @Test //
     public void testeTipoAngulo() {
         //Testando retângulo
         Triangulo tr = new Triangulo(3, 4, 5);
         assertTrue(tr.getTipoAngulo() == Triangulo.Tipo.RETANGULO);

         //Testando obtusângulo
         Triangulo to = new Triangulo(3, 3, 5);
         assertTrue(to.getTipoAngulo() == Triangulo.Tipo.OBTUSANGULO);

         //Testando acutângulo
         Triangulo ta = new Triangulo(3, 3, 3);
         assertTrue(ta.getTipoAngulo() == Triangulo.Tipo.ACUTANGULO);
     }

    @Test //
    public void testeTipoLado() {
        //Testando escaleno
        Triangulo te = new Triangulo(3, 4, 5);
        assertTrue(te.getTipoLado() == Triangulo.Tipo.ESCALENO);

        //Testando isósceles
        Triangulo ti = new Triangulo(3, 3, 5);
        assertTrue(ti.getTipoLado() == Triangulo.Tipo.ISOSCELES);

        //Testando equilátero
        Triangulo teq = new Triangulo(3, 3, 3);
        assertTrue(teq.getTipoLado() == Triangulo.Tipo.EQUILATERO);
    }

    @Test
    public void testeIsTriangulo(){
        //Testando se é triangulo e nesse caso não é
        Triangulo t = new Triangulo(3, 3, 7);
        assertTrue(t.isTriangulo() == false );
    }

}
