package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qm0 implements org.telegram.ui.Cells.p5 {
    public final /* synthetic */ n4 a;

    public qm0(n4 n4Var) {
        this.a = n4Var;
    }

    public final void a() {
        wm wmVar;
        TLRPC.Chat chat;
        sm0 sm0Var = (sm0) this.a.e;
        if (!sm0Var.J || (wmVar = sm0Var.V) == null || (chat = wmVar.e) == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled || sm0Var.X == 2) {
            return;
        }
        org.telegram.ui.Components.t4.t0(sm0Var, org.telegram.messenger.bd.M0(2131745320, null), org.telegram.messenger.bd.M0(2131745313, null), null);
        if (sm0Var.X == 1) {
            sm0Var.X = 2;
        }
    }

    @Override // org.telegram.ui.Cells.p5
    public final void c(org.telegram.ui.Cells.q5 q5Var) {
        boolean z10;
        int intValue = ((Integer) q5Var.getTag()).intValue();
        sm0 sm0Var = (sm0) this.a.e;
        org.telegram.messenger.pe peVar = sm0Var.K;
        int i3 = -1;
        if (peVar != null) {
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) peVar.e.get(intValue);
            boolean containsKey = sm0Var.b.containsKey(Integer.valueOf(yeVar.C));
            z10 = !containsKey;
            if (!containsKey && sm0Var.I > 0 && sm0Var.b.size() >= sm0Var.I) {
                a();
                return;
            }
            if (sm0Var.e && !containsKey) {
                i3 = sm0Var.c.size();
            }
            q5Var.b(i3, z10, true);
            sm0Var.d0(intValue, yeVar);
        } else {
            org.telegram.messenger.g0.v1(sm0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) sm0Var.f.get(intValue);
            boolean containsKey2 = sm0Var.b.containsKey(bfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && sm0Var.I > 0 && sm0Var.b.size() >= sm0Var.I) {
                a();
                return;
            }
            if (sm0Var.e && !containsKey2) {
                i3 = sm0Var.c.size();
            }
            q5Var.b(i3, z10, true);
            sm0Var.d0(intValue, bfVar);
        }
        sm0Var.n0(z10 ? 1 : 2);
        sm0Var.t0.m();
    }
}
