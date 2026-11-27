// default package

import android.view.WindowInsetsAnimation;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class u1d extends v1d {
    public final WindowInsetsAnimation e;

    public u1d(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static mq5 e(WindowInsetsAnimation.Bounds bounds) {
        return mq5.c(bounds.getUpperBound());
    }

    public static mq5 f(WindowInsetsAnimation.Bounds bounds) {
        return mq5.c(bounds.getLowerBound());
    }

    public static void g(FrameLayout frameLayout, j1d j1dVar) {
        frameLayout.setWindowInsetsAnimationCallback(new t1d(j1dVar));
    }

    @Override // v1d
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // v1d
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // v1d
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // v1d
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
