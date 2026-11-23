package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ym0 implements org.telegram.ui.Cells.q5 {
    public final /* synthetic */ l4 a;

    public ym0(l4 l4Var) {
        this.a = l4Var;
    }

    public final void a() {
        bn bnVar;
        TLRPC.Chat chat;
        an0 an0Var = (an0) this.a.e;
        if (!an0Var.J || (bnVar = an0Var.V) == null || (chat = bnVar.e) == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled || an0Var.X == 2) {
            return;
        }
        org.telegram.ui.Components.b5.r0(an0Var, org.telegram.messenger.gd.N0(2131745114, null), org.telegram.messenger.gd.N0(2131745107, null), null);
        if (an0Var.X == 1) {
            an0Var.X = 2;
        }
    }

    @Override // org.telegram.ui.Cells.q5
    public final void d(org.telegram.ui.Cells.r5 r5Var) {
        boolean z10;
        int intValue = ((Integer) r5Var.getTag()).intValue();
        an0 an0Var = (an0) this.a.e;
        org.telegram.messenger.ue ueVar = an0Var.K;
        int i7 = -1;
        if (ueVar != null) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.e.get(intValue);
            boolean containsKey = an0Var.b.containsKey(Integer.valueOf(efVar.C));
            z10 = !containsKey;
            if (!containsKey && an0Var.I > 0 && an0Var.b.size() >= an0Var.I) {
                a();
                return;
            }
            if (an0Var.e && !containsKey) {
                i7 = an0Var.c.size();
            }
            r5Var.b(i7, z10, true);
            an0Var.d0(intValue, efVar);
        } else {
            org.telegram.messenger.g0.v1(an0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) an0Var.f.get(intValue);
            boolean containsKey2 = an0Var.b.containsKey(hfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && an0Var.I > 0 && an0Var.b.size() >= an0Var.I) {
                a();
                return;
            }
            if (an0Var.e && !containsKey2) {
                i7 = an0Var.c.size();
            }
            r5Var.b(i7, z10, true);
            an0Var.d0(intValue, hfVar);
        }
        an0Var.n0(z10 ? 1 : 2);
        an0Var.t0.o();
    }
}
