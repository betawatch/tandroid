package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ve0 implements Runnable {
    public final /* synthetic */ ff0 a;

    public ve0(ff0 ff0Var) {
        this.a = ff0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ff0 ff0Var = this.a;
        if (ff0Var.b == null) {
            return;
        }
        for (int i7 = 0; i7 < ff0Var.b.getChildCount(); i7++) {
            View childAt = ff0Var.b.getChildAt(i7);
            if (childAt instanceof cf0) {
                cf0 cf0Var = (cf0) childAt;
                if (cf0Var.J) {
                    cf0Var.b(cf0Var.n, cf0Var.r);
                }
            }
        }
        org.telegram.messenger.g0.h3(this, 500L);
    }
}
