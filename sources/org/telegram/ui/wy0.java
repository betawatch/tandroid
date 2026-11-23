package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xy0 b;

    public /* synthetic */ wy0(xy0 xy0Var, int i7) {
        this.a = i7;
        this.b = xy0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                xy0 xy0Var = this.b;
                if (xy0Var.h != null) {
                    xy0Var.h = null;
                    xy0Var.e = 0.0f;
                    xy0Var.g();
                    xy0Var.n.e();
                    dw dwVar = xy0Var.a;
                    if (dwVar != null) {
                        dwVar.onPause();
                        xy0Var.a.onFragmentDestroy();
                        xy0Var.removeAllViews();
                        xy0Var.a = null;
                        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.u4, new Object[0]);
                    }
                    xy0Var.d(false);
                    break;
                }
                break;
            default:
                xy0 xy0Var2 = this.b;
                if (xy0Var2.h != null) {
                    xy0Var2.h = null;
                    xy0Var2.d(true);
                    break;
                }
                break;
        }
    }
}
