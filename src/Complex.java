public class Complex {
    double re;
    double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public Complex reciprocal(){
        double scale = re*re + im*im;
        return new Complex(re/scale,-im/scale);
    }
}
