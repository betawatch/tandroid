package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xm0 implements org.telegram.ui.Cells.p5 {
    public final /* synthetic */ l4 a;

    public xm0(l4 l4Var) {
        this.a = l4Var;
    }

    public final void a() {
        cn cnVar;
        TLRPC.Chat chat;
        zm0 zm0Var = (zm0) this.a.e;
        if (!zm0Var.I || (cnVar = zm0Var.U) == null || (chat = cnVar.e) == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled || zm0Var.W == 2) {
            return;
        }
        org.telegram.ui.Components.v4.r0(zm0Var, org.telegram.messenger.id.M0(2131745310, null), org.telegram.messenger.id.M0(2131745303, null), null);
        if (zm0Var.W == 1) {
            zm0Var.W = 2;
        }
    }

    @Override // org.telegram.ui.Cells.p5
    public final void d(org.telegram.ui.Cells.q5 q5Var) {
        boolean z9;
        int intValue = ((Integer) q5Var.getTag()).intValue();
        zm0 zm0Var = (zm0) this.a.e;
        org.telegram.messenger.we weVar = zm0Var.J;
        int i7 = -1;
        if (weVar != null) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.e.get(intValue);
            boolean containsKey = zm0Var.b.containsKey(Integer.valueOf(gfVar.C));
            z9 = !containsKey;
            if (!containsKey && zm0Var.H > 0 && zm0Var.b.size() >= zm0Var.H) {
                a();
                return;
            }
            if (zm0Var.e && !containsKey) {
                i7 = zm0Var.c.size();
            }
            q5Var.b(i7, z9, true);
            zm0Var.d0(intValue, gfVar);
        } else {
            org.telegram.messenger.g0.v1(zm0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) zm0Var.f.get(intValue);
            boolean containsKey2 = zm0Var.b.containsKey(kfVar.B);
            z9 = !containsKey2;
            if (!containsKey2 && zm0Var.H > 0 && zm0Var.b.size() >= zm0Var.H) {
                a();
                return;
            }
            if (zm0Var.e && !containsKey2) {
                i7 = zm0Var.c.size();
            }
            q5Var.b(i7, z9, true);
            zm0Var.d0(intValue, kfVar);
        }
        zm0Var.n0(z9 ? 1 : 2);
        zm0Var.s0.A();
    }
}
