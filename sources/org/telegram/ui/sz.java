package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class sz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yp b;

    public sz(yp ypVar) {
        this.b = ypVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((c00) this.b.d).m0.e();
                break;
            default:
                yp ypVar = this.b;
                View view = ypVar.b;
                view.setAlpha(1.0f);
                v4.p0.x0(view);
                ((c00) ypVar.d).b.removeView(view);
                break;
        }
    }

    public sz(yp ypVar, v4.p0 p0Var) {
        this.b = ypVar;
    }
}
