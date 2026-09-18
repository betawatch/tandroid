package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class m8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ n8 e;

    public m8(n8 n8Var, int i10, int i11, int i12, int i13) {
        this.e = n8Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        n8 n8Var = this.e;
        n8Var.r = d;
        n8Var.s = i0.a.d(1.0f, this.c, this.d);
        n8Var.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{n8Var.r, n8Var.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        n8Var.invalidate();
    }
}
