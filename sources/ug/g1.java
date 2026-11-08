package ug;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class g1 extends oj0 {
    public final /* synthetic */ s0 c;

    public g1(s0 s0Var) {
        this.c = s0Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        s0 s0Var = this.c;
        ArrayList arrayList = s0Var.e3;
        if (arrayList.isEmpty()) {
            return;
        }
        i1 i1Var = (i1) d1Var.a;
        i1Var.r = (TLRPC.Document) arrayList.get(i7 % arrayList.size());
        i1Var.s = true;
        i1Var.a(true ^ s0Var.j3, false, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        i1 i1Var = new i1(this.c, viewGroup.getContext());
        i1Var.setLayoutParams(new v4.o0(-1, -2));
        return new xi0(i1Var);
    }
}
