package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wg0 implements Runnable {
    public final /* synthetic */ hh0 a;

    public wg0(hh0 hh0Var) {
        this.a = hh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hh0 hh0Var = this.a;
        if (hh0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < hh0Var.b.getChildCount(); i10++) {
            View childAt = hh0Var.b.getChildAt(i10);
            if (childAt instanceof eh0) {
                eh0 eh0Var = (eh0) childAt;
                if (eh0Var.E) {
                    eh0Var.b(eh0Var.n, eh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
