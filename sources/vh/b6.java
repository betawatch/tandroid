package vh;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b6 extends sk0 {
    public final /* synthetic */ c6 c;

    public b6(c6 c6Var) {
        this.c = c6Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 2;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.j1.size() + 2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        c6 c6Var = this.c;
        int i11 = c6Var.i1;
        if (c1Var.f == 2) {
            v6 v6Var = (v6) c1Var.a;
            v6Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) c6Var.j1.get(i10 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                v6Var.setUser(d20.i(i11).f());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                v6Var.setUser(vp.r1(i11).Z1(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                v6Var.a(0, vp.r1(i11).L0(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                v6Var.a(0, vp.r1(i11).L0(Long.valueOf(inputPeer.channel_id)));
            }
            v6Var.f.setVisibility(8);
            v6Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = c6Var.k1;
            if (inputPeer2 != null || i10 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? d20.i(c6Var.i1).e() : org.telegram.messenger.o5.n(inputPeer2)) != (z11 ? d20.i(c6Var.i1).e() : org.telegram.messenger.o5.n(inputPeer))) {
                    z10 = false;
                    v6Var.c(z10, false);
                    v6Var.setDivider(i10 != b() - 1);
                }
            }
            z10 = true;
            v6Var.c(z10, false);
            v6Var.setDivider(i10 != b() - 1);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        c6 c6Var = this.c;
        if (i10 == 0 || i10 == 1) {
            View view2 = new View(c6Var.getContext());
            view2.setLayoutParams(new s4.o0(-1, i10 == 0 ? (org.telegram.messenger.i0.q.y + org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(306.0f) : org.telegram.messenger.i0.L(54.0f)));
            view = view2;
        } else {
            view = new v6(c6Var.getContext(), c6Var.I0);
        }
        return new ck0(view);
    }
}
