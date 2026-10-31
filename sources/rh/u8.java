package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ v8 e;

    public u8(v8 v8Var, int i10, int i11, int i12, int i13) {
        this.e = v8Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.b.f(1.0f, this.a, this.b);
        v8 v8Var = this.e;
        v8Var.r = f7;
        v8Var.s = i0.b.f(1.0f, this.c, this.d);
        v8Var.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{v8Var.r, v8Var.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        v8Var.invalidate();
    }
}
