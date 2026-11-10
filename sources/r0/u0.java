package r0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class u0 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public u0(int i7, long j3, Interpolator interpolator) {
        this.a = i7;
        this.c = interpolator;
        this.d = j3;
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

    public void d(float f10) {
        this.b = f10;
    }
}
