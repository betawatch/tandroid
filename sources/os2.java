// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class os2 extends ns2 {
    public double d;
    public double e;
    public double f;
    public double g;

    public final ps2 u(bt2 bt2Var) {
        double d = this.d;
        r(d >= this.e && d <= this.f, Double.valueOf(d));
        ps2 ps2Var = new ps2(s(), this.d, this.e, this.f, this.g, this.a);
        q(bt2Var, ps2Var);
        return ps2Var;
    }

    public final void v(double d) {
        if (d >= 0.0d) {
            this.g = d;
        } else {
            throw new IllegalArgumentException("precision " + d);
        }
    }

    public final void w() {
        this.e = 0.0d;
        this.f = Double.MAX_VALUE;
    }
}
