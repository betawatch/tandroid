package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class th0 implements Runnable {
    public final /* synthetic */ ei0 a;

    public th0(ei0 ei0Var) {
        this.a = ei0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ei0 ei0Var = this.a;
        if (ei0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < ei0Var.b.getChildCount(); i10++) {
            View childAt = ei0Var.b.getChildAt(i10);
            if (childAt instanceof bi0) {
                bi0 bi0Var = (bi0) childAt;
                if (bi0Var.I) {
                    bi0Var.b(bi0Var.n, bi0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
