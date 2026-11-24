// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pc6 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mf6 b;

    public /* synthetic */ pc6(mf6 mf6Var, byte b) {
        this.a = b;
        this.b = mf6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        mf6 mf6Var = this.b;
        switch (b) {
            case 0:
                if (mf6Var.d == animator) {
                    mf6Var.d = null;
                    break;
                }
                break;
            default:
                mf6Var.c.setVisibility(8);
                if (mf6Var.d == animator) {
                    mf6Var.d = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
