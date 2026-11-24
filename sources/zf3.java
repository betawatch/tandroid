// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zf3 extends v4b {
    public final /* synthetic */ hg3 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf3(hg3 hg3Var) {
        super(null, false);
        this.S = hg3Var;
    }

    @Override // v4b
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.P0) ? false : true;
    }

    @Override // v4b
    public final boolean d(long j) {
        hg3 hg3Var = this.S;
        nk3 nk3Var = hg3Var.E4;
        if (nk3Var == null || hg3Var.P0) {
            return false;
        }
        int i = hg3Var.G0;
        if (j > 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            if (W1 == null || W1.linked_community_id == 0) {
                return false;
            }
            nk3Var.showDialog(new pp2(nk3Var, W1.linked_community_id));
            return true;
        }
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
        if (L0 == null || L0.linked_community_id == 0) {
            return false;
        }
        nk3Var.showDialog(new pp2(nk3Var, L0.linked_community_id));
        return true;
    }

    @Override // v4b
    public final void e() {
        hg3 hg3Var = this.S;
        dg3 dg3Var = hg3Var.e0;
        if (dg3Var == null) {
            return;
        }
        dg3Var.u(hg3Var);
    }

    @Override // v4b
    public final void f(long j) {
        hg3 hg3Var = this.S;
        dg3 dg3Var = hg3Var.e0;
        if (dg3Var == null) {
            return;
        }
        if (hg3Var.K0 != 0) {
            dg3Var.r();
        } else {
            dg3Var.k(hg3Var);
        }
    }
}
