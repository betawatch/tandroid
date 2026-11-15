package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xm0 implements org.telegram.ui.Cells.p5 {
    public final /* synthetic */ l4 a;

    public xm0(l4 l4Var) {
        this.a = l4Var;
    }

    public final void a() {
        an anVar;
        TLRPC.Chat chat;
        zm0 zm0Var = (zm0) this.a.e;
        if (!zm0Var.J || (anVar = zm0Var.V) == null || (chat = anVar.e) == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled || zm0Var.X == 2) {
            return;
        }
        org.telegram.ui.Components.t4.r0(zm0Var, org.telegram.messenger.hd.M0(2131745310, null), org.telegram.messenger.hd.M0(2131745303, null), null);
        if (zm0Var.X == 1) {
            zm0Var.X = 2;
        }
    }

    @Override // org.telegram.ui.Cells.p5
    public final void d(org.telegram.ui.Cells.q5 q5Var) {
        boolean z10;
        int intValue = ((Integer) q5Var.getTag()).intValue();
        zm0 zm0Var = (zm0) this.a.e;
        org.telegram.messenger.ve veVar = zm0Var.K;
        int i7 = -1;
        if (veVar != null) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.e.get(intValue);
            boolean containsKey = zm0Var.b.containsKey(Integer.valueOf(ffVar.C));
            z10 = !containsKey;
            if (!containsKey && zm0Var.I > 0 && zm0Var.b.size() >= zm0Var.I) {
                a();
                return;
            }
            if (zm0Var.e && !containsKey) {
                i7 = zm0Var.c.size();
            }
            q5Var.b(i7, z10, true);
            zm0Var.d0(intValue, ffVar);
        } else {
            org.telegram.messenger.g0.v1(zm0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) zm0Var.f.get(intValue);
            boolean containsKey2 = zm0Var.b.containsKey(jfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && zm0Var.I > 0 && zm0Var.b.size() >= zm0Var.I) {
                a();
                return;
            }
            if (zm0Var.e && !containsKey2) {
                i7 = zm0Var.c.size();
            }
            q5Var.b(i7, z10, true);
            zm0Var.d0(intValue, jfVar);
        }
        zm0Var.n0(z10 ? 1 : 2);
        zm0Var.t0.y();
    }
}
