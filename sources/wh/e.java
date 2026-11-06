package wh;

import android.view.animation.Interpolator;
import c8.j9;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Interpolator {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Interpolator d;

    public /* synthetic */ e(boolean z9, float f10, float f11, Interpolator interpolator) {
        this.a = z9;
        this.b = f10;
        this.c = f11;
        this.d = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        boolean z9 = this.a;
        float f11 = this.b;
        float f12 = this.c;
        Interpolator interpolator = this.d;
        return z9 ? 1.0f - interpolator.getInterpolation(1.0f - j9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f)) : interpolator.getInterpolation(j9.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
