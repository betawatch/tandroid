package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw0 b;

    public /* synthetic */ tv0(aw0 aw0Var, int i10) {
        this.a = i10;
        this.b = aw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.R.setTranslationY(0.0f);
                break;
            case 1:
                this.b.R.setTranslationY(0.0f);
                break;
            default:
                aw0 aw0Var = this.b;
                aw0Var.getClass();
                aw0Var.R.setTranslationY(0.0f);
                aw0Var.l0();
                break;
        }
    }
}
