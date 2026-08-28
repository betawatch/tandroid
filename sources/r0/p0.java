package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ w0 a;
    public final /* synthetic */ m1 b;
    public final /* synthetic */ m1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public p0(w0 w0Var, m1 m1Var, m1 m1Var2, int i9, View view) {
        this.a = w0Var;
        this.b = m1Var;
        this.c = m1Var2;
        this.d = i9;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w0 w0Var = this.a;
        v0 v0Var = w0Var.a;
        v0Var.d(animatedFraction);
        m1 m1Var = this.b;
        j1 j1Var = m1Var.a;
        float b10 = v0Var.b();
        PathInterpolator pathInterpolator = r0.e;
        int i9 = Build.VERSION.SDK_INT;
        c1 b1Var = i9 >= 34 ? new b1(m1Var) : i9 >= 30 ? new a1(m1Var) : i9 >= 29 ? new z0(m1Var) : new y0(m1Var);
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.d & i10) == 0) {
                b1Var.c(i10, j1Var.f(i10));
            } else {
                i0.b f10 = j1Var.f(i10);
                i0.b f11 = this.c.a.f(i10);
                float f12 = 1.0f - b10;
                b1Var.c(i10, m1.e(f10, (int) (((f10.a - f11.a) * f12) + 0.5d), (int) (((f10.b - f11.b) * f12) + 0.5d), (int) (((f10.c - f11.c) * f12) + 0.5d), (int) (((f10.d - f11.d) * f12) + 0.5d)));
            }
        }
        r0.g(this.e, b1Var.b(), Collections.singletonList(w0Var));
    }
}
