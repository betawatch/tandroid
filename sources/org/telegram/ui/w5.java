package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w5 extends rg.b {
    public final /* synthetic */ y5 d;

    public w5(y5 y5Var) {
        this.d = y5Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 1 || i7 == 2 || i7 == 4;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.c.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return ((x5) this.d.c.get(i7)).a;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        y5 y5Var = this.d;
        ArrayList arrayList = y5Var.c;
        if (((x5) arrayList.get(i7)).a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) e1Var.a;
            org.telegram.messenger.s2 s2Var = ((x5) arrayList.get(i7)).c;
            TLObject e22 = y5Var.getMessagesController().e2(s2Var.a);
            String str = null;
            if (e22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) e22;
                str = user.self ? org.telegram.messenger.hd.M0(2131745901, null) : org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
            } else if (e22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) e22).title;
            }
            paVar.setSelfAsSavedMessages(true);
            paVar.d(e22, str, org.telegram.messenger.u2.f(s2Var.b), i7 == arrayList.size() - 1 || ((x5) arrayList.get(i7 + 1)).a == 2);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2 = null;
        if (i7 != 1) {
            if (i7 == 2) {
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, paVar, null);
                view2 = paVar;
            } else if (i7 == 3) {
                view = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.y0) null);
            } else if (i7 == 4) {
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.k(org.telegram.messenger.hd.M0(2131747915, null), false);
                l8Var.g(-1, org.telegram.ui.ActionBar.j6.p7);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, l8Var, null);
                view = l8Var;
            }
            return i5.c.q(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
        l8Var2.o(R.drawable.msg_contact_add, org.telegram.messenger.hd.M0(2131747923, null), true);
        l8Var2.g(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, l8Var2, null);
        view = l8Var2;
        view2 = view;
        return i5.c.q(view2, view2, -1, -2);
    }
}
