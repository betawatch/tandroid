package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                    sx sxVar = a41Var.a;
                    if (sxVar != null) {
                        sxVar.onPause();
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
