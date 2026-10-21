package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class u00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ oq b;

    public u00(oq oqVar) {
        this.b = oqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((e10) this.b.d).l0.unlock();
                break;
            default:
                oq oqVar = this.b;
                View view = oqVar.b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((e10) oqVar.d).b.removeView(view);
                break;
        }
    }

    public u00(oq oqVar, s4.n0 n0Var) {
        this.b = oqVar;
    }
}
