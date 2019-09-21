import java.awt.Point;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.Math.acos;

public class teste {
    // Java Code to find all three angles
// of a triangle given coordinate
// of all three vertices




        // returns square of distance b/w two points
        static int lengthSquare(Point p1, Point p2)
        {
            int xDiff = p1.x- p2.x;
            int yDiff = p1.y- p2.y;
            return xDiff*xDiff + yDiff*yDiff;
        }

        static void printAngle(Point A, Point B,
                               Point C)
        {
            // Square of lengths be a2, b2, c2
            int a2 = lengthSquare(B,C);
            int b2 = lengthSquare(A,C);
            int c2 = lengthSquare(A,B);

            a2 = 16;
            b2 = 9;
            c2 = 9;

            // length of sides be a, b, c
            float a = (float) 4.0;
            float b = (float) 3.0;
            float c = (float) 3.0;

            // From Cosine law
            float alpha = (float) acos((b2 + c2 - a2)/(2*b*c));
            float betta = (float) acos((a2 + c2 - b2)/(2*a*c));
            float gamma = (float) acos((a2 + b2 - c2)/(2*a*b));

            // Converting to degree
            alpha = (float) (alpha * 180 / PI);
            betta = (float) (betta * 180 / PI);
            gamma = (float) (gamma * 180 / PI);

            // printing all the angles
            System.out.println("alpha : " + alpha);
            System.out.println("betta : " + betta);
            System.out.println("gamma : " + gamma);
        }

        // Driver method
        public static void main(String[] args)
        {
            Point A = new Point(0,0);
            Point B = new Point(0,1);
            Point C = new Point(1,0);

            printAngle(A,B,C);
        }
    }

