package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class vy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy0 b;

    public /* synthetic */ vy0(wy0 wy0Var, int i7) {
        this.a = i7;
        this.b = wy0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                wy0 wy0Var = this.b;
                if (wy0Var.h != null) {
                    wy0Var.h = null;
                    wy0Var.e = 0.0f;
                    wy0Var.g();
                    wy0Var.n.e();
                    zv zvVar = wy0Var.a;
                    if (zvVar != null) {
                        zvVar.onPause();
                        wy0Var.a.onFragmentDestroy();
                        wy0Var.removeAllViews();
                        wy0Var.a = null;
                        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
                    }
                    wy0Var.d(false);
                    break;
                }
                break;
            default:
                wy0 wy0Var2 = this.b;
                if (wy0Var2.h != null) {
                    wy0Var2.h = null;
                    wy0Var2.d(true);
                    break;
                }
                break;
        }
    }
}
