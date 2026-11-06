package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class vm0 implements org.telegram.ui.Cells.p5 {
    public final /* synthetic */ l4 a;

    public vm0(l4 l4Var) {
        this.a = l4Var;
    }

    public final void a() {
        an anVar;
        TLRPC.Chat chat;
        xm0 xm0Var = (xm0) this.a.e;
        if (!xm0Var.I || (anVar = xm0Var.U) == null || (chat = anVar.e) == null || org.telegram.messenger.t3.N(chat) || !chat.slowmode_enabled || xm0Var.W == 2) {
            return;
        }
        org.telegram.ui.Components.v4.r0(xm0Var, org.telegram.messenger.hd.M0(2131745311, null), org.telegram.messenger.hd.M0(2131745304, null), null);
        if (xm0Var.W == 1) {
            xm0Var.W = 2;
        }
    }

    @Override // org.telegram.ui.Cells.p5
    public final void d(org.telegram.ui.Cells.q5 q5Var) {
        boolean z9;
        int intValue = ((Integer) q5Var.getTag()).intValue();
        xm0 xm0Var = (xm0) this.a.e;
        org.telegram.messenger.we weVar = xm0Var.J;
        int i7 = -1;
        if (weVar != null) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.e.get(intValue);
            boolean containsKey = xm0Var.b.containsKey(Integer.valueOf(gfVar.C));
            z9 = !containsKey;
            if (!containsKey && xm0Var.H > 0 && xm0Var.b.size() >= xm0Var.H) {
                a();
                return;
            }
            if (xm0Var.e && !containsKey) {
                i7 = xm0Var.c.size();
            }
            q5Var.b(i7, z9, true);
            xm0Var.d0(intValue, gfVar);
        } else {
            org.telegram.messenger.g0.v1(xm0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) xm0Var.f.get(intValue);
            boolean containsKey2 = xm0Var.b.containsKey(kfVar.B);
            z9 = !containsKey2;
            if (!containsKey2 && xm0Var.H > 0 && xm0Var.b.size() >= xm0Var.H) {
                a();
                return;
            }
            if (xm0Var.e && !containsKey2) {
                i7 = xm0Var.c.size();
            }
            q5Var.b(i7, z9, true);
            xm0Var.d0(intValue, kfVar);
        }
        xm0Var.n0(z9 ? 1 : 2);
        xm0Var.s0.A();
    }
}
