package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s40 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.voip.t a;
    public final /* synthetic */ e60 b;

    public s40(e60 e60Var, org.telegram.ui.Components.voip.t tVar) {
        this.b = e60Var;
        this.a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
