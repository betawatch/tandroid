package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v5 extends hg.c {
    public final /* synthetic */ x5 d;

    public v5(x5 x5Var) {
        this.d = x5Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.c.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((w5) this.d.c.get(i10)).a;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        x5 x5Var = this.d;
        ArrayList arrayList = x5Var.c;
        if (((w5) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) c1Var.a;
            org.telegram.messenger.w2 w2Var = ((w5) arrayList.get(i10)).c;
            TLObject d22 = x5Var.getMessagesController().d2(w2Var.a);
            String str = null;
            if (d22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) d22;
                str = user.self ? org.telegram.messenger.cd.L0(2131745918, null) : org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
            } else if (d22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) d22).title;
            }
            paVar.setSelfAsSavedMessages(true);
            paVar.d(d22, str, org.telegram.messenger.y2.f(w2Var.b), i10 == arrayList.size() - 1 || ((w5) arrayList.get(i10 + 1)).a == 2);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, paVar, null);
                view2 = paVar;
            } else if (i10 == 3) {
                view = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
            } else if (i10 == 4) {
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var.k(org.telegram.messenger.cd.L0(2131747931, null), false);
                p8Var.g(-1, org.telegram.ui.ActionBar.t6.p7);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var, null);
                view = p8Var;
            }
            return sc.e.o(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
        p8Var2.o(R.drawable.msg_contact_add, org.telegram.messenger.cd.L0(2131747939, null), true);
        p8Var2.g(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var2, null);
        view = p8Var2;
        view2 = view;
        return sc.e.o(view2, view2, -1, -2);
    }
}
