package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class k8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ l8 e;

    public k8(l8 l8Var, int i10, int i11, int i12, int i13) {
        this.e = l8Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        l8 l8Var = this.e;
        l8Var.r = d;
        l8Var.s = i0.a.d(1.0f, this.c, this.d);
        l8Var.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{l8Var.r, l8Var.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        l8Var.invalidate();
    }
}
