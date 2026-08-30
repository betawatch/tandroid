package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fv0 b;

    public /* synthetic */ yu0(fv0 fv0Var, int i10) {
        this.a = i10;
        this.b = fv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.O.setTranslationY(0.0f);
                break;
            case 1:
                this.b.O.setTranslationY(0.0f);
                break;
            default:
                fv0 fv0Var = this.b;
                fv0Var.getClass();
                fv0Var.O.setTranslationY(0.0f);
                fv0Var.l0();
                break;
        }
    }
}
