package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t71 extends org.telegram.ui.Cells.i0 implements org.telegram.ui.ActionBar.k6 {
    public int e;
    public final /* synthetic */ x71 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t71(x71 x71Var, Context context) {
        super(context);
        this.f = x71Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.Cells.h0 h0Var = this.d;
        if (h0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Jj, false);
            if (x02 != this.e) {
                this.e = x02;
                h0Var.setOuterColor(x02);
                h0Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
