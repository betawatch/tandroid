// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xn5 extends AnimatorListenerAdapter {
    public final /* synthetic */ hd8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m01 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ w69 e;
    public final /* synthetic */ yn5 f;

    public xn5(yn5 yn5Var, hd8 hd8Var, float f, m01 m01Var, boolean z, w69 w69Var) {
        this.f = yn5Var;
        this.a = hd8Var;
        this.b = f;
        this.c = m01Var;
        this.d = z;
        this.e = w69Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b79 b79Var;
        yn5 yn5Var = this.f;
        yn5Var.x = null;
        dy7 dy7Var = new dy7(new hd8[]{this.a});
        c79 c79Var = yn5Var.a;
        int currentColor = c79Var.getCurrentColor();
        float f = this.b * 1.0f;
        dy7Var.c = currentColor;
        dy7Var.d = f;
        m01 m01Var = this.c;
        dy7Var.e = m01Var;
        m01Var.getClass();
        int currentColor2 = m01Var instanceof i01 ? -1 : c79Var.getCurrentColor();
        gu7 painting = c79Var.getPainting();
        boolean z = this.d;
        painting.c(dy7Var, currentColor2, z, null);
        if (z && (b79Var = c79Var.a) != null) {
            b79Var.P();
        }
        w69 w69Var = this.e;
        if (w69Var != null) {
            w69Var.run();
        }
    }
}
