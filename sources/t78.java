// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t78 implements p68 {
    public final /* synthetic */ s30 a;

    public t78(s30 s30Var) {
        this.a = s30Var;
    }

    public final void a() {
        yv1 yv1Var;
        TLRPC.Chat chat;
        w78 w78Var = (w78) this.a.e;
        if (!w78Var.J || (yv1Var = w78Var.V) == null || (chat = yv1Var.e) == null || sd2.N(chat) || !chat.slowmode_enabled || w78Var.X == 2) {
            return;
        }
        ik.r0(w78Var, jb6.M0(2131745044, null), jb6.M0(2131745037, null), null);
        if (w78Var.X == 1) {
            w78Var.X = (byte) 2;
        }
    }

    @Override // p68
    public final void c(q68 q68Var) {
        boolean z;
        int intValue = ((Integer) q68Var.getTag()).intValue();
        w78 w78Var = (w78) this.a.e;
        yn6 yn6Var = w78Var.K;
        int i = -1;
        if (yn6Var != null) {
            jo6 jo6Var = (jo6) yn6Var.e.get(intValue);
            boolean containsKey = w78Var.b.containsKey(Integer.valueOf(jo6Var.C));
            z = !containsKey;
            if (!containsKey && w78Var.I > 0 && w78Var.b.size() >= w78Var.I) {
                a();
                return;
            }
            if (w78Var.e && !containsKey) {
                i = w78Var.c.size();
            }
            q68Var.b(i, z, true);
            w78Var.b0(intValue, jo6Var);
        } else {
            gm.t1(w78Var.getParentActivity().getCurrentFocus());
            no6 no6Var = (no6) w78Var.f.get(intValue);
            boolean containsKey2 = w78Var.b.containsKey(no6Var.B);
            z = !containsKey2;
            if (!containsKey2 && w78Var.I > 0 && w78Var.b.size() >= w78Var.I) {
                a();
                return;
            }
            if (w78Var.e && !containsKey2) {
                i = w78Var.c.size();
            }
            q68Var.b(i, z, true);
            w78Var.b0(intValue, no6Var);
        }
        w78Var.n0(z ? 1 : 2);
        w78Var.t0.e();
    }
}
