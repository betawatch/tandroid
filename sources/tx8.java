// default package

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tx8 implements Interpolator {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Interpolator d;

    public /* synthetic */ tx8(boolean z, float f, float f2, Interpolator interpolator) {
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
        return z ? 1.0f - interpolator.getInterpolation(1.0f - moe.a(f4, 0.0f, 1.0f)) : interpolator.getInterpolation(moe.a(f4, 0.0f, 1.0f));
    }
}
