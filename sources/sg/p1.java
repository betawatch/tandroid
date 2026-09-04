package sg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class p1 extends kl0 {
    public final /* synthetic */ u0 c;

    public p1(u0 u0Var) {
        this.c = u0Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        u0 u0Var = this.c;
        ArrayList arrayList = u0Var.X2;
        if (arrayList.isEmpty()) {
            return;
        }
        r1 r1Var = (r1) c1Var.a;
        r1Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        r1Var.s = true;
        r1Var.a(true ^ u0Var.c3, false, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        r1 r1Var = new r1(this.c, viewGroup.getContext());
        r1Var.setLayoutParams(new s4.p0(-1, -2));
        return new vk0(r1Var);
    }
}
