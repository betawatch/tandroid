package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class p0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ w0 a;
    public final /* synthetic */ m1 b;
    public final /* synthetic */ m1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public p0(w0 w0Var, m1 m1Var, m1 m1Var2, int i10, View view) {
        this.a = w0Var;
        this.b = m1Var;
        this.c = m1Var2;
        this.d = i10;
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
        int i10 = Build.VERSION.SDK_INT;
        c1 b1Var = i10 >= 34 ? new b1(m1Var) : i10 >= 30 ? new a1(m1Var) : i10 >= 29 ? new z0(m1Var) : new y0(m1Var);
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.d & i11) == 0) {
                b1Var.c(i11, j1Var.f(i11));
            } else {
                i0.b f10 = j1Var.f(i11);
                i0.b f11 = this.c.a.f(i11);
                float f12 = 1.0f - b10;
                b1Var.c(i11, m1.e(f10, (int) (((f10.a - f11.a) * f12) + 0.5d), (int) (((f10.b - f11.b) * f12) + 0.5d), (int) (((f10.c - f11.c) * f12) + 0.5d), (int) (((f10.d - f11.d) * f12) + 0.5d)));
            }
        }
        r0.g(this.e, b1Var.b(), Collections.singletonList(w0Var));
    }
}
