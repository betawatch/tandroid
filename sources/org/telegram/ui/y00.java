package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tq b;

    public y00(tq tqVar) {
        this.b = tqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((j10) this.b.d).l0.unlock();
                break;
            default:
                tq tqVar = this.b;
                View view = tqVar.b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((j10) tqVar.d).b.removeView(view);
                break;
        }
    }

    public y00(tq tqVar, s4.p0 p0Var) {
        this.b = tqVar;
    }
}
