package r0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public abstract class u0 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public u0(int i10, long j10, Interpolator interpolator) {
        this.a = i10;
        this.c = interpolator;
        this.d = j10;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
    }

    public int c() {
        return this.a;
    }

    public void d(float f7) {
        this.b = f7;
    }
}
