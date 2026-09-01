package r0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
