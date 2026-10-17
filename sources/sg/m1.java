package sg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class m1 extends hm0 {
    public final /* synthetic */ s0 c;

    public m1(s0 s0Var) {
        this.c = s0Var;
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
        s0 s0Var = this.c;
        ArrayList arrayList = s0Var.V2;
        if (arrayList.isEmpty()) {
            return;
        }
        o1 o1Var = (o1) b1Var.a;
        o1Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        o1Var.s = true;
        o1Var.a(true ^ s0Var.a3, false, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        o1 o1Var = new o1(this.c, viewGroup.getContext());
        o1Var.setLayoutParams(new s4.o0(-1, -2));
        return new sl0(o1Var);
    }
}
