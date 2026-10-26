package tg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class n1 extends lm0 {
    public final /* synthetic */ s0 c;

    public n1(s0 s0Var) {
        this.c = s0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        s0 s0Var = this.c;
        ArrayList arrayList = s0Var.f3;
        if (arrayList.isEmpty()) {
            return;
        }
        p1 p1Var = (p1) e1Var.a;
        p1Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        p1Var.s = true;
        p1Var.a(true ^ s0Var.k3, false, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(this.c, viewGroup.getContext());
        p1Var.setLayoutParams(new s4.q0(-1, -2));
        return new vl0(p1Var);
    }
}
