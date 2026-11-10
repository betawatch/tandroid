package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ az0 b;

    public /* synthetic */ zy0(az0 az0Var, int i7) {
        this.a = i7;
        this.b = az0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                az0 az0Var = this.b;
                if (az0Var.h != null) {
                    az0Var.h = null;
                    az0Var.e = 0.0f;
                    az0Var.g();
                    az0Var.n.e();
                    cw cwVar = az0Var.a;
                    if (cwVar != null) {
                        cwVar.onPause();
                        az0Var.a.onFragmentDestroy();
                        az0Var.removeAllViews();
                        az0Var.a = null;
                        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
                    }
                    az0Var.d(false);
                    break;
                }
                break;
            default:
                az0 az0Var2 = this.b;
                if (az0Var2.h != null) {
                    az0Var2.h = null;
                    az0Var2.d(true);
                    break;
                }
                break;
        }
    }
}
