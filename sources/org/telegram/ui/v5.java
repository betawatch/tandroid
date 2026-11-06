package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class v5 extends rg.b {
    public final /* synthetic */ x5 d;

    public v5(x5 x5Var) {
        this.d = x5Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 1 || i7 == 2 || i7 == 4;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.c.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((w5) this.d.c.get(i7)).a;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        x5 x5Var = this.d;
        ArrayList arrayList = x5Var.c;
        if (((w5) arrayList.get(i7)).a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) d1Var.a;
            org.telegram.messenger.s2 s2Var = ((w5) arrayList.get(i7)).c;
            TLObject e22 = x5Var.getMessagesController().e2(s2Var.a);
            String str = null;
            if (e22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) e22;
                str = user.self ? org.telegram.messenger.hd.M0(2131745902, null) : org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
            } else if (e22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) e22).title;
            }
            paVar.setSelfAsSavedMessages(true);
            paVar.d(e22, str, org.telegram.messenger.u2.f(s2Var.b), i7 == arrayList.size() - 1 || ((w5) arrayList.get(i7 + 1)).a == 2);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2 = null;
        if (i7 != 1) {
            if (i7 == 2) {
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, paVar, null);
                view2 = paVar;
            } else if (i7 == 3) {
                view = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
            } else if (i7 == 4) {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var.k(org.telegram.messenger.hd.M0(2131747914, null), false);
                m8Var.g(-1, org.telegram.ui.ActionBar.k6.p7);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, m8Var, null);
                view = m8Var;
            }
            return jg.g.r(view2, view2, -1, -2);
        }
        org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
        m8Var2.o(R.drawable.msg_contact_add, org.telegram.messenger.hd.M0(2131747922, null), true);
        m8Var2.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, m8Var2, null);
        view = m8Var2;
        view2 = view;
        return jg.g.r(view2, view2, -1, -2);
    }
}
