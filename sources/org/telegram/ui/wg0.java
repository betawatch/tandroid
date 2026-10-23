package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class wg0 implements Runnable {
    public final /* synthetic */ ih0 a;

    public wg0(ih0 ih0Var) {
        this.a = ih0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ih0 ih0Var = this.a;
        if (ih0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < ih0Var.b.getChildCount(); i10++) {
            View childAt = ih0Var.b.getChildAt(i10);
            if (childAt instanceof fh0) {
                fh0 fh0Var = (fh0) childAt;
                if (fh0Var.I) {
                    fh0Var.b(fh0Var.n, fh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
