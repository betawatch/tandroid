package r0;

import android.view.WindowInsetsAnimation;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class t0 extends u0 {
    public final WindowInsetsAnimation e;

    public t0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, 0L, null);
        this.e = windowInsetsAnimation;
    }

    public static i0.b e(WindowInsetsAnimation.Bounds bounds) {
        return i0.b.c(bounds.getUpperBound());
    }

    public static i0.b f(WindowInsetsAnimation.Bounds bounds) {
        return i0.b.c(bounds.getLowerBound());
    }

    public static void g(FrameLayout frameLayout, rh.d dVar) {
        frameLayout.setWindowInsetsAnimationCallback(new s0(dVar));
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
    public final void d(float f10) {
        this.e.setFraction(f10);
    }
}
