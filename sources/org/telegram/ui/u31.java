package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v31 b;

    public /* synthetic */ u31(v31 v31Var, int i10) {
        this.a = i10;
        this.b = v31Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v31 v31Var = this.b;
                if (v31Var.h != null) {
                    v31Var.h = null;
                    v31Var.e = 0.0f;
                    v31Var.g();
                    v31Var.n.unlock();
                    rx rxVar = v31Var.a;
                    if (rxVar != null) {
                        rxVar.onPause();
                        v31Var.a.onFragmentDestroy();
                        v31Var.removeAllViews();
                        v31Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    v31Var.d(false);
                    break;
                }
                break;
            default:
                v31 v31Var2 = this.b;
                if (v31Var2.h != null) {
                    v31Var2.h = null;
                    v31Var2.d(true);
                    break;
                }
                break;
        }
    }
}
