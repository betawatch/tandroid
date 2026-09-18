package r0;

import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class u0 extends v0 {
    public final WindowInsetsAnimation e;

    public u0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, 0L, null);
        this.e = windowInsetsAnimation;
    }

    public static i0.b e(WindowInsetsAnimation.Bounds bounds) {
        return i0.b.c(bounds.getUpperBound());
    }

    public static i0.b f(WindowInsetsAnimation.Bounds bounds) {
        return i0.b.c(bounds.getLowerBound());
    }

    public static void g(ViewGroup viewGroup, ph.e eVar) {
        viewGroup.setWindowInsetsAnimationCallback(new t0(eVar));
    }

    @Override // r0.v0
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // r0.v0
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // r0.v0
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // r0.v0
    public final void d(float f7) {
        this.e.setFraction(f7);
    }
}
