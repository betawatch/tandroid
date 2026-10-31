package vh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ j6(r6 r6Var, int i10) {
        this.a = i10;
        this.b = r6Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        int i11 = 1;
        r6 r6Var = this.b;
        switch (i10) {
            case 0:
                w6 w6Var = r6Var.W;
                w6Var.j1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = w6Var.r1;
                hashSet.clear();
                if (w6Var.B1 && w6Var.x1) {
                    w6Var.x1 = false;
                }
                q20 q20Var = w6Var.N1;
                if (q20Var != null) {
                    q20Var.a(w6Var.j1);
                }
                z6 z6Var = w6Var.O1;
                if (z6Var != null) {
                    z6Var.a(new HashSet(hashSet));
                }
                r6Var.h(true);
                break;
            case 1:
                w6 w6Var2 = r6Var.W;
                int i12 = w6.U1;
                w6Var2.N0(new u6(5, w6Var2.a, (ArrayList) obj), new th.r2(w6Var2, i11), false);
                break;
            case 2:
                w6 w6Var3 = r6Var.W;
                HashSet hashSet2 = w6Var3.r1;
                hashSet2.add(Integer.valueOf(((th.y4) obj).a));
                r6Var.h(true);
                z6 z6Var2 = w6Var3.O1;
                if (z6Var2 != null) {
                    z6Var2.a(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                if (str != null) {
                    r6Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                r6Var.I = str;
                r6Var.h(false);
                break;
        }
    }
}
