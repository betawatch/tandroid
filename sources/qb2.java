// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
