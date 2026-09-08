package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class w40 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.voip.t a;
    public final /* synthetic */ j60 b;

    public w40(j60 j60Var, org.telegram.ui.Components.voip.t tVar) {
        this.b = j60Var;
        this.a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
