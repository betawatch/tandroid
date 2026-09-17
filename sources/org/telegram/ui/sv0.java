package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class sv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zv0 b;

    public /* synthetic */ sv0(zv0 zv0Var, int i10) {
        this.a = i10;
        this.b = zv0Var;
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
                zv0 zv0Var = this.b;
                zv0Var.getClass();
                zv0Var.R.setTranslationY(0.0f);
                zv0Var.l0();
                break;
        }
    }
}
