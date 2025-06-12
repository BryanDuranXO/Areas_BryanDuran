public class Triangulo {
    private double b,a;

    public Triangulo() {
    }

    public Triangulo(double b, double a) {
        this.b = b;
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    public double area(double base,double alt){

        if(base <=0 || alt<=0){
            return  0;
        }

        return  (base*alt)/2;
    }


}
