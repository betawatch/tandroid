package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yo extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ zo c;

    public yo(zo zoVar) {
        this.c = zoVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.i3.N.size() + 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.c.i3.N.size() ? 1 : 2;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        zo zoVar = this.c;
        ap apVar = zoVar.i3;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, zoVar.n2);
            q4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.i9) view).setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) apVar.N.get(i10 - 1);
        qa qaVar = (qa) view;
        if (qaVar.H) {
            apVar.O = null;
        }
        qaVar.a(tL_username, i10 < apVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        apVar.O = qaVar;
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        zo zoVar = this.c;
        org.telegram.ui.ActionBar.u6 u6Var = zoVar.n2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.vl0(new org.telegram.ui.Cells.q4(zoVar.getContext(), u6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.vl0(new ja(this, zoVar.getContext(), u6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.vl0(new org.telegram.ui.Cells.i9(zoVar.getContext(), 12, u6Var));
    }
}
