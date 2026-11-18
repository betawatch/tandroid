package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ve0 implements Runnable {
    public final /* synthetic */ gf0 a;

    public ve0(gf0 gf0Var) {
        this.a = gf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gf0 gf0Var = this.a;
        if (gf0Var.b == null) {
            return;
        }
        for (int i7 = 0; i7 < gf0Var.b.getChildCount(); i7++) {
            View childAt = gf0Var.b.getChildAt(i7);
            if (childAt instanceof df0) {
                df0 df0Var = (df0) childAt;
                if (df0Var.J) {
                    df0Var.b(df0Var.n, df0Var.r);
                }
            }
        }
        org.telegram.messenger.g0.h3(this, 500L);
    }
}
