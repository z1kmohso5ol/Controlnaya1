import java.util.Scanner;

public class controlnaya1_2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a, b, c, p, S;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        p = (a+b+c)/2;
        S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println("Площадь треугольника ="+S);
    }
}
