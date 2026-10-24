package r0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
