public class Triangulo {

    private double ladoa, ladob, ladoc;

    public enum Tipo {EQUILATERO, ISOSCELES, ESCALENO, RETANGULO, ACUTANGULO, OBTUSANGULO}

    ;

    public Triangulo(double ladoa, double ladob, double ladoc) {
        if (ladoa <= 0) ladoa = 3;
        else this.ladoa = ladoa;
        if (ladob <= 0) ladob = 4;
        else this.ladob = ladob;
        if (ladoc <= 0) ladoc = 5;
        else this.ladoc = ladoc;
    }

    public double getLadoa() {
        return ladoa;
    }

    public double getLadob() {
        return ladob;
    }

    public double getLadoc() {
        return ladoc;
    }

    public Tipo getTipoAngulo() {

        if (isTriangulo(getLadoa(), getLadob(), getLadoc()) == false) return null;

        double a2 = getLadoa() * getLadoa();
        double b2 = getLadob() * getLadob();
        double c2 = getLadoc() * getLadoc();

        double angulo1 = Math.toDegrees(Math.acos((a2 + b2 - c2) * 1.0 / (2.0 * getLadob() * getLadoa())));
        double angulo2 = Math.toDegrees(Math.acos((a2 + c2 - b2) * 1.0 / (2.0 * getLadoc() * getLadoa())));
        double angulo3 = Math.toDegrees(Math.acos((c2 + b2 - a2) * 1.0 / (2.0 * getLadob() * getLadoc())));

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) return Tipo.RETANGULO;
        else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) return Tipo.OBTUSANGULO;
        else return Tipo.ACUTANGULO;
    }

    public Tipo getTipoLado() {
        if (isTriangulo(getLadoa(), getLadob(), getLadoc()) == false) return null;
        if (getLadoa() == getLadob() && getLadoc() == getLadob()) return Tipo.EQUILATERO;
        if (getLadoa() != getLadob() && getLadob() != getLadoc() && getLadoa() != getLadoc())
            return Tipo.ESCALENO;
        return Tipo.ISOSCELES;
    }

    public static boolean isTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 > (lado2 + lado3)) {
            return false;
        } else if (lado2 > (lado1 + lado3)) {
            return false;
        } else if (lado3 > (lado1 + lado2)) {
            return false;
        } else return true;
    }

    public String toString() {
        if (isTriangulo(ladoa, ladob, ladoc))
            return " O triângulo de lados " + ladoa + ", " + ladob + ", " + ladoc + ", " + "é dos tipos: " + getTipoLado() + " e " + getTipoAngulo() + ".";
        else return "Os lados informados não formam um triângulo.";
    }

}
