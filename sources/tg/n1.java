package tg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n1 extends mm0 {
    public final /* synthetic */ s0 c;

    public n1(s0 s0Var) {
        this.c = s0Var;
    }

    @Override // org.telegram.ui.Components.mm0
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
        return new wl0(p1Var);
    }
}
