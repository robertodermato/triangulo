public class AppTriangulo {

    public static void main (String args[]){

        Triangulo t1 = new Triangulo(3, 4, 5);
        Triangulo t2 = new Triangulo(3, 5, 4);
        Triangulo t3 = new Triangulo(4, 3, 5);
        Triangulo t4 = new Triangulo(4, 5, 3);
        Triangulo t5 = new Triangulo(5, 3, 4);
        Triangulo t6 = new Triangulo(7, 4, 4);

        double x = t6.getTipoAngulo();

        System.out.println(x);


    }
}
