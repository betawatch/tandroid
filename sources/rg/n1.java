package rg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class n1 extends yl0 {
    public final /* synthetic */ t0 c;

    public n1(t0 t0Var) {
        this.c = t0Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        t0 t0Var = this.c;
        ArrayList arrayList = t0Var.e3;
        if (arrayList.isEmpty()) {
            return;
        }
        p1 p1Var = (p1) c1Var.a;
        p1Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        p1Var.s = true;
        p1Var.a(true ^ t0Var.j3, false, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(this.c, viewGroup.getContext());
        p1Var.setLayoutParams(new s4.p0(-1, -2));
        return new il0(p1Var);
    }
}
