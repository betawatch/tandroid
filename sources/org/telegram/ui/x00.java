package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ pq b;

    public x00(pq pqVar) {
        this.b = pqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((h10) this.b.d).h0.unlock();
                break;
            default:
                pq pqVar = this.b;
                View view = pqVar.b;
                view.setAlpha(1.0f);
                f2.w0.x0(view);
                ((h10) pqVar.d).b.removeView(view);
                break;
        }
    }

    public x00(pq pqVar, f2.w0 w0Var) {
        this.b = pqVar;
    }
}
