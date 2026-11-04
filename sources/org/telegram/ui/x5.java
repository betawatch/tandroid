package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x5 extends sg.b {
    public final /* synthetic */ z5 d;

    public x5(z5 z5Var) {
        this.d = z5Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 1 || i3 == 2 || i3 == 4;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.c.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((y5) this.d.c.get(i3)).a;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        z5 z5Var = this.d;
        ArrayList arrayList = z5Var.c;
        if (((y5) arrayList.get(i3)).a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) d1Var.a;
            org.telegram.messenger.s2 s2Var = ((y5) arrayList.get(i3)).c;
            TLObject e22 = z5Var.getMessagesController().e2(s2Var.a);
            String str = null;
            if (e22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) e22;
                str = user.self ? org.telegram.messenger.bd.M0(2131745911, null) : org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
            } else if (e22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) e22).title;
            }
            paVar.setSelfAsSavedMessages(true);
            paVar.d(e22, str, org.telegram.messenger.u2.f(s2Var.b), i3 == arrayList.size() - 1 || ((y5) arrayList.get(i3 + 1)).a == 2);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2 = null;
        if (i3 != 1) {
            if (i3 == 2) {
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, paVar, null);
                view2 = paVar;
            } else if (i3 == 3) {
                view = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
            } else if (i3 == 4) {
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.k(org.telegram.messenger.bd.M0(2131747923, null), false);
                l8Var.g(-1, org.telegram.ui.ActionBar.k6.p7);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var, null);
                view = l8Var;
            }
            return k2.p1.p(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
        l8Var2.o(R.drawable.msg_contact_add, org.telegram.messenger.bd.M0(2131747931, null), true);
        l8Var2.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var2, null);
        view = l8Var2;
        view2 = view;
        return k2.p1.p(view2, view2, -1, -2);
    }
}
