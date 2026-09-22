package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
