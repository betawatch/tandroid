package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xf0 implements Runnable {
    public final /* synthetic */ ig0 a;

    public xf0(ig0 ig0Var) {
        this.a = ig0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ig0 ig0Var = this.a;
        if (ig0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < ig0Var.b.getChildCount(); i10++) {
            View childAt = ig0Var.b.getChildAt(i10);
            if (childAt instanceof fg0) {
                fg0 fg0Var = (fg0) childAt;
                if (fg0Var.I) {
                    fg0Var.b(fg0Var.n, fg0Var.r);
                }
            }
        }
        org.telegram.messenger.i0.h3(this, 500L);
    }
}
