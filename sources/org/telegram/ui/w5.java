package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w5 extends rg.b {
    public final /* synthetic */ y5 d;

    public w5(y5 y5Var) {
        this.d = y5Var;
    }

    @Override // org.telegram.ui.Components.dk0
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
        return ((x5) this.d.c.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        y5 y5Var = this.d;
        ArrayList arrayList = y5Var.c;
        if (((x5) arrayList.get(i7)).a == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) f1Var.a;
            org.telegram.messenger.t2 t2Var = ((x5) arrayList.get(i7)).c;
            TLObject g22 = y5Var.getMessagesController().g2(t2Var.a);
            String str = null;
            if (g22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) g22;
                str = user.self ? org.telegram.messenger.gd.N0(2131745705, null) : org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
            } else if (g22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) g22).title;
            }
            saVar.setSelfAsSavedMessages(true);
            saVar.d(g22, str, org.telegram.messenger.v2.f(t2Var.b), i7 == arrayList.size() - 1 || ((x5) arrayList.get(i7 + 1)).a == 2);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2 = null;
        if (i7 != 1) {
            if (i7 == 2) {
                View saVar = new org.telegram.ui.Cells.sa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, saVar, null);
                view2 = saVar;
            } else if (i7 == 3) {
                view = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
            } else if (i7 == 4) {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var.k(org.telegram.messenger.gd.N0(2131747721, null), false);
                m8Var.g(-1, org.telegram.ui.ActionBar.n6.p7);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, m8Var, null);
                view = m8Var;
            }
            return i5.c.q(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
        m8Var2.o(R.drawable.msg_contact_add, org.telegram.messenger.gd.N0(2131747729, null), true);
        m8Var2.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, m8Var2, null);
        view = m8Var2;
        view2 = view;
        return i5.c.q(view2, view2, -1, -2);
    }
}
