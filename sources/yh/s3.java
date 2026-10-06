package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class s3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;

    public /* synthetic */ s3(v3 v3Var, int i10) {
        this.a = i10;
        this.b = v3Var;
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
                v3 v3Var = this.b;
                v3Var.s0 = v3Var.r0;
                v3Var.d(v3Var.U);
                break;
            default:
                v3 v3Var2 = this.b;
                v3Var2.t0 = 1.0f;
                v3Var2.b.setScaleX(1.0f);
                v3Var2.b.setScaleY(v3Var2.t0);
                v3Var2.invalidate();
                break;
        }
    }
}
