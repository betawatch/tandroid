package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.voip.r b;
    public final /* synthetic */ b50 c;

    public /* synthetic */ t30(b50 b50Var, org.telegram.ui.Components.voip.r rVar, int i10) {
        this.a = i10;
        this.c = b50Var;
        this.b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.voip.r rVar = this.b;
                if (rVar.getParent() != null) {
                    this.c.b.removeView(rVar);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.voip.r rVar2 = this.b;
                if (rVar2.getParent() != null) {
                    this.c.b.removeView(rVar2);
                    break;
                }
                break;
        }
    }
}
