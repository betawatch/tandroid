package vh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ q7(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o8 o8Var = this.b;
                o8Var.j2 = null;
                o8Var.r.setTranslationY(0.0f);
                o8Var.r.b(0.0f);
                break;
            case 1:
                o8 o8Var2 = this.b;
                o8Var2.n.removeView(o8Var2.M0);
                o8Var2.M0 = null;
                o8Var2.n2 = null;
                o8Var2.p2 = null;
                o8Var2.c1.L.b(o8Var2.f0 != 1);
                break;
            default:
                o8 o8Var3 = this.b;
                y7 y7Var = o8Var3.C2;
                if (y7Var != null) {
                    if (y7Var.getParent() != null) {
                        ((ViewGroup) o8Var3.C2.getParent()).removeView(o8Var3.C2);
                    }
                    o8Var3.C2 = null;
                }
                o8Var3.E2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
