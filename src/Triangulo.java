public class Triangulo {

    private double ladoa, ladob, ladoc;

    public enum Tipo {EQUILATERO, ISOSCELES, ESCALENO, RETANGULO, ACUTANGULO, OBTUSANGULO}

    public Triangulo(double ladoa, double ladob, double ladoc) {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
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

        if (isTriangulo() == false) return null;

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
        if (isTriangulo() == false) return null;
        if (getLadoa() == getLadob() && getLadoc() == getLadob()) return Tipo.EQUILATERO;
        if (getLadoa() != getLadob() && getLadob() != getLadoc() && getLadoa() != getLadoc()) return Tipo.ESCALENO;
        return Tipo.ISOSCELES;
    }

    public boolean isTriangulo() {
        if (ladoa <= 0 || ladob <= 0 || ladoc <= 0) return false;
        if (ladoa > (ladob + ladoc)) {
            return false;
        } else if (ladob > (ladoa + ladoc)) {
            return false;
        } else if (ladoc > (ladoa + ladob)) {
            return false;
        } else return true;
    }

    public String toString() {
        if (isTriangulo())
            return " O triângulo de lados " + ladoa + ", " + ladob + ", " + ladoc + ", " + "é dos tipos: " + getTipoLado() + " e " + getTipoAngulo() + ".";
        else return "Os lados informados não formam um triângulo.";
    }

}
