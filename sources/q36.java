// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class q36 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r36 b;
    public final /* synthetic */ s36 c;

    public /* synthetic */ q36(s36 s36Var, r36 r36Var, byte b) {
        this.a = b;
        this.c = s36Var;
        this.b = r36Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s36 s36Var = this.c;
        r36 r36Var = this.b;
        switch (b) {
            case 0:
                r36Var.f = null;
                s36Var.a();
                break;
            default:
                r36Var.f = null;
                s36Var.a();
                break;
        }
    }
}
