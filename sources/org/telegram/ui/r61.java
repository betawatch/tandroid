package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r61 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ s61 f;

    public r61(s61 s61Var, boolean z4, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f = s61Var;
        this.a = z4;
        this.b = runnable;
        this.c = zArr;
        this.d = z10;
        this.e = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        s61 s61Var = this.f;
        l0 l0Var = s61Var.s;
        boolean z4 = this.a;
        float f10 = z4 ? 1.0f : 0.0f;
        s61Var.F = f10;
        AndroidUtilities.lerp(s61Var.c, s61Var.d, f10, s61Var.e);
        l0Var.invalidate();
        if (!z4) {
            s61Var.v.setAlpha(s61Var.F);
        }
        if (s61Var.F < 0.5f && !z4 && (runnable = this.b) != null) {
            boolean[] zArr = this.c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z4) {
            if (this.d) {
                s61Var.a.b = false;
                s61Var.M.e0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        s61Var.H = null;
        l0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
