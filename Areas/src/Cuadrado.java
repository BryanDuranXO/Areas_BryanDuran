public class Cuadrado {
    private double l;


    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public Cuadrado(double l) {
        this.l = l;
    }

    public Cuadrado() {
    }

    public double area(double lado){
        if(lado <=0){
            return 0;
        }

        return lado*lado;
    }
}
