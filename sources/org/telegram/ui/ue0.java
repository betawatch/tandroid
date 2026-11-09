package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ue0 implements Runnable {
    public final /* synthetic */ ef0 a;

    public ue0(ef0 ef0Var) {
        this.a = ef0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ef0 ef0Var = this.a;
        if (ef0Var.b == null) {
            return;
        }
        for (int i7 = 0; i7 < ef0Var.b.getChildCount(); i7++) {
            View childAt = ef0Var.b.getChildAt(i7);
            if (childAt instanceof bf0) {
                bf0 bf0Var = (bf0) childAt;
                if (bf0Var.I) {
                    bf0Var.b(bf0Var.n, bf0Var.r);
                }
            }
        }
        org.telegram.messenger.g0.i3(this, 500L);
    }
}
