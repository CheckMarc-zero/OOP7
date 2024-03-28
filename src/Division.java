public class Division implements Operations{

    @Override
    public Complex calculate( Complex a, Complex b) {
        b.reciprocal();
        double real = a.re*b.re - a.im* b.im;
        double imag = a.re* b.im + a.im*b.re;
        Complex c = new Complex(real,imag);
        return c;

    }
}
