package r0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class v0 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public v0(int i10, long j10, Interpolator interpolator) {
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

    public void d(float f10) {
        this.b = f10;
    }
}
