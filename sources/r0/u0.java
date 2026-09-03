package r0;

import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    public static void g(ViewGroup viewGroup, ch.e eVar) {
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
    public final void d(float f10) {
        this.e.setFraction(f10);
    }
}
