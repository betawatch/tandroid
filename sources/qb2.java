// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qb2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wb2 b;

    public /* synthetic */ qb2(wb2 wb2Var, byte b) {
        this.a = b;
        this.b = wb2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wb2 wb2Var = this.b;
        switch (b) {
            case 0:
                wb2Var.Q5.O0 = true;
                wb2Var.invalidate();
                break;
            default:
                wb2Var.setSelectedBackgroundProgress(0.0f);
                break;
        }
    }
}
