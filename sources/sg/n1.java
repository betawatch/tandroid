package sg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n1 extends lm0 {
    public final /* synthetic */ s0 c;

    public n1(s0 s0Var) {
        this.c = s0Var;
    }

    @Override // org.telegram.ui.Components.lm0
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
        ArrayList arrayList = s0Var.Y2;
        if (arrayList.isEmpty()) {
            return;
        }
        p1 p1Var = (p1) b1Var.a;
        p1Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        p1Var.s = true;
        p1Var.a(true ^ s0Var.d3, false, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(this.c, viewGroup.getContext());
        p1Var.setLayoutParams(new s4.o0(-1, -2));
        return new wl0(p1Var);
    }
}
