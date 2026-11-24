// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wk implements Interpolator {
    public final /* synthetic */ double a;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public wk(double d, double d2, double d3, double d4) {
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
