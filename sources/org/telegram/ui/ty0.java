package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ty0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy0 b;

    public /* synthetic */ ty0(uy0 uy0Var, int i7) {
        this.a = i7;
        this.b = uy0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                uy0 uy0Var = this.b;
                if (uy0Var.h != null) {
                    uy0Var.h = null;
                    uy0Var.e = 0.0f;
                    uy0Var.g();
                    uy0Var.n.e();
                    bw bwVar = uy0Var.a;
                    if (bwVar != null) {
                        bwVar.onPause();
                        uy0Var.a.onFragmentDestroy();
                        uy0Var.removeAllViews();
                        uy0Var.a = null;
                        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.r4, new Object[0]);
                    }
                    uy0Var.d(false);
                    break;
                }
                break;
            default:
                uy0 uy0Var2 = this.b;
                if (uy0Var2.h != null) {
                    uy0Var2.h = null;
                    uy0Var2.d(true);
                    break;
                }
                break;
        }
    }
}
