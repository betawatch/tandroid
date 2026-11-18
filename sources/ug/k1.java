package ug;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k1 extends bk0 {
    public final /* synthetic */ v0 c;

    public k1(v0 v0Var) {
        this.c = v0Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        v0 v0Var = this.c;
        ArrayList arrayList = v0Var.f3;
        if (arrayList.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) f1Var.a;
        m1Var.r = (TLRPC.Document) arrayList.get(i7 % arrayList.size());
        m1Var.s = true;
        m1Var.a(true ^ v0Var.k3, false, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        m1 m1Var = new m1(this.c, viewGroup.getContext());
        m1Var.setLayoutParams(new v4.q0(-1, -2));
        return new kj0(m1Var);
    }
}
