// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qm9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rm9 b;

    public /* synthetic */ qm9(rm9 rm9Var, byte b) {
        this.a = b;
        this.b = rm9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rm9 rm9Var = this.b;
        switch (b) {
            case 0:
                if (rm9Var.h != null) {
                    rm9Var.h = null;
                    rm9Var.e = 0.0f;
                    rm9Var.g();
                    rm9Var.n.e();
                    si3 si3Var = rm9Var.a;
                    if (si3Var != null) {
                        si3Var.onPause();
                        rm9Var.a.onFragmentDestroy();
                        rm9Var.removeAllViews();
                        rm9Var.a = null;
                        jn7.e().k(jn7.u4, new Object[0]);
                    }
                    rm9Var.d(false);
                    break;
                }
                break;
            default:
                if (rm9Var.h != null) {
                    rm9Var.h = null;
                    rm9Var.d(true);
                    break;
                }
                break;
        }
    }
}
