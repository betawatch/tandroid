package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;

    public /* synthetic */ h7(x6 x6Var, int i10) {
        this.a = i10;
        this.b = x6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                o7 o7Var = this.b.b;
                i5 i5Var = o7Var.u1;
                if (i5Var != null) {
                    i5Var.b();
                    o7Var.w.removeView(o7Var.u1);
                }
                o7Var.u1 = null;
                o7Var.d0();
                break;
            default:
                super.onAnimationEnd(animator);
                i5 i5Var2 = this.b.b.u1;
                if (i5Var2 != null) {
                    i5Var2.a(true);
                    break;
                }
                break;
        }
    }
}
