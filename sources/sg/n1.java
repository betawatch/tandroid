package sg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class n1 extends hm0 {
    public final /* synthetic */ t0 c;

    public n1(t0 t0Var) {
        this.c = t0Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        t0 t0Var = this.c;
        ArrayList arrayList = t0Var.V2;
        if (arrayList.isEmpty()) {
            return;
        }
        p1 p1Var = (p1) b1Var.a;
        p1Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        p1Var.s = true;
        p1Var.a(true ^ t0Var.a3, false, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(this.c, viewGroup.getContext());
        p1Var.setLayoutParams(new s4.o0(-1, -2));
        return new sl0(p1Var);
    }
}
