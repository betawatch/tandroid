package ug;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g1 extends pj0 {
    public final /* synthetic */ s0 c;

    public g1(s0 s0Var) {
        this.c = s0Var;
    }

    @Override // org.telegram.ui.Components.pj0
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
        return new yi0(i1Var);
    }
}
