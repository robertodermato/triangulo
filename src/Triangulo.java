public class Triangulo {

    private int ladoa, ladob, ladoc;
    public enum tipoTriangulo {EQUILATERO, ISOSCELES, ESCALENO, RETANGULO, ACUTANGULO, OBTUSANGULO};
    private String tipoTriangulo;

    public Triangulo (int ladoa, int ladob, int ladoc){
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }

    public int getTipoAngulo(Triangulo t){}

    public int getTipoLado(Triangulo t){}

    public static boolean isTriangulo(int ladoa, int ladob, int ladoc){}

    public String toString(){}

}
