package r0;

import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u0 extends v0 {
    public final WindowInsetsAnimation e;

    public u0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, 0L, null);
        this.e = windowInsetsAnimation;
    }

    public static i0.c e(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getUpperBound());
    }

    public static i0.c f(WindowInsetsAnimation.Bounds bounds) {
        return i0.c.c(bounds.getLowerBound());
    }

    public static void g(ViewGroup viewGroup, yg.e eVar) {
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
