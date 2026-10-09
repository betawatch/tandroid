package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ v0 a;
    public final /* synthetic */ k1 b;
    public final /* synthetic */ k1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public o0(v0 v0Var, k1 k1Var, k1 k1Var2, int i10, View view) {
        this.a = v0Var;
        this.b = k1Var;
        this.c = k1Var2;
        this.d = i10;
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
        int i10 = Build.VERSION.SDK_INT;
        a1 z0Var = i10 >= 34 ? new z0(k1Var) : i10 >= 30 ? new y0(k1Var) : i10 >= 29 ? new x0(k1Var) : new w0(k1Var);
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.d & i11) == 0) {
                z0Var.c(i11, h1Var.f(i11));
            } else {
                i0.b f7 = h1Var.f(i11);
                i0.b f10 = this.c.a.f(i11);
                float f11 = 1.0f - b10;
                z0Var.c(i11, k1.e(f7, (int) (((f7.a - f10.a) * f11) + 0.5d), (int) (((f7.b - f10.b) * f11) + 0.5d), (int) (((f7.c - f10.c) * f11) + 0.5d), (int) (((f7.d - f10.d) * f11) + 0.5d)));
            }
        }
        q0.g(this.e, z0Var.b(), Collections.singletonList(v0Var));
    }
}
