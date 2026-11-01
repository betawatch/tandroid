package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x91 b;

    public /* synthetic */ w91(x91 x91Var, int i10) {
        this.a = i10;
        this.b = x91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.s.setVisibility(8);
                break;
            default:
                this.b.b.a.setVisibility(8);
                break;
        }
    }
}
