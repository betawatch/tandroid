package th;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ l0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n0 n0Var = this.b;
                n0Var.q.dismiss();
                n0Var.q = null;
                n0Var.r = 0;
                if (tL_error == null) {
                    m0 m0Var = n0Var.h;
                    if (m0Var != null) {
                        m0Var.close();
                        break;
                    }
                } else {
                    n0Var.c.d0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                n0 n0Var2 = this.b;
                n0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = n0Var2.j;
                    if (arrayList == null) {
                        n0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    n0Var2.k = str;
                    n0Var2.l = peerLinkRequests.total_count;
                    n0Var2.n = str == null;
                    n0Var2.a();
                    m0 m0Var2 = n0Var2.h;
                    if (m0Var2 != null) {
                        m0Var2.e();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                n0 n0Var3 = this.b;
                if (tL_error2 == null) {
                    n0Var3.getClass();
                    break;
                } else {
                    n0Var3.c.d0(tL_error2, false);
                    break;
                }
        }
    }
}
