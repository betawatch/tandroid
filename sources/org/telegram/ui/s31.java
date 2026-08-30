package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t31 b;

    public /* synthetic */ s31(t31 t31Var, int i10) {
        this.a = i10;
        this.b = t31Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t31 t31Var = this.b;
                if (t31Var.h != null) {
                    t31Var.h = null;
                    t31Var.e = 0.0f;
                    t31Var.g();
                    t31Var.n.unlock();
                    qx qxVar = t31Var.a;
                    if (qxVar != null) {
                        qxVar.onPause();
                        t31Var.a.onFragmentDestroy();
                        t31Var.removeAllViews();
                        t31Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    t31Var.d(false);
                    break;
                }
                break;
            default:
                t31 t31Var2 = this.b;
                if (t31Var2.h != null) {
                    t31Var2.h = null;
                    t31Var2.d(true);
                    break;
                }
                break;
        }
    }
}
