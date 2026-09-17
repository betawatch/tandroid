package r0;

import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class t0 extends u0 {
    public final WindowInsetsAnimation e;

    public t0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, 0L, null);
        this.e = windowInsetsAnimation;
    }

    public static i0.c e(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getUpperBound());
    }

    public static i0.c f(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getLowerBound());
    }

    public static void g(ViewGroup viewGroup, qh.e eVar) {
        viewGroup.setWindowInsetsAnimationCallback(new s0(eVar));
    }

    @Override // r0.u0
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // r0.u0
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // r0.u0
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // r0.u0
    public final void d(float f7) {
        this.e.setFraction(f7);
    }
}
