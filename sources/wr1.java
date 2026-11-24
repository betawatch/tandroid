// default package

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wr1 extends l37 {
    public final /* synthetic */ mu1 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr1(mu1 mu1Var, Context context, mu1 mu1Var2, kl0 kl0Var, o27 o27Var, TLRPC.User user, TLRPC.Chat chat, int i, h37 h37Var, int i2, boolean z) {
        super(context, mu1Var2, kl0Var, o27Var, user, chat, i, h37Var, i2, z);
        this.I = mu1Var;
    }

    @Override // l37
    public final void b() {
        k27 k27Var;
        bu1 bu1Var;
        mu1 mu1Var = this.I;
        bu1 bu1Var2 = mu1Var.D5;
        if (bu1Var2 == null || (k27Var = bu1Var2.a) == null || !((bu1Var = mu1Var.x5.d) == null || bu1Var.a == null || k27Var.e1() == mu1Var.x5.d.a.e1())) {
            mu1Var.D5 = mu1Var.x5.d;
        }
    }

    @Override // l37
    public final void c(boolean z) {
        int i;
        boolean z2;
        m27 m27Var;
        a(false);
        mu1 mu1Var = this.I;
        o27 o27Var = mu1Var.x5;
        if (o27Var != null) {
            if (!z) {
                mu1Var.E5 = true;
            }
            m27 m27Var2 = o27Var.b;
            if (m27Var2 != null) {
                int size = m27Var2.e.size();
                i = 0;
                z2 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    k27 k27Var = (k27) mu1Var.x5.b.e.get(i2);
                    if (k27Var.C4()) {
                        i = 3;
                    } else if (k27Var.S3()) {
                        if (i != 2) {
                            i = k27Var.Y3() ? 2 : 1;
                        }
                    } else if (k27Var.z3()) {
                        z2 = true;
                    }
                    mu1Var.o6[0].put(k27Var.e1(), k27Var);
                }
            } else {
                i = 0;
                z2 = false;
            }
            Bundle j = tb4.j(3, "onlySelect", "dialogsType", true);
            j.putBoolean("quote", !z);
            boolean z3 = (z || (m27Var = mu1Var.x5.a) == null || m27Var.e.isEmpty() || mu1Var.x5.d != null) ? false : true;
            j.putBoolean("reply_to", z3);
            if (z3) {
                mu1Var.Ka(j, (k27) mu1Var.x5.a.e.get(0));
            }
            j.putInt("hasPoll", i);
            j.putBoolean("hasInvoice", z2);
            m27 m27Var3 = mu1Var.x5.b;
            j.putInt("messagesCount", m27Var3 != null ? m27Var3.e.size() : 0);
            j.putBoolean("canSelectTopics", true);
            cj3 cj3Var = new cj3(j);
            cj3Var.E2 = mu1Var;
            mu1Var.presentFragment(cj3Var);
        }
    }
}
