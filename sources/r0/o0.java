package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ v0 a;
    public final /* synthetic */ k1 b;
    public final /* synthetic */ k1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public o0(v0 v0Var, k1 k1Var, k1 k1Var2, int i7, View view) {
        this.a = v0Var;
        this.b = k1Var;
        this.c = k1Var2;
        this.d = i7;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.a;
        u0 u0Var = v0Var.a;
        u0Var.d(animatedFraction);
        k1 k1Var = this.b;
        h1 h1Var = k1Var.a;
        float b10 = u0Var.b();
        PathInterpolator pathInterpolator = q0.e;
        int i7 = Build.VERSION.SDK_INT;
        a1 z0Var = i7 >= 34 ? new z0(k1Var) : i7 >= 30 ? new y0(k1Var) : i7 >= 29 ? new x0(k1Var) : new w0(k1Var);
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.d & i10) == 0) {
                z0Var.c(i10, h1Var.f(i10));
            } else {
                i0.b f10 = h1Var.f(i10);
                i0.b f11 = this.c.a.f(i10);
                float f12 = 1.0f - b10;
                z0Var.c(i10, k1.e(f10, (int) (((f10.a - f11.a) * f12) + 0.5d), (int) (((f10.b - f11.b) * f12) + 0.5d), (int) (((f10.c - f11.c) * f12) + 0.5d), (int) (((f10.d - f11.d) * f12) + 0.5d)));
            }
        }
        q0.g(this.e, z0Var.b(), Collections.singletonList(v0Var));
    }
}
