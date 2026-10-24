package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class wo extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ xo c;

    public wo(xo xoVar) {
        this.c = xoVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.b3.O.size() + 2;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.c.b3.O.size() ? 1 : 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        xo xoVar = this.c;
        yo yoVar = xoVar.b3;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, xoVar.n2);
            l4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7, xoVar.getContext(), e9Var, null);
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) yoVar.O.get(i10 - 1);
        pa paVar = (pa) view;
        if (paVar.H) {
            yoVar.P = null;
        }
        paVar.a(tL_username, i10 < yoVar.O.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        yoVar.P = paVar;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        xo xoVar = this.c;
        org.telegram.ui.ActionBar.g6 g6Var = xoVar.n2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.l4(xoVar.getContext(), g6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.wl0(new ia(this, xoVar.getContext(), g6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.e9(xoVar.getContext(), 12, g6Var));
    }
}
