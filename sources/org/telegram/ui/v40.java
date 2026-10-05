package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class v40 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.voip.u a;
    public final /* synthetic */ h60 b;

    public v40(h60 h60Var, org.telegram.ui.Components.voip.u uVar) {
        this.b = h60Var;
        this.a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
