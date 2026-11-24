// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r58 implements n48 {
    public final /* synthetic */ s20 a;

    public r58(s20 s20Var) {
        this.a = s20Var;
    }

    public final void a() {
        mu1 mu1Var;
        TLRPC.Chat chat;
        u58 u58Var = (u58) this.a.e;
        if (!u58Var.J || (mu1Var = u58Var.V) == null || (chat = mu1Var.e) == null || hc2.N(chat) || !chat.slowmode_enabled || u58Var.X == 2) {
            return;
        }
        ij.r0(u58Var, k96.M0(2131745118, null), k96.M0(2131745111, null), null);
        if (u58Var.X == 1) {
            u58Var.X = (byte) 2;
        }
    }

    @Override // n48
    public final void c(o48 o48Var) {
        boolean z;
        int intValue = ((Integer) o48Var.getTag()).intValue();
        u58 u58Var = (u58) this.a.e;
        xl6 xl6Var = u58Var.K;
        int i = -1;
        if (xl6Var != null) {
            jm6 jm6Var = (jm6) xl6Var.e.get(intValue);
            boolean containsKey = u58Var.b.containsKey(Integer.valueOf(jm6Var.C));
            z = !containsKey;
            if (!containsKey && u58Var.I > 0 && u58Var.b.size() >= u58Var.I) {
                a();
                return;
            }
            if (u58Var.e && !containsKey) {
                i = u58Var.c.size();
            }
            o48Var.b(i, z, true);
            u58Var.a0(intValue, jm6Var);
        } else {
            gl.t1(u58Var.getParentActivity().getCurrentFocus());
            nm6 nm6Var = (nm6) u58Var.f.get(intValue);
            boolean containsKey2 = u58Var.b.containsKey(nm6Var.B);
            z = !containsKey2;
            if (!containsKey2 && u58Var.I > 0 && u58Var.b.size() >= u58Var.I) {
                a();
                return;
            }
            if (u58Var.e && !containsKey2) {
                i = u58Var.c.size();
            }
            o48Var.b(i, z, true);
            u58Var.a0(intValue, nm6Var);
        }
        u58Var.m0(z ? 1 : 2);
        u58Var.t0.e();
    }
}
