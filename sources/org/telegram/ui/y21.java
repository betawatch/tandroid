package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class y21 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z21 b;

    public /* synthetic */ y21(z21 z21Var, int i10) {
        this.a = i10;
        this.b = z21Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z21 z21Var = this.b;
                if (z21Var.h != null) {
                    z21Var.h = null;
                    z21Var.e = 0.0f;
                    z21Var.g();
                    z21Var.n.unlock();
                    fx fxVar = z21Var.a;
                    if (fxVar != null) {
                        fxVar.onPause();
                        z21Var.a.onFragmentDestroy();
                        z21Var.removeAllViews();
                        z21Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    z21Var.d(false);
                    break;
                }
                break;
            default:
                z21 z21Var2 = this.b;
                if (z21Var2.h != null) {
                    z21Var2.h = null;
                    z21Var2.d(true);
                    break;
                }
                break;
        }
    }
}
