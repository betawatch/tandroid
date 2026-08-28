package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ nq b;

    public v00(nq nqVar) {
        this.b = nqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((f10) this.b.d).h0.unlock();
                break;
            default:
                nq nqVar = this.b;
                View view = nqVar.b;
                view.setAlpha(1.0f);
                f2.z0.x0(view);
                ((f10) nqVar.d).b.removeView(view);
                break;
        }
    }

    public v00(nq nqVar, f2.z0 z0Var) {
        this.b = nqVar;
    }
}
