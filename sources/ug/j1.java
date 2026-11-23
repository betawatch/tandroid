package ug;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class j1 extends dk0 {
    public final /* synthetic */ u0 c;

    public j1(u0 u0Var) {
        this.c = u0Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        u0 u0Var = this.c;
        ArrayList arrayList = u0Var.f3;
        if (arrayList.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) f1Var.a;
        l1Var.r = (TLRPC.Document) arrayList.get(i7 % arrayList.size());
        l1Var.s = true;
        l1Var.a(true ^ u0Var.k3, false, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        l1 l1Var = new l1(this.c, viewGroup.getContext());
        l1Var.setLayoutParams(new v4.q0(-1, -2));
        return new mj0(l1Var);
    }
}
