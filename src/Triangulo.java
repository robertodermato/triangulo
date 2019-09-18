public class Triangulo {

    private int ladoa, ladob, ladoc;
    public enum Tipo {EQUILATERO, ISOSCELES, ESCALENO, RETANGULO, ACUTANGULO, OBTUSANGULO};

    public Triangulo (int ladoa, int ladob, int ladoc){
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }

    public int getLadoa() {        return ladoa;    }

    public int getLadob() {        return ladob;    }

    public int getLadoc() {        return ladoc;    }

    public Tipo getTipoAngulo(Triangulo t){
        if (isTriangulo(t.getLadoa(), t.getLadob(), t.getLadoc())==false) return null;

    }

    public Tipo getTipoLado(Triangulo t){

                if (isTriangulo(t.getLadoa(), t.getLadob(), t.getLadoc())==false) return null;
                if (t.getLadoa()==t.getLadob() && t.getLadoc()==t.getLadob()) return Tipo.EQUILATERO;
                if (t.getLadoa()!=t.getLadob() && t.getLadob()!=t.getLadoc() && t.getLadoa()!=t.getLadoc()) return Tipo.ESCALENO;
                return Tipo.ISOSCELES;
    }

    public static boolean isTriangulo(int lado1, int lado2, int lado3){
        if (lado1 > (lado2 + lado3)) {
            return false;
        } else if (lado2 > (lado1 + lado3)) {
            return false;
        } else if (lado3 > (lado1 + lado2)) {
            return false;
        } else {
            return true;
        }
    }

    public String toString(){
        return "Triângulo";
    }

}
