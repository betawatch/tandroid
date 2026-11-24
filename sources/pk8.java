// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pk8 extends q59 {
    public final /* synthetic */ fj8 c;

    public pk8(fj8 fj8Var) {
        this.c = fj8Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override // y59
    public final int b() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        ArrayList arrayList = this.c.f3;
        if (arrayList.isEmpty()) {
            return;
        }
        rk8 rk8Var = (rk8) u69Var.a;
        rk8Var.r = (TLRPC.Document) arrayList.get(i % arrayList.size());
        rk8Var.s = true;
        rk8Var.a(!r2.k3, false, false);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        rk8 rk8Var = new rk8(this.c, viewGroup.getContext());
        rk8Var.setLayoutParams(new g69(-1, -2));
        return new b59(rk8Var);
    }
}
