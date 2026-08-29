package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wo extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ xo c;

    public wo(xo xoVar) {
        this.c = xoVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 1;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.W2.J.size() + 2;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.c.W2.J.size() ? 1 : 2;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        xo xoVar = this.c;
        yo yoVar = xoVar.W2;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, xoVar.l2));
            k4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(xoVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) yoVar.J.get(i10 - 1);
        ia iaVar = (ia) view;
        if (iaVar.D) {
            yoVar.K = null;
        }
        iaVar.a(tL_username, i10 < yoVar.J.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        yoVar.K = iaVar;
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        xo xoVar = this.c;
        org.telegram.ui.ActionBar.c6 c6Var = xoVar.l2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.k4(xoVar.getContext(), c6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.vk0(new ba(this, xoVar.getContext(), c6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.y8(xoVar.getContext(), 12, c6Var));
    }
}
