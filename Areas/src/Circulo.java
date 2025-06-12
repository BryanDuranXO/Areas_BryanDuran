public class Circulo {
    double r;


    public Circulo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circulo() {
    }

    public double area(double radio){
        if(radio<=0){
            return 0;
        }

        return (3.1416 * (r*r));
    }
}
