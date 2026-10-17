package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class wo extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ xo c;

    public wo(xo xoVar) {
        this.c = xoVar;
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
        xo xoVar = this.c;
        yo yoVar = xoVar.Y2;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, xoVar.n2));
            l4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            d9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            d9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(xoVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) yoVar.N.get(i10 - 1);
        ra raVar = (ra) view;
        if (raVar.H) {
            yoVar.O = null;
        }
        raVar.a(tL_username, i10 < yoVar.N.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        yoVar.O = raVar;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        xo xoVar = this.c;
        org.telegram.ui.ActionBar.d6 d6Var = xoVar.n2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.sl0(new org.telegram.ui.Cells.l4(xoVar.getContext(), d6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.sl0(new ka(this, xoVar.getContext(), d6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.sl0(new org.telegram.ui.Cells.d9(xoVar.getContext(), 12, d6Var));
    }
}
