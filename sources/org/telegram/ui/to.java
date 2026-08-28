package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class to extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ uo c;

    public to(uo uoVar) {
        this.c = uoVar;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 1;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.W2.J.size() + 2;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        return i9 <= this.c.W2.J.size() ? 1 : 2;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        uo uoVar = this.c;
        vo voVar = uoVar.W2;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, uoVar.l2));
            m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(uoVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) voVar.J.get(i9 - 1);
        ja jaVar = (ja) view;
        if (jaVar.D) {
            voVar.K = null;
        }
        jaVar.a(tL_username, i9 < voVar.J.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        voVar.K = jaVar;
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        uo uoVar = this.c;
        org.telegram.ui.ActionBar.b6 b6Var = uoVar.l2;
        if (i9 == 0) {
            return new org.telegram.ui.Components.ik0(new org.telegram.ui.Cells.m4(uoVar.getContext(), b6Var));
        }
        if (i9 == 1) {
            return new org.telegram.ui.Components.ik0(new ca(this, uoVar.getContext(), b6Var));
        }
        if (i9 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.ik0(new org.telegram.ui.Cells.b9(uoVar.getContext(), 12, b6Var));
    }
}
