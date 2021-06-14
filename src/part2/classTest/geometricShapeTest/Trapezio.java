package part2.classTest.geometricShapeTest;

public class Trapezio extends MasterShape {

    private double b;
    private double B;
    private double h;
    private double l1;
    private double l2;
    private double l3;
    private double l4;

    public Trapezio(double b,double B,double h,double l1,double l2,double l3,double l4){
        setb(b);
        setB(B);
        setH(h);
        setL1(l1);
        setL2(l2);
        setL3(l3);
        setL4(l4);
    }

    @Override
    public double computeArea() {
        area = (B+b)*h/2;
        return area;
    }

    @Override
    public double computePerimeter() {
        perimeter = l1+l2+l3+l4;
        return perimeter;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public double getL4() {
        return l4;
    }

    public void setL4(double l4) {
        this.l4 = l4;
    }

    public double getb() {
        return b;
    }

    public void setb(double b) {
        this.b = b;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

}
