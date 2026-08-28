package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        for (int i9 = 0; i9 < hh0Var.b.getChildCount(); i9++) {
            View childAt = hh0Var.b.getChildAt(i9);
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
