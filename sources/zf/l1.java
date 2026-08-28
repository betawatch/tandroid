package zf;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l1 extends vk0 {
    public final /* synthetic */ s0 c;

    public l1(s0 s0Var) {
        this.c = s0Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        s0 s0Var = this.c;
        ArrayList arrayList = s0Var.T2;
        if (arrayList.isEmpty()) {
            return;
        }
        n1 n1Var = (n1) q1Var.a;
        n1Var.r = (TLRPC.Document) arrayList.get(i9 % arrayList.size());
        n1Var.s = true;
        n1Var.a(true ^ s0Var.Y2, false, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        n1 n1Var = new n1(this.c, viewGroup.getContext());
        n1Var.setLayoutParams(new f2.a1(-1, -2));
        return new ik0(n1Var);
    }
}
