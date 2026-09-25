package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class v61 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ w61 f;

    public v61(w61 w61Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f = w61Var;
        this.a = z10;
        this.b = runnable;
        this.c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        w61 w61Var = this.f;
        k0 k0Var = w61Var.s;
        boolean z10 = this.a;
        float f7 = z10 ? 1.0f : 0.0f;
        w61Var.I = f7;
        AndroidUtilities.lerp(w61Var.c, w61Var.d, f7, w61Var.e);
        k0Var.invalidate();
        if (!z10) {
            w61Var.v.setAlpha(w61Var.I);
        }
        if (w61Var.I < 0.5f && !z10 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                w61Var.a.b = false;
                w61Var.P.h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        w61Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
