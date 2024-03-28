public class Addition implements Operations{


    @Override
    public Complex calculate( Complex a, Complex b) {
        double real = a.re + b.re;
        double imag = a.im + b.im;
        Complex c = new Complex(real,imag);
        return c;
    }


}
