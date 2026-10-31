package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ r1(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v1 v1Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                z2Var.c3 = 0.0f;
                z2Var.a3.setAlpha(1.0f);
                z2Var.a3.setVisibility(8);
                z2Var.a3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                z2 z2Var2 = this.b;
                z2Var2.w2.e();
                z2Var2.q2 = z2Var2.X1;
                t1 t1Var = z2Var2.K1;
                if (t1Var != null && (runnable = t1Var.x) != null) {
                    runnable.run();
                    t1Var.x = null;
                }
                if (z2Var2.t1 && !z2Var2.e2) {
                    o7 o7Var = ((f7) z2Var2.z1).d;
                    if (o7Var.y) {
                        o7Var.y = false;
                        o7Var.d0();
                    }
                }
                if (!z2Var2.e2 && (v1Var = z2Var2.M2) != null) {
                    v1Var.setVisibility(8);
                }
                z2Var2.E2 = true;
                z2Var2.invalidate();
                break;
        }
    }
}
