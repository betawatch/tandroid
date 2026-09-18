package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y40 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.voip.u a;
    public final /* synthetic */ k60 b;

    public y40(k60 k60Var, org.telegram.ui.Components.voip.u uVar) {
        this.b = k60Var;
        this.a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
