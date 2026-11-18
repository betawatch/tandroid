package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ v0 a;
    public final /* synthetic */ l1 b;
    public final /* synthetic */ l1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public o0(v0 v0Var, l1 l1Var, l1 l1Var2, int i7, View view) {
        this.a = v0Var;
        this.b = l1Var;
        this.c = l1Var2;
        this.d = i7;
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
        int i7 = Build.VERSION.SDK_INT;
        a1 z0Var = i7 >= 34 ? new z0(l1Var) : i7 >= 30 ? new y0(l1Var) : i7 >= 29 ? new x0(l1Var) : new w0(l1Var);
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.d & i10) == 0) {
                z0Var.c(i10, i1Var.f(i10));
            } else {
                i0.b f10 = i1Var.f(i10);
                i0.b f11 = this.c.a.f(i10);
                float f12 = 1.0f - b10;
                z0Var.c(i10, l1.e(f10, (int) (((f10.a - f11.a) * f12) + 0.5d), (int) (((f10.b - f11.b) * f12) + 0.5d), (int) (((f10.c - f11.c) * f12) + 0.5d), (int) (((f10.d - f11.d) * f12) + 0.5d)));
            }
        }
        q0.g(this.e, z0Var.b(), Collections.singletonList(v0Var));
    }
}
