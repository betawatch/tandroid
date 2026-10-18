package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class w00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qq b;

    public w00(qq qqVar) {
        this.b = qqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((g10) this.b.d).l0.unlock();
                break;
            default:
                qq qqVar = this.b;
                View view = qqVar.b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((g10) qqVar.d).b.removeView(view);
                break;
        }
    }

    public w00(qq qqVar, s4.n0 n0Var) {
        this.b = qqVar;
    }
}
