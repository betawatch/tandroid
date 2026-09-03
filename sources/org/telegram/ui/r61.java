package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r61 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ t61 f;

    public r61(t61 t61Var, boolean z4, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f = t61Var;
        this.a = z4;
        this.b = runnable;
        this.c = zArr;
        this.d = z10;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        t61 t61Var = this.f;
        n0 n0Var = t61Var.s;
        boolean z4 = this.a;
        float f10 = z4 ? 1.0f : 0.0f;
        t61Var.F = f10;
        AndroidUtilities.lerp(t61Var.c, t61Var.d, f10, t61Var.e);
        n0Var.invalidate();
        if (!z4) {
            t61Var.v.setAlpha(t61Var.F);
        }
        if (t61Var.F < 0.5f && !z4 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z4) {
            if (this.d) {
                t61Var.a.b = false;
                t61Var.M.e0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        t61Var.H = null;
        n0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
