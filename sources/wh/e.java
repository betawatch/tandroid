package wh;

import android.view.animation.Interpolator;
import c8.l9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Interpolator {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Interpolator d;

    public /* synthetic */ e(boolean z10, float f10, float f11, Interpolator interpolator) {
        this.a = z10;
        this.b = f10;
        this.c = f11;
        this.d = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        boolean z10 = this.a;
        float f11 = this.b;
        float f12 = this.c;
        Interpolator interpolator = this.d;
        return z10 ? 1.0f - interpolator.getInterpolation(1.0f - l9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f)) : interpolator.getInterpolation(l9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
