package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ pq b;

    public y00(pq pqVar) {
        this.b = pqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((i10) this.b.d).h0.unlock();
                break;
            default:
                pq pqVar = this.b;
                View view = pqVar.b;
                view.setAlpha(1.0f);
                f2.x0.x0(view);
                ((i10) pqVar.d).b.removeView(view);
                break;
        }
    }

    public y00(pq pqVar, f2.x0 x0Var) {
        this.b = pqVar;
    }
}
