package ug;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h1 extends tj0 {
    public final /* synthetic */ t0 c;

    public h1(t0 t0Var) {
        this.c = t0Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override // v4.h0
    public final int b() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        t0 t0Var = this.c;
        ArrayList arrayList = t0Var.f3;
        if (arrayList.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) e1Var.a;
        j1Var.r = (TLRPC.Document) arrayList.get(i7 % arrayList.size());
        j1Var.s = true;
        j1Var.a(true ^ t0Var.k3, false, false);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        j1 j1Var = new j1(this.c, viewGroup.getContext());
        j1Var.setLayoutParams(new v4.p0(-1, -2));
        return new cj0(j1Var);
    }
}
