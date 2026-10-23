package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
