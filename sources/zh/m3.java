package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class m3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public /* synthetic */ m3(o3 o3Var, int i10) {
        this.a = i10;
        this.b = o3Var;
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
                o3 o3Var = this.b;
                o3Var.s0 = o3Var.r0;
                o3Var.d(o3Var.U);
                break;
            default:
                o3 o3Var2 = this.b;
                o3Var2.t0 = 1.0f;
                o3Var2.b.setScaleX(1.0f);
                o3Var2.b.setScaleY(o3Var2.t0);
                o3Var2.invalidate();
                break;
        }
    }
}
