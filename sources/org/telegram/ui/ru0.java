package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ru0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ yu0 b;

    public /* synthetic */ ru0(yu0 yu0Var, int i10) {
        this.a = i10;
        this.b = yu0Var;
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
                yu0 yu0Var = this.b;
                yu0Var.getClass();
                yu0Var.N.setTranslationY(0.0f);
                yu0Var.l0();
                break;
        }
    }
}
