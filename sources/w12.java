// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class w12 implements e39, b22 {
    public final /* synthetic */ k22 a;

    public /* synthetic */ w12(k22 k22Var) {
        this.a = k22Var;
    }

    @Override // b22
    public final void b(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z, int i, long j) {
        k22 k22Var = this.a;
        k22Var.b.a(true);
        k22Var.K.b(tL_userContact_old2, z, i, j);
    }

    @Override // e39
    public final boolean d(int i, View view) {
        Object O;
        k22 k22Var = this.a;
        w39 adapter = k22Var.s.getAdapter();
        g22 g22Var = k22Var.G;
        if (adapter == g22Var) {
            O = g22Var.E(i);
        } else {
            e22 e22Var = k22Var.F;
            O = e22Var.O(e22Var.S(i), e22Var.Q(i));
        }
        if (O == null) {
            return false;
        }
        k22Var.Q((j22) view, O);
        return true;
    }

    @Override // b22
    public final void a(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
    }
}
