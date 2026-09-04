package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class r3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ r3(t3 t3Var, int i10) {
        this.a = i10;
        this.b = t3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.d0 = false;
                break;
            case 1:
                this.b.d0 = false;
                break;
            case 2:
                this.b.N.setVisibility(4);
                break;
            case 3:
                t3 t3Var = this.b;
                t3Var.s0 = t3Var.r0;
                t3Var.d(t3Var.U);
                break;
            default:
                t3 t3Var2 = this.b;
                t3Var2.t0 = 1.0f;
                t3Var2.b.setScaleX(1.0f);
                t3Var2.b.setScaleY(t3Var2.t0);
                t3Var2.invalidate();
                break;
        }
    }
}
