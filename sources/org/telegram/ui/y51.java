package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y51 extends org.telegram.ui.Cells.i0 implements org.telegram.ui.ActionBar.z5 {
    public int e;
    public final /* synthetic */ c61 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(c61 c61Var, Context context) {
        super(context);
        this.f = c61Var;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mj));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.Cells.h0 h0Var = this.d;
        if (h0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Mj, false);
            if (x02 != this.e) {
                this.e = x02;
                h0Var.setOuterColor(x02);
                h0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
