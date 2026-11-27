// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xk implements Interpolator {
    public final /* synthetic */ double a;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public xk(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double exp;
        double d = this.a;
        double d2 = this.d;
        double d3 = this.b;
        if (d < 1.0d) {
            double exp2 = Math.exp((-f) * d * d3);
            double d4 = this.c * f;
            exp = ((Math.sin(d4) * d2) + (Math.cos(d4) * 1.0d)) * exp2;
        } else {
            exp = Math.exp((-f) * d3) * ((d2 * f) + 1.0d);
        }
        return (float) (1.0d - exp);
    }
}
