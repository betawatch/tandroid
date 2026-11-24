// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uz8 implements Interpolator {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Interpolator d;

    public /* synthetic */ uz8(boolean z, float f, float f2, Interpolator interpolator) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        boolean z = this.a;
        float f2 = this.b;
        float f3 = this.c;
        Interpolator interpolator = this.d;
        float f4 = (f - f2) / (f3 - f2);
        return z ? 1.0f - interpolator.getInterpolation(1.0f - pqe.a(f4, 0.0f, 1.0f)) : interpolator.getInterpolation(pqe.a(f4, 0.0f, 1.0f));
    }
}
