package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ m91 c;

    public /* synthetic */ x81(m91 m91Var, boolean z10, int i3) {
        this.a = i3;
        this.c = m91Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i3;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                m91 m91Var = this.c;
                m91Var.W0(f10);
                if (!z10) {
                    Activity parentActivity = m91Var.getParentActivity();
                    i3 = ((org.telegram.ui.ActionBar.d2) m91Var).classGuid;
                    org.telegram.messenger.g0.l3(parentActivity, i3);
                    m91Var.s0.setVisibility(8);
                    m91Var.U0(true);
                    break;
                } else {
                    m91Var.r0.setVisibility(8);
                    break;
                }
            default:
                if (!this.b) {
                    this.c.p0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
