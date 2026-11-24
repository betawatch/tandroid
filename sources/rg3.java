// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rg3 implements Interpolator {
    public final /* synthetic */ byte a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        byte b = this.a;
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
