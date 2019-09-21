public class Triangulo {

    private int ladoa, ladob, ladoc;

    public enum Tipo {EQUILATERO, ISOSCELES, ESCALENO, RETANGULO, ACUTANGULO, OBTUSANGULO}

    ;

    public Triangulo(int ladoa, int ladob, int ladoc) {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }

    public int getLadoa() {
        return ladoa;
    }

    public int getLadob() {
        return ladob;
    }

    public int getLadoc() {
        return ladoc;
    }

    public double getTipoAngulo() {
        if (isTriangulo(getLadoa(), getLadob(), getLadoc()) == false) return 0;
        double a2 = getLadoa() * getLadoa();
        double b2 = getLadob() * getLadob();
        double c2 = getLadoc() * getLadoc();
        double angulo1 = Math.toDegrees(Math.acos((a2 + b2 - c2) * 1.0 / (2.0 * getLadob() * getLadoa())));
        double angulo2 = Math.toDegrees(Math.acos((a2 + c2 - b2) * 1.0 / (2.0 * getLadoc() * getLadoa())));
        double angulo3 = Math.toDegrees(Math.acos((c2 + b2 - a2) * 1.0 / (2.0 * getLadob() * getLadoc())));
        System.out.println(angulo1 + " " + angulo2 + " " + angulo3);
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) System.out.println("Triângulo retângulo");
        else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) System.out.println("Triângulo obtusangulo");
        else System.out.println("Triângulo acutângulo");


        return angulo1;
    }

    public Tipo getTipoLado(Triangulo t) {

        if (isTriangulo(t.getLadoa(), t.getLadob(), t.getLadoc()) == false) return null;
        if (t.getLadoa() == t.getLadob() && t.getLadoc() == t.getLadob()) return Tipo.EQUILATERO;
        if (t.getLadoa() != t.getLadob() && t.getLadob() != t.getLadoc() && t.getLadoa() != t.getLadoc())
            return Tipo.ESCALENO;
        return Tipo.ISOSCELES;
    }

    public static boolean isTriangulo(int lado1, int lado2, int lado3) {
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

    public String toString() {
        return "Triângulo";
    }

}
