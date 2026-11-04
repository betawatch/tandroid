package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zn extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ ao c;

    public zn(ao aoVar) {
        this.c = aoVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 1;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.i3.O.size() + 2;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        return i3 <= this.c.i3.O.size() ? 1 : 2;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        ao aoVar = this.c;
        bo boVar = aoVar.i3;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, aoVar.o2);
            n4Var.setText(org.telegram.messenger.bd.M0(2131743654, null));
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.bd.M0(2131743653, null));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) boVar.O.get(i3 - 1);
        ha haVar = (ha) view;
        if (haVar.I) {
            boVar.P = null;
        }
        haVar.a(tL_username, i3 < boVar.O.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        boVar.P = haVar;
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ao aoVar = this.c;
        org.telegram.ui.ActionBar.e6 e6Var = aoVar.o2;
        if (i3 == 0) {
            return new org.telegram.ui.Components.bj0(new org.telegram.ui.Cells.n4(aoVar.getContext(), e6Var));
        }
        if (i3 == 1) {
            return new org.telegram.ui.Components.bj0(new ca(this, aoVar.getContext(), e6Var));
        }
        if (i3 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.bj0(new org.telegram.ui.Cells.y8(12, aoVar.getContext(), e6Var));
    }
}
