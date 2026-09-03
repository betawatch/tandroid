package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a41 b;

    public /* synthetic */ z31(a41 a41Var, int i10) {
        this.a = i10;
        this.b = a41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a41 a41Var = this.b;
                if (a41Var.h != null) {
                    a41Var.h = null;
                    a41Var.e = 0.0f;
                    a41Var.g();
                    a41Var.n.unlock();
                    rx rxVar = a41Var.a;
                    if (rxVar != null) {
                        rxVar.onPause();
                        a41Var.a.onFragmentDestroy();
                        a41Var.removeAllViews();
                        a41Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    a41Var.d(false);
                    break;
                }
                break;
            default:
                a41 a41Var2 = this.b;
                if (a41Var2.h != null) {
                    a41Var2.h = null;
                    a41Var2.d(true);
                    break;
                }
                break;
        }
    }
}
