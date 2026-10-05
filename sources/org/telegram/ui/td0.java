package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class td0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug0 b;

    public /* synthetic */ td0(ug0 ug0Var, int i10) {
        this.a = i10;
        this.b = ug0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ug0 ug0Var = this.b;
                if (ug0Var.d == animator) {
                    ug0Var.d = null;
                    break;
                }
                break;
            default:
                ug0 ug0Var2 = this.b;
                ug0Var2.c.setVisibility(8);
                if (ug0Var2.d == animator) {
                    ug0Var2.d = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
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
