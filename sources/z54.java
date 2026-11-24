// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z54 {
    public final double a;
    public double b;
    public double c;

    public z54(double d) {
        this.a = d != 0.0d ? Math.exp((-0.6931471805599453d) / d) : 0.0d;
    }

    public final double a() {
        double d = this.a;
        if (d != 0.0d) {
            double pow = 1.0d - Math.pow(d, this.c);
            if (pow != 0.0d) {
                return this.b / pow;
            }
        }
        return this.b;
    }

    public final void b(double d, double d2) {
        double pow = Math.pow(this.a, d);
        this.b = (pow * this.b) + ((1.0d - pow) * d2);
        this.c += d;
    }
}
