package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;

    public /* synthetic */ a7(c7 c7Var, int i10) {
        this.a = i10;
        this.b = c7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o7 o7Var = this.b.r0;
                o7Var.X = 0.0f;
                o7.w(o7Var);
                break;
            default:
                o7 o7Var2 = this.b.r0;
                o7Var2.W = 0.0f;
                o7Var2.Z = 0.0f;
                o7.w(o7Var2);
                break;
        }
    }
}
