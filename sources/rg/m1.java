package rg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.pm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class m1 extends pm0 {
    public final /* synthetic */ s0 c;

    public m1(s0 s0Var) {
        this.c = s0Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override // s4.i0
    public final int h() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        s0 s0Var = this.c;
        ArrayList arrayList = s0Var.V2;
        if (arrayList.isEmpty()) {
            return;
        }
        o1 o1Var = (o1) d1Var.a;
        o1Var.r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        o1Var.s = true;
        o1Var.a(true ^ s0Var.a3, false, false);
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        o1 o1Var = new o1(this.c, viewGroup.getContext());
        o1Var.setLayoutParams(new s4.q0(-1, -2));
        return new am0(o1Var);
    }
}
