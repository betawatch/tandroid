package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class se0 implements Runnable {
    public final /* synthetic */ cf0 a;

    public se0(cf0 cf0Var) {
        this.a = cf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cf0 cf0Var = this.a;
        if (cf0Var.b == null) {
            return;
        }
        for (int i7 = 0; i7 < cf0Var.b.getChildCount(); i7++) {
            View childAt = cf0Var.b.getChildAt(i7);
            if (childAt instanceof ze0) {
                ze0 ze0Var = (ze0) childAt;
                if (ze0Var.I) {
                    ze0Var.b(ze0Var.n, ze0Var.r);
                }
            }
        }
        org.telegram.messenger.g0.i3(this, 500L);
    }
}
