package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class yg0 implements Runnable {
    public final /* synthetic */ kh0 a;

    public yg0(kh0 kh0Var) {
        this.a = kh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kh0 kh0Var = this.a;
        if (kh0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < kh0Var.b.getChildCount(); i10++) {
            View childAt = kh0Var.b.getChildAt(i10);
            if (childAt instanceof hh0) {
                hh0 hh0Var = (hh0) childAt;
                if (hh0Var.I) {
                    hh0Var.b(hh0Var.n, hh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
