// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class wr2 extends vr2 {
    public double d;
    public double e;
    public double f;
    public double g;

    public final xr2 u(js2 js2Var) {
        double d = this.d;
        r(d >= this.e && d <= this.f, Double.valueOf(d));
        xr2 xr2Var = new xr2(s(), this.d, this.e, this.f, this.g, this.a);
        q(js2Var, xr2Var);
        return xr2Var;
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
