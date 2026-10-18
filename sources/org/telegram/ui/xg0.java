package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class xg0 implements Runnable {
    public final /* synthetic */ jh0 a;

    public xg0(jh0 jh0Var) {
        this.a = jh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jh0 jh0Var = this.a;
        if (jh0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < jh0Var.b.getChildCount(); i10++) {
            View childAt = jh0Var.b.getChildAt(i10);
            if (childAt instanceof gh0) {
                gh0 gh0Var = (gh0) childAt;
                if (gh0Var.I) {
                    gh0Var.b(gh0Var.n, gh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
