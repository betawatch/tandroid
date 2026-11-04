package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr0 b;

    public /* synthetic */ yq0(fr0 fr0Var, int i3) {
        this.a = i3;
        this.b = fr0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.S.setTranslationY(0.0f);
                break;
            case 1:
                this.b.S.setTranslationY(0.0f);
                break;
            default:
                fr0 fr0Var = this.b;
                fr0Var.getClass();
                fr0Var.S.setTranslationY(0.0f);
                fr0Var.q0();
                break;
        }
    }
}
