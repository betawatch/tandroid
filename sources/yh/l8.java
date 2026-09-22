package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class l8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ m8 e;

    public l8(m8 m8Var, int i10, int i11, int i12, int i13) {
        this.e = m8Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        m8 m8Var = this.e;
        m8Var.r = d;
        m8Var.s = i0.a.d(1.0f, this.c, this.d);
        m8Var.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{m8Var.r, m8Var.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        m8Var.invalidate();
    }
}
