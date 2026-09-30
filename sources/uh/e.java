package uh;

import android.view.animation.Interpolator;
import w7.q;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
        return z10 ? 1.0f - interpolator.getInterpolation(1.0f - q.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f)) : interpolator.getInterpolation(q.a((f7 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
