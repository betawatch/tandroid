package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class xy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy0 b;

    public /* synthetic */ xy0(yy0 yy0Var, int i7) {
        this.a = i7;
        this.b = yy0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                yy0 yy0Var = this.b;
                if (yy0Var.h != null) {
                    yy0Var.h = null;
                    yy0Var.e = 0.0f;
                    yy0Var.g();
                    yy0Var.n.e();
                    ew ewVar = yy0Var.a;
                    if (ewVar != null) {
                        ewVar.onPause();
                        yy0Var.a.onFragmentDestroy();
                        yy0Var.removeAllViews();
                        yy0Var.a = null;
                        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.u4, new Object[0]);
                    }
                    yy0Var.d(false);
                    break;
                }
                break;
            default:
                yy0 yy0Var2 = this.b;
                if (yy0Var2.h != null) {
                    yy0Var2.h = null;
                    yy0Var2.d(true);
                    break;
                }
                break;
        }
    }
}
