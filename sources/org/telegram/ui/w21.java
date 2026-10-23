package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class w21 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x21 b;

    public /* synthetic */ w21(x21 x21Var, int i10) {
        this.a = i10;
        this.b = x21Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x21 x21Var = this.b;
                if (x21Var.h != null) {
                    x21Var.h = null;
                    x21Var.e = 0.0f;
                    x21Var.g();
                    x21Var.n.unlock();
                    dx dxVar = x21Var.a;
                    if (dxVar != null) {
                        dxVar.onPause();
                        x21Var.a.onFragmentDestroy();
                        x21Var.removeAllViews();
                        x21Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    x21Var.d(false);
                    break;
                }
                break;
            default:
                x21 x21Var2 = this.b;
                if (x21Var2.h != null) {
                    x21Var2.h = null;
                    x21Var2.d(true);
                    break;
                }
                break;
        }
    }
}
