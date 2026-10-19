package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class uo extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ vo c;

    public uo(vo voVar) {
        this.c = voVar;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.Y2.N.size() + 2;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.c.Y2.N.size() ? 1 : 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        vo voVar = this.c;
        wo woVar = voVar.Y2;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, voVar.n2));
            l4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            d9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            d9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(voVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) woVar.N.get(i10 - 1);
        pa paVar = (pa) view;
        if (paVar.H) {
            woVar.O = null;
        }
        paVar.a(tL_username, i10 < woVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        woVar.O = paVar;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        vo voVar = this.c;
        org.telegram.ui.ActionBar.d6 d6Var = voVar.n2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.sl0(new org.telegram.ui.Cells.l4(voVar.getContext(), d6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.sl0(new ia(this, voVar.getContext(), d6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.sl0(new org.telegram.ui.Cells.d9(voVar.getContext(), 12, d6Var));
    }
}
