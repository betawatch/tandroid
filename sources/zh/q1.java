package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class q1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ q1(a3 a3Var, int i10) {
        this.a = i10;
        this.b = a3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v1 v1Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                a3Var.t3 = 0.0f;
                a3Var.r3.setAlpha(1.0f);
                a3Var.r3.setVisibility(8);
                a3Var.r3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                a3 a3Var2 = this.b;
                a3Var2.N2.unlock();
                a3Var2.H2 = a3Var2.o2;
                t1 t1Var = a3Var2.b2;
                if (t1Var != null && (runnable = t1Var.w) != null) {
                    runnable.run();
                    t1Var.w = null;
                }
                if (a3Var2.K1 && !a3Var2.v2) {
                    u7 u7Var = ((l7) a3Var2.Q1).d;
                    if (u7Var.x) {
                        u7Var.x = false;
                        u7Var.P();
                    }
                }
                if (!a3Var2.v2 && (v1Var = a3Var2.d3) != null) {
                    v1Var.setVisibility(8);
                }
                a3Var2.V2 = true;
                a3Var2.invalidate();
                break;
        }
    }
}
