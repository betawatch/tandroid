package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yg0 implements Runnable {
    public final /* synthetic */ jh0 a;

    public yg0(jh0 jh0Var) {
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
