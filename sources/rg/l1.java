package rg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l1 extends ll0 {
    public final /* synthetic */ s0 c;

    public l1(s0 s0Var) {
        this.c = s0Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        s0 s0Var = this.c;
        ArrayList arrayList = s0Var.X2;
        if (arrayList.isEmpty()) {
            return;
        }
        n1 n1Var = (n1) c1Var.a;
        n1Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        n1Var.s = true;
        n1Var.a(true ^ s0Var.c3, false, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = new n1(this.c, viewGroup.getContext());
        n1Var.setLayoutParams(new s4.p0(-1, -2));
        return new wk0(n1Var);
    }
}
