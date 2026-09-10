package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ v0 a;
    public final /* synthetic */ l1 b;
    public final /* synthetic */ l1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public o0(v0 v0Var, l1 l1Var, l1 l1Var2, int i10, View view) {
        this.a = v0Var;
        this.b = l1Var;
        this.c = l1Var2;
        this.d = i10;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.a;
        u0 u0Var = v0Var.a;
        u0Var.d(animatedFraction);
        l1 l1Var = this.b;
        i1 i1Var = l1Var.a;
        float b10 = u0Var.b();
        PathInterpolator pathInterpolator = q0.e;
        int i10 = Build.VERSION.SDK_INT;
        b1 a1Var = i10 >= 34 ? new a1(l1Var) : i10 >= 30 ? new z0(l1Var) : i10 >= 29 ? new y0(l1Var) : new x0(l1Var);
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.d & i11) == 0) {
                a1Var.c(i11, i1Var.f(i11));
            } else {
                i0.c f7 = i1Var.f(i11);
                i0.c f10 = this.c.a.f(i11);
                float f11 = 1.0f - b10;
                a1Var.c(i11, l1.e(f7, (int) (((f7.a - f10.a) * f11) + 0.5d), (int) (((f7.b - f10.b) * f11) + 0.5d), (int) (((f7.c - f10.c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        q0.g(this.e, a1Var.b(), Collections.singletonList(v0Var));
    }
}
