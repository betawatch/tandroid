package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class r40 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.voip.u a;
    public final /* synthetic */ d60 b;

    public r40(d60 d60Var, org.telegram.ui.Components.voip.u uVar) {
        this.b = d60Var;
        this.a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
