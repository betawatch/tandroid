// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class q38 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a58 b;

    public /* synthetic */ q38(a58 a58Var, byte b) {
        this.a = b;
        this.b = a58Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v38 v38Var;
        Runnable runnable;
        byte b = this.a;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                a58Var.j3 = 0.0f;
                a58Var.h3.setAlpha(1.0f);
                a58Var.h3.setVisibility(8);
                a58Var.h3.k();
                break;
            default:
                super.onAnimationEnd(animator);
                a58Var.D2.e();
                a58Var.x2 = a58Var.e2;
                t38 t38Var = a58Var.R1;
                if (t38Var != null && (runnable = t38Var.x) != null) {
                    runnable.run();
                    t38Var.x = null;
                }
                if (a58Var.A1 && !a58Var.l2) {
                    oab oabVar = ((fab) a58Var.G1).d;
                    if (oabVar.y) {
                        oabVar.y = false;
                        oabVar.U();
                    }
                }
                if (!a58Var.l2 && (v38Var = a58Var.T2) != null) {
                    v38Var.setVisibility(8);
                }
                a58Var.L2 = true;
                a58Var.invalidate();
                break;
        }
    }
}
