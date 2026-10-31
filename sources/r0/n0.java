package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ u0 a;
    public final /* synthetic */ j1 b;
    public final /* synthetic */ j1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public n0(u0 u0Var, j1 j1Var, j1 j1Var2, int i10, View view) {
        this.a = u0Var;
        this.b = j1Var;
        this.c = j1Var2;
        this.d = i10;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        u0 u0Var = this.a;
        t0 t0Var = u0Var.a;
        t0Var.d(animatedFraction);
        j1 j1Var = this.b;
        g1 g1Var = j1Var.a;
        float b10 = t0Var.b();
        PathInterpolator pathInterpolator = p0.e;
        int i10 = Build.VERSION.SDK_INT;
        z0 y0Var = i10 >= 34 ? new y0(j1Var) : i10 >= 30 ? new x0(j1Var) : i10 >= 29 ? new w0(j1Var) : new v0(j1Var);
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.d & i11) == 0) {
                y0Var.c(i11, g1Var.f(i11));
            } else {
                i0.c f7 = g1Var.f(i11);
                i0.c f10 = this.c.a.f(i11);
                float f11 = 1.0f - b10;
                y0Var.c(i11, j1.e(f7, (int) (((f7.a - f10.a) * f11) + 0.5d), (int) (((f7.b - f10.b) * f11) + 0.5d), (int) (((f7.c - f10.c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        p0.g(this.e, y0Var.b(), Collections.singletonList(u0Var));
    }
}
