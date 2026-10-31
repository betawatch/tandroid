package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zf0 implements Runnable {
    public final /* synthetic */ kg0 a;

    public zf0(kg0 kg0Var) {
        this.a = kg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kg0 kg0Var = this.a;
        if (kg0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < kg0Var.b.getChildCount(); i10++) {
            View childAt = kg0Var.b.getChildAt(i10);
            if (childAt instanceof hg0) {
                hg0 hg0Var = (hg0) childAt;
                if (hg0Var.I) {
                    hg0Var.b(hg0Var.n, hg0Var.r);
                }
            }
        }
        org.telegram.messenger.i0.h3(this, 500L);
    }
}
