package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class p0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ w0 a;
    public final /* synthetic */ l1 b;
    public final /* synthetic */ l1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public p0(w0 w0Var, l1 l1Var, l1 l1Var2, int i10, View view) {
        this.a = w0Var;
        this.b = l1Var;
        this.c = l1Var2;
        this.d = i10;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        w0 w0Var = this.a;
        v0 v0Var = w0Var.a;
        v0Var.d(animatedFraction);
        l1 l1Var = this.b;
        i1 i1Var = l1Var.a;
        float b10 = v0Var.b();
        PathInterpolator pathInterpolator = r0.e;
        int i10 = Build.VERSION.SDK_INT;
        b1 a1Var = i10 >= 34 ? new a1(l1Var) : i10 >= 30 ? new z0(l1Var) : i10 >= 29 ? new y0(l1Var) : new x0(l1Var);
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.d & i11) == 0) {
                a1Var.c(i11, i1Var.f(i11));
            } else {
                i0.b f7 = i1Var.f(i11);
                i0.b f10 = this.c.a.f(i11);
                float f11 = 1.0f - b10;
                a1Var.c(i11, l1.e(f7, (int) (((f7.a - f10.a) * f11) + 0.5d), (int) (((f7.b - f10.b) * f11) + 0.5d), (int) (((f7.c - f10.c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        r0.g(this.e, a1Var.b(), Collections.singletonList(w0Var));
    }
}
