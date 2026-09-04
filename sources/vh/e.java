package vh;

import android.view.animation.Interpolator;
import w7.p;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Interpolator {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Interpolator d;

    public /* synthetic */ e(boolean z10, float f7, float f10, Interpolator interpolator) {
        this.a = z10;
        this.b = f7;
        this.c = f10;
        this.d = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        boolean z10 = this.a;
        float f10 = this.b;
        float f11 = this.c;
        Interpolator interpolator = this.d;
        return z10 ? 1.0f - interpolator.getInterpolation(1.0f - p.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f)) : interpolator.getInterpolation(p.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
