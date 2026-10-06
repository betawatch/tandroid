package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class n8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ o8 e;

    public n8(o8 o8Var, int i10, int i11, int i12, int i13) {
        this.e = o8Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        o8 o8Var = this.e;
        o8Var.r = d;
        o8Var.s = i0.a.d(1.0f, this.c, this.d);
        o8Var.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{o8Var.r, o8Var.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        o8Var.invalidate();
    }
}
