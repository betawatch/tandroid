// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tq4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uq4 b;

    public /* synthetic */ tq4(uq4 uq4Var, byte b) {
        this.a = b;
        this.b = uq4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        uq4 uq4Var = this.b;
        switch (b) {
            case 0:
                jn7.f(uq4Var.r.a).j(uq4Var.f);
                uq4Var.requestLayout();
                break;
            default:
                uq4Var.d = null;
                uq4Var.a = null;
                uq4Var.b = false;
                break;
        }
    }
}
