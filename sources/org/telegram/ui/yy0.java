package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class yy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy0 b;

    public /* synthetic */ yy0(zy0 zy0Var, int i7) {
        this.a = i7;
        this.b = zy0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                zy0 zy0Var = this.b;
                if (zy0Var.h != null) {
                    zy0Var.h = null;
                    zy0Var.e = 0.0f;
                    zy0Var.g();
                    zy0Var.n.e();
                    bw bwVar = zy0Var.a;
                    if (bwVar != null) {
                        bwVar.onPause();
                        zy0Var.a.onFragmentDestroy();
                        zy0Var.removeAllViews();
                        zy0Var.a = null;
                        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
                    }
                    zy0Var.d(false);
                    break;
                }
                break;
            default:
                zy0 zy0Var2 = this.b;
                if (zy0Var2.h != null) {
                    zy0Var2.h = null;
                    zy0Var2.d(true);
                    break;
                }
                break;
        }
    }
}
