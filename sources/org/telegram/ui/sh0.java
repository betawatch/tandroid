package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class sh0 implements Runnable {
    public final /* synthetic */ di0 a;

    public sh0(di0 di0Var) {
        this.a = di0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        di0 di0Var = this.a;
        if (di0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < di0Var.b.getChildCount(); i10++) {
            View childAt = di0Var.b.getChildAt(i10);
            if (childAt instanceof ai0) {
                ai0 ai0Var = (ai0) childAt;
                if (ai0Var.I) {
                    ai0Var.b(ai0Var.n, ai0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
