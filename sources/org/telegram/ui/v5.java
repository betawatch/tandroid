package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v5 extends rg.b {
    public final /* synthetic */ x5 d;

    public v5(x5 x5Var) {
        this.d = x5Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 1 || i7 == 2 || i7 == 4;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.c.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((w5) this.d.c.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        x5 x5Var = this.d;
        ArrayList arrayList = x5Var.c;
        if (((w5) arrayList.get(i7)).a == 2) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) f1Var.a;
            org.telegram.messenger.t2 t2Var = ((w5) arrayList.get(i7)).c;
            TLObject g22 = x5Var.getMessagesController().g2(t2Var.a);
            String str = null;
            if (g22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) g22;
                str = user.self ? org.telegram.messenger.gd.M0(2131745706, null) : org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
            } else if (g22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) g22).title;
            }
            raVar.setSelfAsSavedMessages(true);
            raVar.d(g22, str, org.telegram.messenger.v2.f(t2Var.b), i7 == arrayList.size() - 1 || ((w5) arrayList.get(i7 + 1)).a == 2);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2 = null;
        if (i7 != 1) {
            if (i7 == 2) {
                View raVar = new org.telegram.ui.Cells.ra(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, raVar, null);
                view2 = raVar;
            } else if (i7 == 3) {
                view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
            } else if (i7 == 4) {
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                n8Var.k(org.telegram.messenger.gd.M0(2131747722, null), false);
                n8Var.g(-1, org.telegram.ui.ActionBar.n6.p7);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n8Var, null);
                view = n8Var;
            }
            return i5.c.q(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
        n8Var2.o(R.drawable.msg_contact_add, org.telegram.messenger.gd.M0(2131747730, null), true);
        n8Var2.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n8Var2, null);
        view = n8Var2;
        view2 = view;
        return i5.c.q(view2, view2, -1, -2);
    }
}
