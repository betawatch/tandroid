package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu0 b;

    public /* synthetic */ qu0(xu0 xu0Var, int i9) {
        this.a = i9;
        this.b = xu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.N.setTranslationY(0.0f);
                break;
            case 1:
                this.b.N.setTranslationY(0.0f);
                break;
            default:
                xu0 xu0Var = this.b;
                xu0Var.getClass();
                xu0Var.N.setTranslationY(0.0f);
                xu0Var.k0();
                break;
        }
    }
}
