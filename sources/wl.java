// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wl implements Interpolator {
    public final /* synthetic */ double a;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public wl(double d, double d2, double d3, double d4) {
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
