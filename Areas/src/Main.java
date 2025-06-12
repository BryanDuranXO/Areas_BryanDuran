import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int opc = 0;

        System.out.println("Ingresa una opoción: \n 1.-área cuadrado \n 2.-Area triángulo \n3.-Área rectángulo \n4.-Circulo");
        opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("Area de cuadrado");
                System.out.println("Ingresa la medida del lado");
                double l = sc.nextDouble();
                Cuadrado c = new Cuadrado(l);

                System.out.println("El area es: " + c.area(l));
                break;
            case 2:
                System.out.println("Area triángulo");
                System.out.println("Ingresa la base");
                double b = sc.nextDouble();

                System.out.println("Ingresa la altura");
                double a = sc.nextDouble();

                Triangulo t = new Triangulo(b,a);

                System.out.println("El area es: " + t.area(b,a));


                break;
            case 3:
                System.out.println("Area rectangulo:");
                System.out.println("Ingresa la base");
                double ba = sc.nextDouble();

                System.out.println("Ingresa la altura");
                double al = sc.nextDouble();

                Rectangulo r = new Rectangulo(ba,al);

                System.out.println("El area del rectangulo es: " + r.area(ba,al));



                break;

            case 4:
                System.out.println("Area del circulo");
                System.out.println("Ingresa el radio");
                double ra = sc.nextDouble();

                Circulo circulo =new Circulo(ra);

                System.out.println("El area es: " + circulo.area(ra));
                break;


            default:
                System.out.println("No vgalido");
        }

    }
}