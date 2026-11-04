package vg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j1 extends sj0 {
    public final /* synthetic */ r0 c;

    public j1(r0 r0Var) {
        this.c = r0Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // u4.h0
    public final int b() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        r0 r0Var = this.c;
        ArrayList arrayList = r0Var.f3;
        if (arrayList.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) d1Var.a;
        l1Var.r = (TLRPC.Document) arrayList.get(i3 % arrayList.size());
        l1Var.s = true;
        l1Var.a(true ^ r0Var.k3, false, false);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        l1 l1Var = new l1(this.c, viewGroup.getContext());
        l1Var.setLayoutParams(new u4.p0(-1, -2));
        return new bj0(l1Var);
    }
}
